package me.spring.boot.user;

import org.springframework.stereotype.Service;

/**
 * @author Byungwook Lee on 2018-03-10
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
