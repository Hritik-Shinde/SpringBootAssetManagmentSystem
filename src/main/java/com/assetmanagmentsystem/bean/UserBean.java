package com.assetmanagmentsystem.bean;

import java.net.PasswordAuthentication;
import java.sql.Date;
import java.util.Objects;

public class UserBean {
	int user_id;
	String userName;
	String password;
	String userStatus;
	Date dateCreated;
	Date dateModefieDate;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateModefieDate() {
		return dateModefieDate;
	}
	public void setDateModefieDate(Date dateModefieDate) {
		this.dateModefieDate = dateModefieDate;
	}
	@Override
	public String toString() {
		return "UserBean [user_id=" + user_id + ", userName=" + userName + ", password=" + password + ", userStat="
				+ userStatus + ", dateCreated=" + dateCreated + ", dateModefieDate=" + dateModefieDate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateCreated, dateModefieDate, password, userName, userStatus, user_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof UserBean))
			return false;
		UserBean other = (UserBean) obj;
		return Objects.equals(dateCreated, other.dateCreated) && Objects.equals(dateModefieDate, other.dateModefieDate)
				&& Objects.equals(password, other.password) && Objects.equals(userName, other.userName)
				&& Objects.equals(userStatus, other.userStatus) && user_id == other.user_id;
	}



}
