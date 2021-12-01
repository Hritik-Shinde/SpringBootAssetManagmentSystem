package com.assetmanagmentsystem.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.assetmanagmentsystem.bean.EmployeeBean;
import com.assetmanagmentsystem.bean.VenderBean;
import com.assetmanagmentsystem.mapper.AdminMapper;
import com.assetmanagmentsystem.mapper.VenderMapper;
import com.assetmanagmentsystem.model.Vender;
import com.assetmanagmentsystem.repositry.AdminRepositry;
import com.assetmanagmentsystem.repositry.VenderRepositry;
import com.assetmanagmentsystem.service.VenderService;

@Service
public class VenderServiceImpl implements VenderService {

	@Autowired
	private VenderRepositry venderRepositry;
	
	@Autowired
	private VenderMapper venderMapper;

	@Override
	public String addVender(Vender vender) {
		// TODO Auto-generated method stub
		venderRepositry.save(vender);
		return "success";

	}

	@Override
	public VenderBean viewVenderById(int venderId) {
		// TODO Auto-generated method stub
		VenderBean response = null;
		// fetch from
		Optional<Vender> venderOptional = venderRepositry.findById(venderId);
		if (venderOptional.isPresent()) {
			Vender vender = venderOptional.get();
			response = venderMapper.maptoBean(vender);
		}
		return response;
	}

	@Override
	public List<VenderBean> viewAllVender() {
		// TODO Auto-generated method stub\
		List<VenderBean> employeeBean = new ArrayList<>();
		List<Vender> employee = venderRepositry.findAll();
		if (!CollectionUtils.isEmpty(employee)) {
			employee.forEach(b -> employeeBean.add(venderMapper.maptoBean(b)));
		}
		return employeeBean;
	}

	@Override
	public void editVender(VenderBean venderBean) {
		// TODO Auto-generated method stub
		Optional<Vender> adminOptional = venderRepositry.findById(venderBean.getVenderId());
		if (adminOptional.isPresent()) {
			Vender vender = adminOptional.get();

			venderRepositry.save(vender);
		}

	}

	@Override
	public String modifyVenderStatus(int venderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
