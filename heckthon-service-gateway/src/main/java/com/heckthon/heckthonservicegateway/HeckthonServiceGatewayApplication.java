package com.heckthon.heckthonservicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class HeckthonServiceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeckthonServiceGatewayApplication.class, args);
	}

}
