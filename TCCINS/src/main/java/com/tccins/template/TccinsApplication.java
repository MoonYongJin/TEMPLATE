package com.tccins.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tccins.template.Login.SHA512PasswordEncoder;

@SpringBootApplication
public class TccinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TccinsApplication.class, args);
	}
}
