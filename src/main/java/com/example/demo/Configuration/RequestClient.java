package com.example.demo.Configuration;

import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.Backoff;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RequestClient {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
