package me.spring.boot;

import me.spring.boot.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byungwook Lee on 2018-03-10
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RestController
public class MainController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/greeting")
    public String greet() {
        return userService.getMessage();
    }
}
