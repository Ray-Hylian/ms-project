package com.infotel.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/messageFallback")
    public String userServiceFallBackMethod() {
        return "Subscription Service is taking longer than Expected.Please try again later";
    }

}
