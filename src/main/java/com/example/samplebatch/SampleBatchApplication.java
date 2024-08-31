package com.example.samplebatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling    // 스케쥴 활용을 위한 어노테이션
public class SampleBatchApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SampleBatchApplication.class, args);
	}

}
