package com.delta.charter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delta.charter.domain.UserRole;


public interface RoleRepository extends JpaRepository<UserRole, Long> {
	List<UserRole> findAll();
	UserRole findByroleId(int roleId);
//  save(UserRole role);
}
