package com.assetmanagmentsystem.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assetmanagmentsystem.model.Asset;
/**
 * 
 * @author HritikShinde
 *
 */
@Repository
public interface AssetRepositry extends JpaRepository<Asset, Integer>{

	List<Asset> findByEmpId(int empId);

	

}
