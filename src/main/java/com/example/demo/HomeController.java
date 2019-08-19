package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Don't forget the Annotations!
@Controller
public class HomeController {

    @RequestMapping ("/index")
    public String homepage() {
        return "index";
    }

    /*anything
    * that
    * your
    * write
    * is
    * commended*/


}
