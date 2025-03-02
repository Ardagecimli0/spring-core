package com.ardagecimli.main;

import com.ardagecimli.services.User;
import com.ardagecimli.services.UserService;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        UserService userService1 = new UserService();

        List<User> users = new ArrayList<>();

        users.add(new User("Arda"));

        userService1.setUsers(users);
        System.out.println("Liste Boyutu: " + userService1.getUsers().size());






    }
}
