package com.startjava.Lesson_4.calculator;

import java.util.Arrays;

import static java.lang.Math.*;


public class Calculator {

    private int numOne; //number one
    private int numTwo; //number two
    private String action; //arithmetic action

    public Calculator(String expression) {
        String[] expressionArray = expression.split(" ");
        //Проверка на наличие 3 значений в массиве и цифры в 1 и 3 значении массива
        if (expressionArray.length == 3 && expressionArray[0].matches("\\d") && expressionArray[2].matches("\\d")) {
            numOne = Integer.parseInt(expressionArray[0]);
            action = expressionArray[1];
            numTwo = Integer.parseInt(expressionArray[2]);
        } else {
            action = " ";
        }
    }

    public int getNumOne() {
        return numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public String getAction() {
        return action;
    }


    public int Addition() //действие +
    {
//        return (numOne + numTwo);
        return addExact(numOne, numTwo);
    }

    public int Subtraction() //действие -
    {
//        return (numOne - numTwo);
        return subtractExact(numOne, numTwo);
    }

    public int Multiplication() //действие *
    {
//        return (numOne * numTwo);
        return multiplyExact(numOne, numTwo);
    }

    public int Division() //действие /
    {
        return (numOne / numTwo);
    }

    public int Exponentiation() //действие ^
    {
        int answer = 1;
        for (int i = 0; i < numTwo; i++) {
            answer = answer * numOne;
        }
        return answer;
    }

     public int Remainder() //действие %
    {
        return (numOne % numTwo);
    }


}