package com.assetmanagmentsystem.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "roleMaster")
public class RoleMaster {
	@Id
	@Column(name = "rollId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollId;
	@Column(name = "name")
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
		if (!(obj instanceof RoleMaster))
			return false;
		RoleMaster other = (RoleMaster) obj;
		return Objects.equals(name, other.name) && rollId == other.rollId;
	}
	

}
