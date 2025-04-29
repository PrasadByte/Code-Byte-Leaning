package com.codebyte.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codebyte.dao.UserRepository;
import com.codebyte.dtos.UserPrincipal;
import com.codebyte.entities.User;


@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
    private UserRepository userRepo;

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    	Optional<User> user = userRepo.findByEmail(email);
		if (user.isEmpty()) {
			System.out.println("User Not Found");
			throw new UsernameNotFoundException("user not found");
		}
		
		// Assuming you have a method to get the username from the User entity
		String username = user.get().getEmail();
	
       // User user = userRepo.findByUsername(username);
        if (user == null) {
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("user not found");
        }
        
        return new UserPrincipal(user);
    }
}
