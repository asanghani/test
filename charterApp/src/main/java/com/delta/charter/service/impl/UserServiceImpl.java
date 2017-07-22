package com.delta.charter.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.delta.charter.domain.CharterUser;
import com.delta.charter.domain.UserRole;
import com.delta.charter.repository.RoleRepository;
import com.delta.charter.repository.UserRepository;

@Service
public class UserServiceImpl {
	
private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public CharterUser createUser(CharterUser charterUser){
		CharterUser curruser = userRepository.findByusername(charterUser.getUsername());
		
		if(curruser != null){
			LOG.info("username already exist",curruser.getUsername());
		} else {
			userRepository.save(charterUser);
		}
		return charterUser;
	}

}
