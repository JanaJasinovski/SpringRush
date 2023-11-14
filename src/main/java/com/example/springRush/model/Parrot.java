package com.example.springRush.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
@Data
public class Parrot {
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }
}
