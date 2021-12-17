package com.assetmanagmentsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assetmanagmentsystem.model.Asset;
import com.assetmanagmentsystem.service.AssetService;
/**
 * 
 * @author Hritik Shinde
 *
 */
@RestController
public class AssetController {
	
	@Autowired
	private AssetService assetService;
	

@RequestMapping(value="/viewTotalAssets",method=RequestMethod.GET)
public ModelAndView viewTotalAssets(ModelAndView mv )
{
		return mv;
}
	@RequestMapping(value = "/assetRegestrationform")
	public ModelAndView assetegestration(ModelAndView mv ,Model m) {
		m.addAttribute("asset", new Asset());
		return mv;
	}
	
	@PostMapping(value = "/assetRegister")
	public ModelAndView addEmployee(@ModelAttribute("asset") Asset asset, ModelAndView mv, Model m) {	
		System.out.println(asset);
		Asset asset2=assetService.addEmployee(asset);
		List<Asset> assets=assetService.getAllAssets();
		mv = new ModelAndView("viewAsset");
		System.out.println(assets);
		m.addAttribute("assets", assets);
		return mv;

	}
	@GetMapping(value = "/viewAssetById")
	public ModelAndView viewAssetById(ModelAndView mv, Model m,HttpServletRequest request) {
		int empId = (int) request.getSession().getAttribute("empId");
		List<Asset> assets=assetService.getAllAssets();
		mv = new ModelAndView("viewAsset");
		System.out.println(assets);
		m.addAttribute("assets", assets);
		return mv;

	}
	@GetMapping(value = "/viewAsset")
	public ModelAndView viewEmployee(ModelAndView mv, Model m) {
		
		List<Asset> assets=assetService.getAllAssets();
		mv = new ModelAndView("viewAsset");
		System.out.println(assets);
		m.addAttribute("assets", assets);
		return mv;

	}
	
	@GetMapping(value = "/viewEmpAssets")
	public ModelAndView viewEmpAssets(ModelAndView mv, Model m) {
		
		List<Asset> assets=assetService.getAllAssets();
		mv = new ModelAndView("viewEmpAssets");
		System.out.println(assets);
		m.addAttribute("assets", assets);
		return mv;

	}
	@RequestMapping(value = "/deleteasset/{assetId}")
	public ModelAndView deleteAsset(@PathVariable("assetId") int assetId,Model m) {

		Boolean flag = assetService.deleteasset(assetId);
		
		List<Asset> assets=assetService.getAllAssets();
		ModelAndView mv = new ModelAndView("viewAsset");
		System.out.println(assets);
		m.addAttribute("assets", assets);
		return mv;
	}
	@GetMapping(value = "/editasset/{assetId}")
	public ModelAndView editAsset(@PathVariable(name = "assetId") Integer assetId, ModelAndView mv, Model m) {
		System.out.println(assetId);
		Asset asset = assetService.getAssetById(assetId);
		mv = new ModelAndView("editAsset");
		m.addAttribute("asset", asset);
		return mv;
	}

	@PostMapping(value = "/editAssetDetails")
	public ModelAndView editAsset(ModelAndView mv, Model m, @ModelAttribute("Asset") Asset asset) {
		System.out.println("in con" + asset);
		int assetId = asset.getAssetId();
		Asset asset2 = assetService.updateAsset(assetId, asset);
		List<Asset> assets=assetService.getAllAssets();
		mv = new ModelAndView("viewAsset");
		System.out.println(assets);
		m.addAttribute("assets", assets);
		return mv;
	}

}
