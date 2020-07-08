package com.bt.spqr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableCaching
@EnableScheduling
@EnableSwagger2
@SpringBootApplication(scanBasePackages={"com.bt.spqr"})
public class SpqrApplication {	

	public static void main(String[] args) {		
		AnnotationConfigServletWebServerApplicationContext context =  (AnnotationConfigServletWebServerApplicationContext) SpringApplication.run(SpqrApplication.class, args);
		
//		for(String bean: context.getBeanDefinitionNames()) {
//			System.out.println(bean);
//		}
	}
	
	

}
