package com.codebyte.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Admindao extends JpaRepository<Admindao, Integer> {
	// This interface will automatically provide CRUD operations for the Admin entity
	// You can add custom query methods here if needed

}
