package com.cloud.traceclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * All copyright by Liuyajun.
 * <p>
 * Created by MDMORY on 2017/11/10
 * </p>
 */
@SpringBootApplication
public class TraceClient2Application {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

	public static void main(String[] args) {
		SpringApplication.run(TraceClient2Application.class, args);
	}
}
