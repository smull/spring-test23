package com.levelup.spring.rest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by SMULL on 3/31/2015.
 */
public class MyApplication  extends ResourceConfig {

    public MyApplication() {
        packages("com.levelup.spring.rest.resources").packages("org.glassfish.jersey.examples.jackson")
                .register(JsonObjectMapperProvider.class)  // No need to register this provider if no special configuration is required.
                .register(JacksonFeature.class);
    }
}
