package org.example;

import java.util.Scanner;

public class Main {

    static int number1;
    static int number2;
    static char operator;

    static int result;

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

            String operadorEntrada = scanner.next();

            if (operadorEntrada.length() == 1) {
                operator = operadorEntrada.charAt(0);

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
                calculator();
                break;
            } else {
                System.out.println("Erro: Digite um número válido");
                scanner.next();
            }
        }
    }

    static void calculator() {

        switch (operator) {
            case '+':
                add(number1, number2);
                break;
            case '-':
                subtract(number1, number2);
                break;
            case '/':
                division(number1, number2);
                break;
            case '*':
                multiplier(number1, number2);
                break;
            default:
                System.out.println("Erro: Operador lógico inválido.");
                break;

        }
    }
    static void add(int num1, int num2) {
        result = num1 + num2;
        System.out.println("Resultado da soma: " + result);
    }

    static void subtract(int num1, int num2) {
        result = num1 - num2;
        System.out.println("Resultado subtração: " + result);
    }
    static void division(int num1, int num2) {
        result = num1 / num2;
        System.out.println("Resultado divisão: " + result);
    }

    static void multiplier(int num1, int num2) {
        result = num1 * num2;
        System.out.println("Resultado multiplicação: " + result);
    }


    public static void main(String[] args) {
        enter();
    }
}