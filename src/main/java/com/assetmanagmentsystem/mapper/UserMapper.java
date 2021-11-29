package com.assetmanagmentsystem.mapper;

import org.springframework.stereotype.Component;

import com.assetmanagmentsystem.bean.UserBean;
import com.assetmanagmentsystem.model.User;

@Component
public class UserMapper {
	public UserBean maptoBean(User user) {
		UserBean bean = new UserBean();
		bean.setUser_id(user.getUser_id());
		bean.setUserName(user.getUserName());
		bean.setPassword(user.getPassword());
		bean.setUserStatus(user.getUserStatus());
		return bean;

	}

	public User maptoEntity(UserBean UserBean) {
		User User = new User();
		User.setUser_id(UserBean.getUser_id());
		User.setUserName(UserBean.getUserName());
		User.setPassword(UserBean.getPassword());
		User.setUserStatus(UserBean.getUserStatus());
		return User;
	}
}
