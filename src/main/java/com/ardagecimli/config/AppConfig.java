package com.ardagecimli.config;


import com.ardagecimli.services.User;
import com.ardagecimli.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public  UserService userService() {
        UserService userService1 = new UserService();

        List<User> users = new ArrayList<>();

        users.add(new User("Arda"));

        userService1.setUsers(users);
        return userService();
    }

}
