package com.levelup.spring.rest.resources;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.ext.ContextResolver;

/**
 * Created by SMULL on 3/31/2015.
 */
public class JsonObjectMapperProvider implements ContextResolver<ObjectMapper> {

    final ObjectMapper defaultObjectMapper;

    public JsonObjectMapperProvider() {
        defaultObjectMapper = createDefaultMapper();
    }

    private static ObjectMapper createDefaultMapper() {
        final ObjectMapper result = new ObjectMapper();
        //       result.configure(Feature.INDENT_OUTPUT, true);

        return result;
    }


    @Override
    public ObjectMapper getContext(Class<?> aClass) {
        return defaultObjectMapper;
    }
}