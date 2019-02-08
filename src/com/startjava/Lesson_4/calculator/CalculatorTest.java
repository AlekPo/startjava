package com.startjava.Lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        String goAction;
        Scanner scStr = new Scanner(System.in);
        do {
            System.out.println("Введите математическое выражение (образец '1 + 1'): ");

            Calculator Calc = new Calculator(scStr.nextLine());
            switch (Calc.getAction()) {
                case "+":   System.out.println("Решение: " + Calc.getNumOne() + " " + Calc.getAction() + " " + Calc.getNumTwo() + " = " + Calc.Addition());
                            break;
                case "-":   System.out.println("Решение: " + Calc.getNumOne() + " " + Calc.getAction() + " " + Calc.getNumTwo() + " = " + Calc.Subtraction());
                            break;
                case "*":   System.out.println("Решение: " + Calc.getNumOne() + " " + Calc.getAction() + " " + Calc.getNumTwo() + " = " + Calc.Multiplication());
                            break;
                case "/":   System.out.println("Решение: " + Calc.getNumOne() + " " + Calc.getAction() + " " + Calc.getNumTwo() + " = " + Calc.Division());
                            break;
                case "^":   System.out.println("Решение: " + Calc.getNumOne() + " " + Calc.getAction() + " " + Calc.getNumTwo() + " = " + Calc.Exponentiation());
                            break;
                case "%":   System.out.println("Решение: " + Calc.getNumOne() + " " + Calc.getAction() + " " + Calc.getNumTwo() + " = " + Calc.Remainder());
                            break;
                default:    System.out.println("Введено неверное значение");
                            System.out.println("Для знака математической операции используйте: + - * / ^ %");
            }

            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                goAction = scStr.nextLine();
                if (goAction.equals("да") || goAction.equals("нет")) break;
            }

        } while (goAction.equals("да"));
    }
}