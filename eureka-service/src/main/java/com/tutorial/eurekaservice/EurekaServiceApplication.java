package com.tutorial.eurekaservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {
	private static final Logger log = LogManager.getLogger(EurekaServiceApplication.class.getName());

	public static void main(String[] args) {
		log.info("Inicando aplicacion");
		log.error("Inicando aplicacion");
		log.debug("Inicando aplicacion");
		SpringApplication.run(EurekaServiceApplication.class, args);
	}

}
