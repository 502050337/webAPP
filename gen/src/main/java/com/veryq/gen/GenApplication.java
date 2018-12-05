package com.veryq.gen;

import com.veryq.gen.controller.ExcelImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class GenApplication implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	ExcelImportService excelImportService;

	public static void main(String[] args) {

		SpringApplication.run(GenApplication.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
//		excelImportService.gen();
	}


}
