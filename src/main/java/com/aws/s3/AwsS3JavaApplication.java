package com.aws.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@ComponentScan({"com.aws"})
public class AwsS3JavaApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(AwsS3JavaApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(AwsS3JavaApplication.class, args);
		logger.debug("---***************************<<---- APPLICATION STARTED---->>***************************---");
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
