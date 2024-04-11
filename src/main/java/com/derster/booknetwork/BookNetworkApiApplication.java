package com.derster.booknetwork;

import com.derster.booknetwork.role.Role;
import com.derster.booknetwork.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class BookNetworkApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookNetworkApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (RoleRepository roleRepository){
	return args -> {
		if (roleRepository.findByName("USER").isEmpty()){
			Role role = Role.builder().name("USER").build();
			roleRepository.save(role);
		}
	};
	}

}
