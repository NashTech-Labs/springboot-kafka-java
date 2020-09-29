package com.knoldus.springbootkafkajava.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class User {
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
}
