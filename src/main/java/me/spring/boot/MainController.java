package me.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byungwook Lee on 2018-03-10
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RestController
public class MainController {
    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
