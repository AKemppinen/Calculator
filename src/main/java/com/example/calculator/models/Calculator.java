package com.example.calculator.models;

public class Calculator {
    static float value;

    public Calculator() {
        value = 0;
    }
    public void add(float a) {
        value = value + a;
    }
    public void subtract(float a) {
        value = value - a;
    }
    public void multiply(float a) {
        value = value * a;
    }
    public void divide(float a) {
        value = value / a;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float a) {
        value = a;
    }

    public void reset() {
        value = 0;
    }
}
