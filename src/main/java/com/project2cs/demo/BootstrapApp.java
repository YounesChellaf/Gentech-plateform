package com.project2cs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.project2cs.demo.controller.storage.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class BootstrapApp {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapApp.class, args);
	}
}
