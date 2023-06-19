package com.ecews.mqlamisplus;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqlamisplusconsumerApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(MqlamisplusconsumerApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

	}
}
