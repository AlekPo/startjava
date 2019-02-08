package com.startjava.Lesson_4.game;

import java.util.Scanner;

public class Player {

    private String playerName;
    private int playerNumber;
    private boolean playerRight = false;

    private int[] playerNumberArray = new int[10];
    private int counter = 0;
    private boolean playerEnd = false;


    private Scanner scStr = new Scanner(System.in);
    private Scanner scInt = new Scanner(System.in);
    
    public void PlName() {
    System.out.println("Игрок, представьтесь!: ");
    playerName = scStr.nextLine();
    }

    public void PlNumber() {
        if (counter < 10) {
            System.out.println(playerName + ", угадай какое число загадал компьютер? \nИнтервал: [0;100), давай вводи:");
            playerNumber = scInt.nextInt();
            playerNumberArray[counter] = playerNumber;
            System.out.println(playerName + ", принял!");
            System.out.println("");
            counter++;
    } else {
            //Закончились 10 попыток
            playerEnd = true;
        }
    }

    public String getPlayerName() {
        return playerName;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
    public boolean getPlayerRight() {
        return playerRight;
    }
    public void setPlayerRight(boolean playerRight) {
        this.playerRight = playerRight;
    }
    public int getCounter() {
        return counter;
    }
    public boolean getPlayerEnd() {
        return playerEnd;
    }
    public int[] getPlayerNumberArray() {
        return playerNumberArray;
    }
}