package com.example.springRush.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
@Data
@ToString
public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("Parrot created");
    }

}
