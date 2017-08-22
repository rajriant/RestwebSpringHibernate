package com.rajeev.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rajeev.model.UserDetail;
import com.rajeev.service.RegistrationService;

@RestController
public class AuthenticateController {

	/*
	 * @RequestMapping("/authenticate") public String welcome() {// Welcome
	 * page, non-rest
	 * 
	 * System.out.println("authenticate   "); return
	 * "Welcome to RestTemplate Example."; }
	 */

	@RequestMapping("/authenticate")
	public String welcome1() {// Welcome page, non-rest
		for (int i = 0; i <= 10500; i++) {
			System.out.println("authenticate   " + i);
		}

		return "Welcome to RestTemplate Example.";
	}

	@RequestMapping(value = "/projectregistration", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public String getUser(@RequestBody String json)
			throws JsonProcessingException {

		UserDetail userDetail = new UserDetail();
		ObjectMapper mapper = new ObjectMapper();
		try {
			// JSON from String to Object
			userDetail = mapper.readValue(json, UserDetail.class);
			// do some things with json, put some header information in json

		} catch (Exception e) {
			e.printStackTrace();
		}

		// service.saveEleaveUserDetail(eleaveUserDetail);

		System.out.println("hi......" + userDetail.getAdminAsstName());
		return mapper.writeValueAsString(userDetail);

	}
}
