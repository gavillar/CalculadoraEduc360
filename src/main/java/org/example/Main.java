package org.example;

import org.example.calculator.Calculator;

import java.util.Scanner;

public class Main {

    static Calculator calculator = new Calculator();
    static int number1;
    static int number2;
    static char operator;

    static void enter() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o primeiro número: ");

            if (scanner.hasNextInt()) {
                number1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Erro: Digite um número válido");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Digite o operador lógico (+, -, *, /): ");

            String operatorEnter = scanner.next();

            if (operatorEnter.length() == 1) {
                operator = operatorEnter.charAt(0);

                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break;
                } else {
                    System.out.println("Erro: Operador lógico inválido. Tente novamente.");
                }
            } else {
                System.out.println("Erro: Digite um único caractere para o operador.");
            }
        }

        while (true) {
            System.out.println("Digite o segundo número: ");

            if (scanner.hasNextInt()) {
                number2 = scanner.nextInt();
                calculator.calculator(number1, number2, operator);
                if (calculator.getOperationType().length() != 0) {
                    System.out.println("O Resultado da " + calculator.getOperationType() + " é: " + calculator.getResult());
                }
                break;
            } else {
                System.out.println("Erro: Digite um número válido");
                scanner.next();
            }
        }
    }
    public static void main(String[] args) {
        enter();
    }
}