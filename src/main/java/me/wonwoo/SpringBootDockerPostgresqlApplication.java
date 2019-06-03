package me.wonwoo;

import me.wonwoo.account.Account;
import me.wonwoo.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootDockerPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerPostgresqlApplication.class, args);
	}

	@Autowired
	private AccountRepository repository;

	@Bean
	CommandLineRunner runner() {
		return args -> Arrays.asList(
				new Account(1L,"wonwoo","wonwoo@test.com"),
				new Account(2L,"kevin","kevin@test.com"),
				new Account(3L,"mink","mink@test.com")
		).forEach(repository::save);
	}
}
