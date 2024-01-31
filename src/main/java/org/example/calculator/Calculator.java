package org.example.calculator;

public class Calculator {
    double result = 0;
    String operationType;

    public String getOperationType() {
        return operationType;
    }

    public double getResult() {
        return result;
    }

    public double calculator(double num1, double num2, char operator) {

            switch (operator) {
                case '+':
                    operationType = "Soma";
                    add(num1, num2);
                    break;
                case '-':
                    operationType = "Subtração";
                    subtract(num1, num2);
                    break;
                case '/':
                    operationType = "Divisão";
                    division(num1, num2);
                    break;
                case '*':
                    operationType = "Multiplicação";
                    multiplier(num1, num2);
                    break;
            }
        return result;
    }

    private void add(double num1, double num2) {
        result = num1 + num2;
    }
    private void subtract(double num1, double num2) {
        result = num1 - num2;
    }
    private void division(double num1, double num2) {
        result = num1 / num2;
    }
    private void multiplier(double num1, double num2) {
        result = num1 * num2;
    }
}