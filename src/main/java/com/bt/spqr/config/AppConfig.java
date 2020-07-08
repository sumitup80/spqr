package com.bt.spqr.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@Component 
public class AppConfig {

	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		converter.setObjectMapper(new ObjectMapper());
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));        
		messageConverters.add(converter);  
		restTemplate.setMessageConverters(messageConverters);
		restTemplate.getMessageConverters().add(converter);
		return restTemplate;
	}
}
