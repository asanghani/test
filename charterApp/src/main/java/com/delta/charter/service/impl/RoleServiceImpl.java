package com.delta.charter.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.delta.charter.domain.UserRole;
import com.delta.charter.repository.RoleRepository;

@Service
public class RoleServiceImpl {
	
	private static final Logger LOG = LoggerFactory.getLogger(RoleServiceImpl.class);
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Transactional
	public UserRole createRole(UserRole userRole){
		UserRole newrole = roleRepository.findByroleId(userRole.getRoleId());
		
		if(newrole != null){
			LOG.info("Role already exist",userRole.getRoleId());
		} else {
			roleRepository.save(userRole);
		}
		return userRole;
	}

}
