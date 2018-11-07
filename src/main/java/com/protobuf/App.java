package com.protobuf;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.DocumentException;

import com.github.os72.protobuf.dynamic.DynamicSchema;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * Hello world!
 *
 */
public class App 
{
	private static DynamicSchema schema = null;
	
	static {
		try {
        	schema = XML2Schema.buildDynamicSchema("student.xml");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void main( String[] args )
    {
        
        byte[] data = buildData1();
        
        long sum = 0;
        long cost = 0;
        for(int j=0; j<10; j++) {
            long startTime = System.currentTimeMillis();
	        for(int i=0; i<10000; i++){
	        	deserialize(data);
	        }
	        cost = System.currentTimeMillis() - startTime;
	        sum += cost;
	        System.out.println("dynamic deserialize cost time:" + cost);
        }
        
        System.out.println("average cost time:" + sum/10);
    }
    
    private static DynamicMessage deserialize(byte[] data) {
    	try {
        	return DynamicMessage.parseFrom(schema.getMessageDescriptor("SENSOR_LOG"), data);
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
    
    private static byte[] buildData1() {

        TCPFLOW tf = new TCPFLOW();
        tf.setSerial_num("980eh9809df");
        tf.setDip("1.1.1.1");
        tf.setDipv6("e5e545y45");
        tf.setDport(10);
        tf.setDtime("fefergerg");
        tf.setProto("76897093");
        tf.setSip("2.2.2.2");
        tf.setSipv6("g45g435g");
        tf.setSport(20);
        tf.setStatus("stop");
        tf.setStime("111111");
        tf.setUplink_length(10000L);
        
        mail_attachment attachment1 = new mail_attachment();
        attachment1.setAttach_md5("h23u049gh83ogj");
        attachment1.setMime_type("mmm");
        attachment1.setName("attachment");
        
        mail_attachment attachment2 = new mail_attachment();
        attachment2.setAttach_md5("h23u049gherge83ogj");
        attachment2.setMime_type("mergmm");
        attachment2.setName("attacehwhment");
        
        List<mail_attachment> attachments = new ArrayList<mail_attachment>(2);
        attachments.add(attachment1);
        attachments.add(attachment2);
        
        MAIL_BEHAVIOR mb = new MAIL_BEHAVIOR();
        mb.setAccess_time("1344463364");
        mb.setAttachment(attachments);
        mb.setDip("3.3.3.3");
        mb.setDipv6("244354h");
        mb.setDport(11);
        mb.setProto("werrte34");
        mb.setSerial_num("g9o483094");
        mb.setSip("4.4.4.4");
        mb.setSipv6("j403po4g4");
        mb.setSport(22);
        
        SENSOR_LOG sl = new SENSOR_LOG();
        sl.setMessage_type(1);
        sl.setSkyeye_tcpflow(tf);
        sl.setSkyeye_mail(mb);
        
        return ProtoStuffUtils.serialize(sl);
    }
    
}
