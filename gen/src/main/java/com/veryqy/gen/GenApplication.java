package com.veryqy.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class GenApplication implements ApplicationListener<ApplicationReadyEvent> {



	public static void main(String[] args) {

		SpringApplication.run(GenApplication.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
//		excelImportService.gen();
	}


}
