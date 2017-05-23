package com.pengjiawei.scheduletasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pengjiawei")
public class ScheduletasksApplication {
	public static void main(String[] args) {
		SpringApplication.run(ScheduletasksApplication.class, args);
	}
}
