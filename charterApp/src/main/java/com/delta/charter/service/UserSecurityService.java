package com.delta.charter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.delta.charter.domain.CharterUser;
import com.delta.charter.repository.UserRepository;

@Service
public class UserSecurityService implements UserDetailsService {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		CharterUser charterUser = userRepository.findByusername(username);
		if(null == charterUser){
			LOG.warn("username {} not found", username);
			throw new UsernameNotFoundException("username "+ username + "not found");
		}
		return charterUser;
	}
}
