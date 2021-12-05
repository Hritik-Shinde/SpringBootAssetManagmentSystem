//package com.assetmanagmentsystem.service;
//
//import java.sql.Date;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.CollectionUtils;
//
//import com.assetmanagmentsystem.bean.VenderBean;
//import com.assetmanagmentsystem.mapper.VenderMapper;
//import com.assetmanagmentsystem.model.Employee;
//import com.assetmanagmentsystem.model.Vender;
//import com.assetmanagmentsystem.repositry.VenderRepositry;
//import com.assetmanagmentsystem.service.VenderService;
//
//@Service
//public class VenderServiceImpl implements VenderService {
//
//	@Autowired
//	private VenderRepositry venderRepositry;
//
//	@Autowired
//	private VenderMapper venderMapper;
//
//	@Override
//	public String addVender(Vender vender) {
//		// TODO Auto-generated method stub
//		venderRepositry.save(vender);
//		return "success";
//
//	}
//
//	@Override
//	public VenderBean viewVenderById(int venderId) {
//		// TODO Auto-generated method stub
//		VenderBean response = null;
//		// fetch from
//		Optional<Vender> venderOptional = venderRepositry.findById(venderId);
//		if (venderOptional.isPresent()) {
//			Vender vender = venderOptional.get();
//			response = venderMapper.maptoBean(vender);
//		}
//		return response;
//	}
//
//	@Override
//	public List<VenderBean> viewAllVender() {
//		// TODO Auto-generated method stub\
//		List<VenderBean> employeeBean = new ArrayList<>();
//		List<Vender> employee = venderRepositry.findAll();
//		if (!CollectionUtils.isEmpty(employee)) {
//			employee.forEach(b -> employeeBean.add(venderMapper.maptoBean(b)));
//		}
//		return employeeBean;
//	}
//
//
//
//	@Override
//	public void deletevender(int venderId) {
//		// TODO Auto-generated method stub
//		Optional<Vender> venderOptional = venderRepositry.findById(venderId);
//		if (venderOptional.isPresent()) {
//			Vender vender = venderOptional.get();
//
//			venderRepositry.delete(vender);
//		}
//
//	}
//
//	@Override
//	public String modifyVenderStatus(int venderId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Vender getVenderById(int id) {
//		Vender vender = venderRepositry.getById(id);
//		return vender;
//	}
//
//	@Override
//	public void updateVender(int id, VenderBean venderBean) {
//		// TODO Auto-generated method stub
//		Optional<Vender> venOptional = venderRepositry.findById(id);
//		if(venOptional.isPresent()) {
//			Vender vender = venOptional.get();
//			vender.setVenderName(venderBean.getVenderName());
//			vender.setVenderLastName(venderBean.getVenderLastName());
//			vender.setVenderMobileNo(venderBean.getVenderMobileNo());
//			vender.setCountry(venderBean.getCountry());
//			vender.setState(venderBean.getState());
//			vender.setCity(venderBean.getCity());
//			vender.setAddress(venderBean.getAddress());
//			vender.setVenderemailId(venderBean.getVenderemailId());
//			vender.setVenderStatus(venderBean.getVenderStatus());
//			venderRepositry.save(vender);
//		}
//		
//		
//	}
//
//}
