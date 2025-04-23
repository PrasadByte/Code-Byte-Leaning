package com.codebyte.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity  // Allows the use of annotations like @PreAuthorize for method-level security
public class SecurityConfig {
	@SuppressWarnings("removal")
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.csrf().disable() // Disables CSRF protection
			.authorizeHttpRequests()
				.requestMatchers("/api/v1/auth/**").permitAll() // Allows all requests to the auth endpoints
				.anyRequest().authenticated(); // Requires authentication for any other request
		return http.build();
	}
    
}
