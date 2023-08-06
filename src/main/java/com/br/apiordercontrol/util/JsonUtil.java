package com.br.apiordercontrol.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    public static final  ObjectMapper MAPPER = new ObjectMapper();


    public static String toJson(Object object) {
        try {
            return MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T toObject(String json, Class<T> object) {
        try {
            return MAPPER.readValue(json, object);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}
