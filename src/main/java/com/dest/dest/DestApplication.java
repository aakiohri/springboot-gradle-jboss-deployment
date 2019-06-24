package com.dest.dest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DestApplication extends SpringBootServletInitializer {

    @RequestMapping("/")
    public String hearbeat() {
        return "up running";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DestApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DestApplication.class, args);
    }

}
