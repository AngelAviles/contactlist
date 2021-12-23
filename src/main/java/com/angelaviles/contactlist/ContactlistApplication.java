package com.angelaviles.contactlist;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ContactlistApplication {

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
		
		SpringApplication.run(ContactlistApplication.class, args);
	}

}
