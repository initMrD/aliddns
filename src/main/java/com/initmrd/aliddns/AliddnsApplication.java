package com.initmrd.aliddns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliddnsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AliddnsApplication.class, args);
		DDNS ddns = new DDNS();
		ddns.run();
	}

}
