package com.finsurge.task52;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Task52Application {

	public static void main(String[] args) {
		SpringApplication.run(Task52Application.class, args);
	}

}
