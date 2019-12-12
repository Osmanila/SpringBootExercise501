package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";

    }
    @RequestMapping("/about")
    public String pageabout() {
        return "pageabout";
    }
    @RequestMapping("/contactus")
    public String pagecontactus() {
        return "pagecontactus";
    }

}
