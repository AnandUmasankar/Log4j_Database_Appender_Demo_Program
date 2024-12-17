package com.demo.log4j.controller;


import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class DummyController {
    @GetMapping("/post")
    public String postacall(HttpServletRequest request){
        try{
            String literal="ab";
            Integer.parseInt(literal);
            return "success";
        }catch(Exception e){
            log.error("Exception occurred", e);

        }
        log.info("Poi tholada Panni");
        return "failed";
    }
}
