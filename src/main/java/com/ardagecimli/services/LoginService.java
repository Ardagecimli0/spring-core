package com.ardagecimli.services;


import com.ardagecimli.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoginService {

    public void login(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService =  context.getBean(UserService.class);

        System.out.println(userService.getUsers().size());

        System.out.println("Login Success");
        System.out.println("LoginService.login");

    }
}
