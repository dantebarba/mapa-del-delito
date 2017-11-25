package com.github.dantebarba.mapadeldelito.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.github.dantebarba.mapadeldelito.api.ApiInfo;
import com.github.dantebarba.mapadeldelito.api.DelitoApi;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }
    private void registerEndpoints() {
        // register(...);
    	packages("com.github.dantebarba.mapadeldelito.api");
    	register(DelitoApi.class);
    	register(ApiInfo.class);
    }
}
