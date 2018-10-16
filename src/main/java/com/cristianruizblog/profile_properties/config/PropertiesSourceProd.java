package com.cristianruizblog.profile_properties.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("prod.properties")
@Profile("default")
public class PropertiesSourceProd {

}
