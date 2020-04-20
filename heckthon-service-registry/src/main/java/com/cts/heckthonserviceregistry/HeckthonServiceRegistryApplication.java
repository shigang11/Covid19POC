package com.cts.heckthonserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class HeckthonServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeckthonServiceRegistryApplication.class, args);
	}

}
