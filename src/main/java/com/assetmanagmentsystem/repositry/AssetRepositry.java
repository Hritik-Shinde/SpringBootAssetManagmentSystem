package com.assetmanagmentsystem.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assetmanagmentsystem.model.Asset;

public interface AssetRepositry extends JpaRepository<Asset, Integer>{

}
