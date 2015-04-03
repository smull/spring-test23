package com.levelup.spring.view;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by java on 31.03.2015.
 */
@Controller
@RequestMapping("/userRest")
public class UserController {



    @RequestMapping
    public String getIndex(Model modal) {
        return "userRest";
    }
}
