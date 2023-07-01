package com.nitesh.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nitesh.springboot.binding.UserProperties;



@Configuration
public class MyConfiguration {
	
	
	@Bean
	public UserProperties userProperties(@Value("${mydatasource.username}") String username, 
			 							 @Value("${mydatasource.password}") String password) {
		
		UserProperties userProp = new UserProperties();
		userProp.setUsername(username);
		userProp.setPassword(password);
		
		
		System.out.println("printing my Datasource properties >>> "+ userProp.getUsername() + " " + userProp.getPassword());
		
		return userProp;
	}

}
