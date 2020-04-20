package com.heckthon.serviceorchestration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */

@EnableEurekaClient
@SpringBootApplication
public class ServiceOrchestrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOrchestrationApplication.class, args);
	}

}
