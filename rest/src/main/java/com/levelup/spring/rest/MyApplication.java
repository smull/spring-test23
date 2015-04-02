package com.levelup.spring.rest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ext.ContextResolver;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SMULL on 3/31/2015.
 */
public class MyApplication  extends ResourceConfig {

    public MyApplication() {
        packages("com.levelup.spring.rest.resources").packages("org.glassfish.jersey.examples.jackson")
                .register(JsonObjectMapperProvider.class)  // No need to register this provider if no special configuration is required.
                .register(JacksonFeature.class)
                .register(createMoxyJsonResolver());
    }

    public static ContextResolver<MoxyJsonConfig> createMoxyJsonResolver() {
        final MoxyJsonConfig moxyJsonConfig = new MoxyJsonConfig();
        Map<String, String> namespacePrefixMapper = new HashMap<String, String>(1);
        namespacePrefixMapper.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
        moxyJsonConfig.setNamespacePrefixMapper(namespacePrefixMapper).setNamespaceSeparator(':');
        return moxyJsonConfig.resolver();
    }
}
