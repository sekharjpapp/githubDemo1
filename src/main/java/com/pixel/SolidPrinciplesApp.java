package com.pixel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SolidPrinciplesApp {

	@Autowired
	private SingleResponsebilityService singleResponsebilityService;

	public static void main(String[] args) {
		SpringApplication.run(SolidPrinciplesApp.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void go() {
		System.out.println(singleResponsebilityService.getInvoice());
		System.out.println("How To Merge Your Branch To Master Using Github Desktop !!!");
		System.out.println("Cherry Pick !!! ");
	}

}
