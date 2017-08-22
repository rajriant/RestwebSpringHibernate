package com.rajeev.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rajeev.model.UserDetail;

public class SpringRestClient {

	private static RestTemplate restTemplate = new RestTemplate();
	private static final String baseURL = "http://www.groupkt.com/post/c9b0ccb9/country-and-other-related-rest-webservices.htm";

		public static void main(String[] args) {

		// restTemplate.getForObject(url, responseType)
		// ResponseEntity<String> response =
		// restTemplate.getForEntity("http://10.248.80.14/ELEAVEID2/eleave/getuserdetail?userid=nchauhan",
		// String.class);
				
		ResponseEntity<String> response = restTemplate.getForEntity(baseURL, String.class);
		
		  if (HttpStatus.OK == response.getStatusCode()) {
		        System.out.println(response);
		  }else if(HttpStatus.UNAUTHORIZED==response.getStatusCode()){
			  System.out.print("Unauthorized!!!");
		  }else{
			  System.out.println("some other problem");
		  }
		  	
	//converting to json	
		/*String soapmessageString = response.toString();
		JSONObject soapDatainJsonObject = XML.toJSONObject(soapmessageString);
		System.out.println(soapDatainJsonObject);*/
		    
	/*	UserDetail userDetail = restTemplate.getForObject(baseURL, UserDetail.class,200);
		System.out.println("AdminName: " + userDetail.getAdminName());
        System.out.println("AdminAssistant name: " + userDetail.getAdminAsstName());*/
      
	
	}
	

}



