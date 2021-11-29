package com.assetmanagmentsystem.bean;

import java.util.List;
/**
 * 
 * @author swati / Hritik
 * date 22/11/21
 * login mapping 
 * dashboard mapping 
 * employee //temporary
 */
public class ResposeAdmin {
	private String message;
	private List<AdminBean> listBeans;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<AdminBean> getListBeans() {
		return listBeans;
	}
	public void setListBeans(List<AdminBean> listBeans) {
		this.listBeans = listBeans;
	}
	

}
