package com.assetmanagmentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.model.Vender;
import com.assetmanagmentsystem.repositry.VenderRepositry;

/**
 * 
 * @author HritikShinde
 *
 */

@Service
public class VenderService {
	@Autowired
	private VenderRepositry venderRepositry;

	public Vender addVender(Vender vender) {
		return venderRepositry.save(vender);
	}

	public List<Vender> getAllAvender() {
		return venderRepositry.findAll();
	}

	public Boolean deletevender(int venderId) {
		// TODO Auto-generated method stub
		venderRepositry.deleteById(venderId);
		return true;

	}

	public Vender updateVender(int venderId, Vender vender) {
		// TODO Auto-generated method stub
		return venderRepositry.save(vender);
	}

	public Vender getvenderById(Integer venderId) {
		// TODO Auto-generated method stub
		Vender vender = venderRepositry.getById(venderId);
		return vender;

	}

}
