package com.assetmanagmentsystem.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assetmanagmentsystem.model.User;

public interface UserRepositry extends JpaRepository<User, Integer> {

}
