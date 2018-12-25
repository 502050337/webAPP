package com.veryqy.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import java.nio.charset.Charset;

@SpringBootApplication
public class GenApplication implements ApplicationListener<ApplicationReadyEvent> {



	public static void main(String[] args) {
		System.out.println("Charset:"+Charset.defaultCharset());
		SpringApplication.run(GenApplication.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
	}


}
