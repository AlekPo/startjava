package com.startjava.Lesson_2_3.array;

public class ArrayMain {
    public static void main(String[] args) {

        String[] text = new String[6];

        for (String s : text) {
            System.out.println(s);
        }

        for (int i = 0; i < text.length; i++) {
            text[i] = "Зима";
        }

        for (int i = 0; i < text.length; i++) {
            System.out.println(i + 1 + " " + text[i]);
        }
    }
}
