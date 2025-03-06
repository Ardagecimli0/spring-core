package com.ardagecimli.main;

import com.ardagecimli.config.AppConfig;
import com.ardagecimli.services.LoginService;
import com.ardagecimli.services.User;
import com.ardagecimli.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService =  context.getBean(UserService.class);

        for(User User : userService.getUsers()) {
            System.out.println(User);
        }

        LoginService loginService = new LoginService();
        loginService.login();


    }
}
