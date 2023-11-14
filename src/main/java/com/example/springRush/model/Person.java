package com.example.springRush.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Person {
    private String name = "Ella";

    private Parrot parrot;

}
