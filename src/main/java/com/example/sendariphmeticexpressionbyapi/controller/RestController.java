package com.example.sendariphmeticexpressionbyapi.controller;

import com.example.sendariphmeticexpressionbyapi.entity.Arithmetic;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@RequestMapping("/")
public class RestController {

    @GetMapping("/calc")
    public Arithmetic calculate() {
        return new Arithmetic(getRandomNumber(), getRandomNumber(), getRandomOperation());
    }

    private int getRandomNumber() {
        return new Random().nextInt();
    }

    private String getRandomOperation() {
        String operation = "";
        switch (Math.abs(new Random().nextInt() % 4)) {
            case 1:
                operation = "-";
                break;
            case 2:
                operation = "*";
                break;

            case 3:
                operation = "/";
                break;
            default:
                operation = "+";
        }
        return operation;
    }
}
