package com.protobuf;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

public class ProtoStuffUtils {

	public static <T> byte[] serialize(T o) {  
        Schema schema = RuntimeSchema.getSchema(o.getClass());  
        return ProtobufIOUtil.toByteArray(o, schema, LinkedBuffer.allocate(256));  
    }  
}
