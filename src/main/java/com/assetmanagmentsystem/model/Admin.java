package com.assetmanagmentsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Admin")
public class Admin {
	
	@Id
	@Column(name = "adminId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	@Column(name = "adminName")
	private String adminName;
	@Column(name = "userId")
	private String userId;
	@Column(name ="password")
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", userId=" + userId + ", password="
				+ password + "]";
	}


}
