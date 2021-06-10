package com.alpha.rest_api.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path="/alpha", produces="application/json")
@CrossOrigin("*")
public class HomeController {

    @GetMapping("/home")
    String Home() {
        return "Welcome to my simple Rest API example";
    }

    @GetMapping("/about")
    String getAbout() {
        return "This is a simple Rest API example that uses mongodb and intellij to add, retrieve and delete students";
    }
    @GetMapping("/moreinfo")
    String getMoreInfo(){
        return "This is my first ever API example which l was able to connect to the backend ";
    }
}
