package com.protobuf;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.github.os72.protobuf.dynamic.DynamicSchema;
import com.github.os72.protobuf.dynamic.MessageDefinition;
import com.google.protobuf.Descriptors.DescriptorValidationException;

public class XML2Schema {
	public static DynamicSchema buildDynamicSchema(String file) 
			throws DocumentException {
		File f = new File(
				XML2Schema.class.getClassLoader().getResource(file).getFile());
		SAXReader reader = new SAXReader();   
		Document doc = reader.read(f);   
		Element root = doc.getRootElement();
		Element rootMsg = root.element("messages");
		Element msg;
		
		DynamicSchema.Builder schemaBuilder = DynamicSchema.newBuilder();
		schemaBuilder.setName("SensorLog.proto");
		
		MessageDefinition.Builder rootDefBuilder = MessageDefinition.newBuilder(
				rootMsg.attributeValue("root_msg"));
		MessageDefinition.Builder msgDefBuilder = null;
		MessageDefinition sensorlogMd = null;
		
		Element fields = null;
		Element field = null;
		Map<String, Object> msgTypeMap = new HashMap<String, Object>();
		for (Iterator i = rootMsg.elementIterator("message"); i.hasNext();) {
			msg = (Element)i.next();
//			System.out.println(msg.attributeValue("type"));
			msgDefBuilder = MessageDefinition.newBuilder(msg.attributeValue("type"));
			fields = msg.element("fields");
			
			Element msg1 = null;
			MessageDefinition.Builder msgDefBuilder1 = null;
			for (Iterator j = fields.elementIterator("message"); j.hasNext();) {
				msg1 = (Element)j.next();
				msgDefBuilder1 = MessageDefinition.newBuilder(msg1.attributeValue("type"));
				msgDefBuilder1.addField(
						field.elementText("label"), 
						field.elementText("type"), 
						field.elementText("name"), 
						Integer.parseInt(field.elementText("id")));
			}
			
			if (null != msg1 && !"SENSOR_LOG".equals(msg1.attributeValue("type"))) {
				msgTypeMap.put(msg1.attributeValue("type"), msgDefBuilder1.build());
			}
			
			for (Iterator k = fields.elementIterator("field"); k.hasNext();) {
				field = (Element)k.next();
//				System.out.println(field.elementText("id"));
//				System.out.println(field.elementText("name"));
//				System.out.println(field.elementText("label"));
//				System.out.println(field.elementText("type"));
				msgDefBuilder.addField(
						field.elementText("label"), 
						field.elementText("type"), 
						field.elementText("name"), 
						Integer.parseInt(field.elementText("id")));
			}
			
			if ("SENSOR_LOG".equals(msg.attributeValue("type"))) {
				for (Object md : msgTypeMap.values()) {
					msgDefBuilder.addMessageDefinition((MessageDefinition)md);
				}
				sensorlogMd = msgDefBuilder.build();
			}
			else {
				msgTypeMap.put(msg.attributeValue("type"), msgDefBuilder.build());
			}
		}
		
		schemaBuilder.addMessageDefinition(sensorlogMd);
		DynamicSchema schema = null;
		try {
			schema = schemaBuilder.build();
//			System.out.println(schema);
		} catch (DescriptorValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return schema;
	}
	
	
}
