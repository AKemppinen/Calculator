package com.example.calculator;
import com.example.calculator.models.Calculator;

public class CalcController {
    private Calculator calculator;

    public CalcController() {
        calculator = new Calculator();
    }

    public void add(float a) {
        calculator.add(a);
    }

    public void subtract(float a) {
        calculator.subtract(a);
    }

    public void multiply(float a) {
        calculator.multiply(a);
    }

    public void divide(float a) {
        calculator.divide(a);
    }

    public float getValue() {
        return calculator.getValue();
    }

    public void reset() {
        calculator.reset();
    }

    public void setValue(float a) {
        calculator.setValue(a);
    }


}
