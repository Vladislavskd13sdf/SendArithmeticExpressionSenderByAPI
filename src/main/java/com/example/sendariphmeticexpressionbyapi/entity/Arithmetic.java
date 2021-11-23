package com.example.sendariphmeticexpressionbyapi.entity;

import java.util.Objects;

public class Arithmetic {
    private int number1;
    private int number2;
    private String operation;

    public Arithmetic(int number1, int number2, String operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public Arithmetic() {
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arithmetic that = (Arithmetic) o;
        return number1 == that.number1 && number2 == that.number2 && Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2, operation);
    }

    @Override
    public String toString() {
        return "Arithmetic{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", operation='" + operation + '\'' +
                '}';
    }
}
