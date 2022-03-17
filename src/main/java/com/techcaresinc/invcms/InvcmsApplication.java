package com.techcaresinc.invcms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class InvcmsApplication extends SpringBootServletInitializer {

    @RequestMapping(value = "/")
    public String root (){
        return "index";
    }

    @RequestMapping(value = "/invoice")
    public String invoice (){
        return "invoice";
    }
    public static void main(String[] args) {
        SpringApplication.run(InvcmsApplication.class, args);
    }

   /* @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CmsApplication.class);
    }
*/

}
