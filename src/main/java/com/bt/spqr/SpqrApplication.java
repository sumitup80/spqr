package com.bt.spqr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@EnableScheduling
@SpringBootApplication(scanBasePackages={"com.bt.spqr"})
public class SpqrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpqrApplication.class, args);
	}

}
