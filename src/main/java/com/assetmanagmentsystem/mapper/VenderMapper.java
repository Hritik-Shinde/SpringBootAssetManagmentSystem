package com.assetmanagmentsystem.mapper;

import org.springframework.stereotype.Component;

import com.assetmanagmentsystem.bean.VenderBean;
import com.assetmanagmentsystem.model.Vender;

@Component
public class VenderMapper {
		
	public VenderBean maptoBean(Vender vender)
	{
		
		VenderBean bean = new VenderBean();
		bean.setVenderId(vender.getVenderId());
		bean.setVenderName(vender.getVenderName());
		bean.setVenderLastName(vender.getVenderLastName());
		bean.setVenderMobileNo(vender.getVenderMobileNo());
		bean.setVenderemailId(vender.getVenderemailId());
		bean.setCity(vender.getCity());
		bean.setState(vender.getState());
		bean.setAddress(vender.getAddress());
		bean.setCountry(vender.getCountry());
		bean.setVenderStatus(vender.getVenderStatus());
		return bean;
	}
	public Vender maptoEntity(VenderBean venderBean)
	{
		Vender vender = new Vender();
		vender.setVenderId(venderBean.getVenderId());
		vender.setVenderName(venderBean.getVenderName());
		vender.setVenderLastName(venderBean.getVenderLastName());
		vender.setVenderMobileNo(venderBean.getVenderMobileNo());
		vender.setVenderemailId(venderBean.getVenderemailId());
		vender.setCity(venderBean.getCity());
		vender.setState(venderBean.getState());
		vender.setAddress(venderBean.getAddress());
		vender.setCountry(venderBean.getCountry());
		vender.setVenderStatus(venderBean.getVenderStatus());
		return vender;
	}
}
