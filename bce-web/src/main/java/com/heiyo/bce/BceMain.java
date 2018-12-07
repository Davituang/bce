package com.heiyo.bce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BceMain {

    public static void main(String[] args) {
        SpringApplication.run(BceMain.class,args);
    }
}
