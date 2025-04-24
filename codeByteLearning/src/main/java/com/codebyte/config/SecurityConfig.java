package com.codebyte.config;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity  // Allows the use of annotations like @PreAuthorize for method-level security
public class SecurityConfig  {
	 
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http.csrf().disable() // Disable CSRF for simplicity (can be enabled later)
	            .authorizeHttpRequests()
	            .requestMatchers("/api/user/learner", "/api/user/trainer", "/api/user/admin", "/api/user/getAll").permitAll() // Allow public access to these endpoints
	            .requestMatchers(HttpMethod.POST, "/api/user/**").permitAll() // Allow POST for user creation
	            .anyRequest().authenticated() // Secure the rest of the endpoints
	            .and()
	            .httpBasic(); // Or form login if needed
	        
	        return http.build();
	    }

	
	
	 @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
}
