package com.cloud.traceclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * All copyright by Liuyajun.
 * <p>
 * Created by MDMORY on 2017/11/10
 * </p>
 */
@SpringBootApplication
public class TraceClient1Application {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

	public static void main(String[] args) {
		SpringApplication.run(TraceClient1Application.class, args);
	}
}
