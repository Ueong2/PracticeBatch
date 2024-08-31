package com.example.samplebatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleBatchApplication.class, args);
	}

}
