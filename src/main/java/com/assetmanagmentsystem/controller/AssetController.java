package com.assetmanagmentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.model.Asset;
import com.assetmanagmentsystem.service.AssetService;
@RestController
public class AssetController {
	@Autowired
	AssetService assetService;

	@PostMapping(value = "/assetregister")
	public ModelAndView registerAsset(ModelAndView mv, @ModelAttribute("asset") Asset asset)
	{
		assetService.addAsset(asset);
		String message2 = "asset added sucesfully";
		mv.addObject(message2);
		mv = new ModelAndView("addassetform");

		return mv;
	}
}
