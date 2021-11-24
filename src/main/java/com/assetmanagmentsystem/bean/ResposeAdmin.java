package com.assetmanagmentsystem.bean;

import java.util.List;

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
