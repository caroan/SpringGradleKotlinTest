package com.example.demo.home.service;

import java.net.URISyntaxException;
import java.util.Map;

public interface HomeService {
	public String getMemberInfo(Map<String, String> param);
	public Map<String, Object> getApartmentDeals(String lawdCd, String dealYmd, String serviceKey) throws URISyntaxException;
}
