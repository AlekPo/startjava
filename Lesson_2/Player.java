import java.util.Scanner;

public class Player {

    private String playerName;
    private int playerNumber;
    private boolean playerRight = false;


    Scanner scStr = new Scanner(System.in);
    Scanner scInt = new Scanner(System.in);
    
    public void PlName() {
    System.out.println("Игрок, представьтесь!: ");
    playerName = scStr.nextLine();
    }

    public void PlNumber() {
    System.out.println(playerName + ", угадай какое число загадал компьютер? \nИнтервал: [0;100), давай вводи:");
    playerNumber = scInt.nextInt();
    System.out.println(playerName + ", принял!");
    System.out.println("");
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
}