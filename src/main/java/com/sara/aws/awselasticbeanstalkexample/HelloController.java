package com.sara.aws.awselasticbeanstalkexample;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    public String hello(){
        return "Say Hello AWS ElasticBeanStalk..!";
    }
}
