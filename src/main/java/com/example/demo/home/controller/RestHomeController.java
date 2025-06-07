package com.example.demo.home.controller;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import com.example.demo.home.service.impl.HomeServiceImpl;
import com.example.demo.home.vo.ApartInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.vo.ApiResponse;
import com.example.demo.home.service.HomeService;

@RestController
public class RestHomeController {

	@Autowired
	HomeService homeSerivce;
	
	@PostMapping("/apartmentRealPriceAjax")
	public ApiResponse getApartRealPriceAjax(ApartInfo param){
		Map result = new HashMap<String, String>();
		
		try {
			Map<String, Object> myApart = homeSerivce.getApartmentDeals("", "", "");
			System.out.print(myApart.toString());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		result.put("apartRealPrice", "9억원");
		
		return new ApiResponse<Map>().success(result);
	}
	
	@PostMapping("memberInfoAjax")
	public Map<String, String> getMemberInfoAjax(Map<String, String> param){
		
		Map result = new HashMap<String, String>();
		
		result.put("memberInfo", homeSerivce.getMemberInfo(param));
		
		return result;
	}

}
