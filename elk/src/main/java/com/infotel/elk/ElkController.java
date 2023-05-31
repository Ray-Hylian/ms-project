package com.infotel.elk;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ElkController {

	@Autowired
	private ServletWebServerApplicationContext webServerAppCtxt;

	@RequestMapping(value = "/elk")
	public String helloWorld() {
		return new Date() + "\nWelcome on port " + webServerAppCtxt.getWebServer().getPort();
	}

	@RequestMapping(value = "/exception")
	public String exception() {
		String response = "";
		try {
			throw new Exception("Exception has occured on port " + webServerAppCtxt.getWebServer().getPort());
		} catch (Exception e) {
			response = e.getMessage();
		}

		return response;
	}
	
}

