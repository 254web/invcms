package com.techcaresinc.invcms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class InvcmsApplication extends SpringBootServletInitializer {

    @RequestMapping(value = "/")
    public String root (){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(InvcmsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(InvcmsApplication.class);

    }

}
