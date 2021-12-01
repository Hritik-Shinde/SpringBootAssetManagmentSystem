package com.assetmanagmentsystem.bean;

import java.util.Objects;

public class RoleMasterBean {
	private int rollId;
	private String name;
	public int getRollId() {
		return rollId;
	}
	public void setRollId(int rollId) {
		this.rollId = rollId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "RoleMaster [rollId=" + rollId + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, rollId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof RoleMasterBean))
			return false;
		RoleMasterBean other = (RoleMasterBean) obj;
		return Objects.equals(name, other.name) && rollId == other.rollId;
	}
	

}
