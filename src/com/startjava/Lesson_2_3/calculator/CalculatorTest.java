package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        String goAction;
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        do {
            System.out.println("Введите первое число: ");
            int numberOne = scInt.nextInt();
            System.out.println("Введите знак математической операции: ");
            String action = scStr.nextLine();
            System.out.println("Введите второе число: ");
            int numberTwo = scInt.nextInt();

            Calculator Calc = new Calculator();
            Calc.setNumOne(numberOne);
            Calc.setNumTwo(numberTwo);
            switch (action) {
                case "+":   System.out.println("Решение: " + numberOne + " " + action + " " + numberTwo + " = " + Calc.Addition());
                            break;
                case "-":   System.out.println("Решение: " + numberOne + " " + action + " " + numberTwo + " = " + Calc.Subtraction());
                            break;
                case "*":   System.out.println("Решение: " + numberOne + " " + action + " " + numberTwo + " = " + Calc.Multiplication());
                            break;
                case "/":   System.out.println("Решение: " + numberOne + " " + action + " " + numberTwo + " = " + Calc.Division());
                            break;
                case "^":   System.out.println("Решение: " + numberOne + " " + action + " " + numberTwo + " = " + Calc.Exponentiation());
                            break;
                case "%":   System.out.println("Решение: " + numberOne + " " + action + " " + numberTwo + " = " + Calc.Remainder());
                            break;
                default:    System.out.println("Введен не верный знак математической операции");
                            System.out.println("Используйте; + - * / ^ %");
            }

            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                goAction = scStr.nextLine();
                if (goAction.equals("да") || goAction.equals("нет")) break;
            }

        } while (goAction.equals("да"));
    }
}