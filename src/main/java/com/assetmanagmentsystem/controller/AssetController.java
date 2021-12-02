package com.assetmanagmentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.bean.AssetBean;
import com.assetmanagmentsystem.bean.EmployeeBean;
import com.assetmanagmentsystem.bean.VenderBean;
import com.assetmanagmentsystem.model.Asset;
import com.assetmanagmentsystem.model.Employee;
import com.assetmanagmentsystem.model.Vender;
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
	@GetMapping(value = "/viewassetform")
	public  ModelAndView vireasset(ModelAndView mv,Model m)
	{
		List<AssetBean> assetList = assetService.viewAllAsset();
		 mv = new ModelAndView("viewassetform");
		 System.out.println(assetList);
		 m.addAttribute("assetList",assetList);
		 return mv;
	}
	@RequestMapping(value = "/deleteasset/{assetId}")
	public ModelAndView deleteEmployee(@PathVariable("assetId")int assetId,ModelAndView mv)
	{
		assetService.deleteAsset(assetId);
		mv = new ModelAndView("viewassetform");
		return mv;
	}
	@PostMapping(value = "/editAssetDetails")
	public ModelAndView editVender(ModelAndView mv,Model m,@ModelAttribute("asset") AssetBean asset) {
		System.out.println("in con" + asset);
		int assetId = asset.getAssetId();
		assetService.updateAsset(assetId, asset);
		String message2 = "Vendor edited sucesfully";
		List<AssetBean> assetList = assetService.viewAllAsset();
		mv = new ModelAndView("viewassetform");
		System.out.println(assetList);
		m.addAttribute("assetList", assetList);

		return mv;
	}
	
	@GetMapping(value = "/editasset/{assetId}")
	public ModelAndView editEmployee(@PathVariable(name = "assetId") Integer assetId,ModelAndView mv,Model m)
	{
		System.out.println(assetId);
		Asset asset = assetService.getAssetById(assetId);
		mv = new ModelAndView("assetEdit");
		m.addAttribute("asset", asset);
		return mv;
	}

}
