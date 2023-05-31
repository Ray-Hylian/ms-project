package com.infotel.microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class MicroserviceAController {

    @GetMapping("/message")
    public String test() {
        return "Hello from First Service";
    }
}
