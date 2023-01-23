package com.example.TemaSPT;

import com.example.TemaSPT.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
public class TemaSptApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemaSptApplication.class, args);
	}

}
