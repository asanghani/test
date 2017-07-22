package com.delta.charter.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.delta.charter.domain.CharterUser;



public interface UserService extends JpaRepository<CharterUser, Long>{
	
	CharterUser createUser(CharterUser charterUser);

}
