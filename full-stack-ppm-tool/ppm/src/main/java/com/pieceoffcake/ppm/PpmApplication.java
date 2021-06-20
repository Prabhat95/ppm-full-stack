package com.pieceoffcake.ppm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PpmApplication {

	public static void main(String[] args) {
		System.out.println("Starting App...");
		SpringApplication.run(PpmApplication.class, args);
		System.out.println("Started App...");
	}

}
