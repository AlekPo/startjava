package com.startjava.Lesson_4.game;

import java.util.Scanner;

public class MyFirstGameTest {
    public static void main(String[] args) {
        String goAction;
        Scanner scStr = new Scanner(System.in);

        do {
            Player playerOne = new Player();
            Player playerTwo = new Player();
            MyFirstGame MyGame = new MyFirstGame(playerOne, playerTwo);
            System.out.println("Начинаем игру - угадай число!");
            System.out.println("У вас 10 попыток");
            playerOne.PlName();
            playerTwo.PlName();
            MyGame.Game();
            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                goAction = scStr.nextLine();
                if (goAction.equals("да") || goAction.equals("нет")) break;
            }
        } while (goAction.equals("да"));
    }
}