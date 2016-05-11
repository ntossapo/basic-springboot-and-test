package com.tossapon.basic_springboot_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Tossapon Nuanchuay on 11/5/2559.
 */
@Controller
public class SimpleController {

    @RequestMapping("/hello")
    @ResponseBody
    public String getHome(){
        return "This is Home";
    }
}
