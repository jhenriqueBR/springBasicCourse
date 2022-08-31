package org.example.vendas.config;

import org.example.vendas.customAnnotation.Development;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Configuration
//@Profile("development")
@Development
public class MinhaConfiguration {

	@Bean
	public CommandLineRunner executar () {
		return args -> {
			System.out.println("DESENVOLVIMENTO");
		};
	}
}
