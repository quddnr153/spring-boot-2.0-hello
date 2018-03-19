package me.spring.boot.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Byungwook Lee on 2018-03-10
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Service
public class UserService {
    @Value("${name}")
    private String name;

    @Autowired
    private Bw bw;

    @Autowired
    private MyBean myBean;

    @Autowired
    private UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public String getMessage() {
        System.out.println(bw.getTime());
        System.out.println(bw.getWhereToGo());
        System.out.println(bw.getMilliSec().getNano());
        System.out.println("Bean profile : " + myBean.getMessage());
        return "Hello World, " + name + ", bw " + bw.getWhereToGo() + " " + bw.getTime();
    }


}
