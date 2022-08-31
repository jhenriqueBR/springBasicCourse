package org.example.vendas.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {
	@Value("${spring.profiles.active}")
	private String ambiente;

	@Bean(name = "programmerName")
	public String programmerName () {
		return " ( Desenvolvedor: jHenrique ) ";
	}

	/*
	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.printf("O profife que está sendo exercutado é : %s", ambiente );
		};
	}*/
}
