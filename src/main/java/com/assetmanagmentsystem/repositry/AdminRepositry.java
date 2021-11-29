package com.assetmanagmentsystem.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assetmanagmentsystem.model.Admin;


@Repository
public interface AdminRepositry extends JpaRepository<Admin, Integer>{

	
	Admin findByUserIdAndPassword(String string, String string2);
	

}
