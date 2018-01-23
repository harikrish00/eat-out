package com.krishcoder.eatout.config;

import com.krishcoder.eatout.resources.RestaurantController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

        public JerseyConfig() {
            register(RestaurantController.class);
        }
}
