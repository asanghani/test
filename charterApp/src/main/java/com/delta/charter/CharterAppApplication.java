package com.delta.charter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.delta.charter.config.SecurityUtility;
import com.delta.charter.domain.CharterUser;
import com.delta.charter.domain.UserRole;
import com.delta.charter.service.RoleService;
import com.delta.charter.service.UserService;


@SpringBootApplication
public class CharterAppApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	public static void main(String[] args) {
		SpringApplication.run(CharterAppApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		/*CharterUser chuser = new CharterUser();
		chuser.setUsername("e");;
		chuser.setFirstname("Alpesh");
		chuser.setLastname("Sanghani");
		chuser.setMobilenumber(614440023);
		chuser.setOfficenumber(614440023);
		//user.setPassword("alpesh");
		chuser.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		chuser.setRoleid(0);
		userService.createUser(chuser);
		UserRole url1 = new UserRole();
		url1.setRoleId(1);
		url1.setRoleName("chrt");
		roleService.createRole(url1);*/
	}   
}
