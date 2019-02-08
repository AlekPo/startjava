package com.startjava.Lesson_2_3.array;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество значений в массиве");
        int maxLength = scan.nextInt();
        int[] numbers = new int[maxLength];
        System.out.println("Введите значения массива через пробел");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                    maxNumber = numbers[i];
            }
        }
        System.out.println("Максимальное число: " + maxNumber);
    }
}
