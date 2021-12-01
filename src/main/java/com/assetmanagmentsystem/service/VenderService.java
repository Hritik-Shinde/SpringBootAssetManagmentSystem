package com.assetmanagmentsystem.service;

import java.util.List;

import com.assetmanagmentsystem.bean.VenderBean;
import com.assetmanagmentsystem.model.Vender;

public interface VenderService {
	String addVender(Vender vender);

	VenderBean viewVenderById(int empId);

	List<VenderBean> viewAllVender();

	void editVender(VenderBean venderBean);

	String modifyVenderStatus(int venderId);

}
