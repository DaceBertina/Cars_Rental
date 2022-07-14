package com.webapp.carsApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CarsAppApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public CarsAppApplication(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public static void main(String[] args) {

		SpringApplication.run(CarsAppApplication.class, args);

	}

}
