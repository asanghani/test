package com.delta.charter.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "charter_role")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 123523L;
	
	@Id
	@Column(name = "roleid")
	private int roleId;
	
	@Column(name = "rolename")
	private String roleName;
	
	/*@ElementCollection(targetClass=Integer.class)
	private Set<UserRole> userRoles = new HashSet<>();*/
	
	//public UserRole() {}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/*public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}*/

	
}
