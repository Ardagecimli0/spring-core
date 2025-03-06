package com.ardagecimli.services;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }
    public String getName() {}

}
