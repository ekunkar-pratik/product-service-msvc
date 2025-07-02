package com.shoppershub.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProductServiceMsvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceMsvcApplication.class, args);
	}

}
