package com.visiomaxMaterial.partdefinition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration      //declares one or more bean methods inside
public class PartDefinitionConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
