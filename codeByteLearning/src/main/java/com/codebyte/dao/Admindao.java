package com.codebyte.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codebyte.entities.Admin;
@Repository
public interface Admindao extends JpaRepository<Admin, Integer> {
	// This interface will automatically provide CRUD operations for the Admin entity
	// You can add custom query methods here if needed

}
