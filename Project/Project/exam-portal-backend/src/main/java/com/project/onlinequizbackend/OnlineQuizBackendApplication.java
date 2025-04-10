package com.project.onlinequizbackend;

import com.project.onlinequizbackend.models.Role;
import com.project.onlinequizbackend.repository.RoleRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class OnlineQuizBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizBackendApplication.class, args);
	}

	@Bean
	public ApplicationRunner initializer(RoleRepository roleRepository) {
		return args -> roleRepository.saveAll(Arrays.asList(
				Role.builder().roleName("USER").roleDescription("Default Role provided to each user").build(),
				Role.builder().roleName("ADMIN").roleDescription("Superuser, who has access for all functionality").build()));
	}
}
