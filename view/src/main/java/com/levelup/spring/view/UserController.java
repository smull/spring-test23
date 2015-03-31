package com.levelup.spring.view;

import com.levelup.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by java on 31.03.2015.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;



    @RequestMapping("/userD")
    public String getIndex(Model modal) {
        return "userRest";
    }
}
