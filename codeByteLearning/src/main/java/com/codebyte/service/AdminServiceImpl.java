package com.codebyte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.codebyte.dao.Admindao;
import com.codebyte.dtos.AdminDTO;
import com.codebyte.entities.Admin;

@Service
public class AdminServiceImpl implements AdminService {

    private final Admindao adminDao;

    @Autowired
    public AdminServiceImpl(Admindao adminDao) {
        this.adminDao = adminDao;
    }

	@Override
	public ResponseEntity<Admin> addAdmin(AdminDTO admin) {
		
	}

  
}
