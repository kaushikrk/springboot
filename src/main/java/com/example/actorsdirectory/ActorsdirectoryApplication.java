package com.example.actorsdirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ActorsdirectoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActorsdirectoryApplication.class, args);
	}
}
