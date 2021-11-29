package com.assetmanagmentsystem.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.stereotype.Service;

import com.assetmanagmentsystem.bean.UserBean;
import com.assetmanagmentsystem.mapper.UserMapper;
import com.assetmanagmentsystem.model.User;

import com.assetmanagmentsystem.repositry.UserRepositry;

import com.assetmanagmentsystem.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepositry userRepositry;
	@Autowired
	private UserMapper userMapper;
	@Override
	public void addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		User user = userMapper.maptoEntity(userBean);
		userRepositry.save(user);
	}
	@Override
	public UserBean viewUserById(int userId) {
		// TODO Auto-generated method stub
		UserBean response = null;
		//fetch from 
		Optional<User>userOptional = userRepositry.findById(userId);
		if(userOptional.isPresent())
		{
			User user = userOptional.get();
			response = userMapper.maptoBean(user);
		}
		return response;
	}
	@Override
	public List<UserBean> viewAllUser() {
		// TODO Auto-generated method stub
		List<UserBean> userBean = new ArrayList<>();
		List<User> admin = userRepositry.findAll();
		if(CollectionUtils.isEmpty(admin))
		{
			admin.forEach(b -> userBean.add(userMapper.maptoBean(b)));
		}
		return userBean;
	}
	@Override
	public void edituser(UserBean userBean) {
		// TODO Auto-generated method stub
		Optional<User> userOptional = userRepositry.findById(userBean.getUser_id());
		if(userOptional.isPresent())
		{
			User user = userOptional.get();
			
			
			userRepositry.save(user);
		}
		
	}
	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		Optional<User> plyareOptional = userRepositry.findById(userId);
		if(plyareOptional.isPresent()) {
			User user = plyareOptional.get();
			
			userRepositry.delete(user);
		}
		
	}
	
	
}
