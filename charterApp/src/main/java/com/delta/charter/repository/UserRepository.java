package com.delta.charter.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.delta.charter.domain.CharterUser;



public interface UserRepository extends JpaRepository<CharterUser, Long> {
	List<CharterUser> findAll();
	CharterUser findByusername(String username);
//  save(UserRole role);

}
