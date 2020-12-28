package com.logistic.indepay;

import com.logistic.indepay.service.CaptureDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IndepayApplication implements CommandLineRunner {

	@Autowired
	CaptureDetails captureDetails;

	public static void main(String[] args) {
		SpringApplication.run(IndepayApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//captureDetails.fetchAgentInfo();;

	}
}
