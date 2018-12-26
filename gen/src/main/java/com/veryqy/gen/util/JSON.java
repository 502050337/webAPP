package com.veryqy.gen.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JSON {

    private static ObjectMapper objectMapper=new ObjectMapper();

    public static String stringify(Object obj){
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("非法数据",e);
        }
    }

    public static <T> T parse(String str,Class<T> cls) throws IOException {
            return objectMapper.readValue(str,cls);
    }

}
