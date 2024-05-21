package com.gabriel.spotify.infra.integration.config;

import feign.form.FormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public FormEncoder feignEncoder() {
        return new FormEncoder();
    }
}
