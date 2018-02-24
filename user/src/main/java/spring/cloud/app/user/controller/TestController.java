package spring.cloud.app.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsf
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Value("${application.name}")
    private String name;


    @RequestMapping("/name")
    public String appName(){
        return name;
    }
}
