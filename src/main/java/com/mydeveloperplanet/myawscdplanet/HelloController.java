package com.mydeveloperplanet.myawscdplanet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        String patternString = "(Hello again AWS Continuous Delivery! From host: ).*\\/\\d+.\\d+.\\d+.\\d+";
        try {
            InetAddress ip = InetAddress.getLocalHost();
            message += " From host: " + ip;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message;
    }

}
