package com.startjava.Lesson_2_3.calculator;

public class Calculator {

    private int numOne = 3; //number one
    private int numTwo = 1; //number two
    private char action = '^'; //arithmetic action
        
    public int Addition() //действие +
    {
        return (numOne + numTwo);
    }

    public int Subtraction() //действие -
    {
        return (numOne - numTwo);
    }

    public int Multiplication() //действие *
    {
        return (numOne * numTwo);
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

    
    public void setNumOne(int numOne){
        this.numOne = numOne;
    }

    public void setNumTwo(int numTwo){
        this.numTwo = numTwo;
    }

    public void setAction(char action){
        this.action = action;
    }
}