package com.veryqy.gen.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @ProjectName: gen-parent
 * @Package: com.veryq.gen.util
 * @ClassName: JSON
 * @Description: java类作用描述
 * @Author: 唐朝
 * @CreateDate: 2018/12/8 23:05
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/8 23:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class JSON {

    private static ObjectMapper objectMapper=new ObjectMapper();

    public static String stringify(Object obj){
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static <T> T parse(String str,Class<T> cls) throws IOException {
            return objectMapper.readValue(str,cls);
    }

}
