package com.assetmanagmentsystem.bean;

/**
 * 
 * @author swati / Hritik
 * date 22/11/21
 * login mapping 
 * dashboard mapping 
 * employee //temporary
 */
public class AdminBean {
	private int adminId;
	private String adminName;
	private String userId;
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
		return "AdminBean [adminId=" + adminId + ", adminName=" + adminName + ", userId=" + userId + ", password="
				+ password + "]";
	}
	
	
}
