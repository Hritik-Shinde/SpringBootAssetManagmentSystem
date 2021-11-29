package com.assetmanagmentsystem.service;

import java.util.List;

import com.assetmanagmentsystem.bean.VenderBean;

public interface VenderService {
	void addVender(VenderBean venderBean);

	VenderBean viewVenderById(int empId);

	List<VenderBean> viewAllVender();

	void editVender(VenderBean venderBean);

	String modifyVenderStatus(int venderId);

}
