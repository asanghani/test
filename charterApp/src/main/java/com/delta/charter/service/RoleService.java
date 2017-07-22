package com.delta.charter.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delta.charter.domain.UserRole;


public interface RoleService extends JpaRepository<UserRole, Long> {
	
	UserRole createRole(UserRole userRole);

}
