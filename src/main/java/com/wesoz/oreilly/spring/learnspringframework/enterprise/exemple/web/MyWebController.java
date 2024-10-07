package com.wesoz.oreilly.spring.learnspringframework.enterprise.exemple.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wesoz.oreilly.spring.learnspringframework.enterprise.exemple.business.BusinessService;

@Component
public class MyWebController {
	@Autowired
	private BusinessService businessService;

	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}
