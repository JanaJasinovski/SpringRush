package com.example.springRush.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class Parrot {
    private String name = "Koko";

    public Parrot() {
        System.out.println("Parrot created");
    }

}
