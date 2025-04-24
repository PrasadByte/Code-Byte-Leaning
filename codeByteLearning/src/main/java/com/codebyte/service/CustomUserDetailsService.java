package com.codebyte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

  // Assuming you have a User repository to fetch users from DB

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;  // Your repository to fetch users

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);  // Find user by email (or use username if needed)

        if (user == null) {
            throw new UsernameNotFoundException("User not found with email: " + username);
        }

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getEmail())
                .password(user.getPassword())  // Make sure to use the hashed password stored in DB
                .roles(user.getRole().name())  // Assign role(s)
                .build();
    }
}
