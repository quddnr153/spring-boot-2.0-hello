package me.spring.boot.user;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

/**
 * @author Byungwook Lee on 2018-03-10
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ApplicationArguments arguments;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public String getMessage() {
        List<String> helloValues = arguments.getOptionValues("hello");

        return helloValues.stream().collect(Collectors.joining(", "));
    }


}
