package com.delta.charter.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.delta.charter.security.Authority;

@Entity
@Table(name = "charter_user")
public class CharterUser implements UserDetails, Serializable{
	private static final long serialVersionUID = 176897987L;
	
	@Id
	private String username;
	private String firstname;
	private String lastname;
	private int roleid;
	private int mobilenumber;
	private int officenumber;
	private String password;
	//private boolean enabled = true;
	
	public CharterUser(){}
	
	
	
	
	/*@ElementCollection(targetClass=Integer.class)
	private Set<UserRole> userRoles1 = new HashSet<>();*/
	
	//private String userRoles;
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public int getOfficenumber() {
		return officenumber;
	}
	public void setOfficenumber(int officenumber) {
		this.officenumber = officenumber;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	
	
	
	
	//-------------Overridden method from UserDetails
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		Set<GrantedAuthority> authorities = new HashSet<>();
		 authorities.add(new Authority("Admin"));
		return authorities;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
