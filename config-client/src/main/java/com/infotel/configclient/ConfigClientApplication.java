package com.infotel.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${client.pseudo.property}")
	private String pseudoProperty;

	@GetMapping("/property")
	public ResponseEntity<String> getProperty() {
		return ResponseEntity.ok("client.pseudo.property: "+pseudoProperty);
	}
}
