package com.infotel.microservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class MicroserviceBController {

    @GetMapping("/message")
    public String test() {
        return "Hello from Second Service";
    }
}
