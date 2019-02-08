package com.startjava.Lesson_4.game;

import java.util.Arrays;
import java.util.Random;

public class MyFirstGame {
    private Player playerOne;
    private Player playerTwo;
    private Random random = new Random();
    private int numberComp = (random.nextInt(100));

    public MyFirstGame (Player playerOne, Player playerTwo) {
    	this.playerOne = playerOne;
    	this.playerTwo = playerTwo;
   	}
  
	public void Game() {
		while (!playerOne.getPlayerRight() && !playerTwo.getPlayerRight() && !playerOne.getPlayerEnd() && !playerTwo.getPlayerEnd()){
			playerOne.PlNumber();
			playerTwo.PlNumber();
			Check(playerOne);
			Check(playerTwo);
		}

		if (playerOne.getPlayerEnd()) {
			System.out.println("У "+playerOne.getPlayerName() + " закончились попытки.");
		}
		if (playerTwo.getPlayerEnd()) {
			System.out.println("У "+playerTwo.getPlayerName() + " закончились попытки.");
		}

		if (playerOne.getPlayerRight() && playerTwo.getPlayerRight()) {
			System.out.println(playerOne.getPlayerName() + ", " + playerTwo.getPlayerName() + " победила дружба!");
		} else if (playerOne.getPlayerRight()) {
			System.out.println("Игрок " + playerOne.getPlayerName() + " угадал число " + numberComp + " c " + playerOne.getCounter() + " попытки.");
		} else if (playerTwo.getPlayerRight()) {
            System.out.println("Игрок " + playerTwo.getPlayerName() + " угадал число " + numberComp + " c " + playerTwo.getCounter() + " попытки.");
		}
		System.out.println("Список ваших попыток:");
		int[] playerNumberArrayOne = Arrays.copyOf(playerOne.getPlayerNumberArray(), playerOne.getCounter());
		int[] playerNumberArrayTwo = Arrays.copyOf(playerTwo.getPlayerNumberArray(), playerTwo.getCounter());
		System.out.println("Игрок " + playerOne.getPlayerName() + " называл следующие числа " + Arrays.toString(playerNumberArrayOne));
        System.out.println("Игрок " + playerTwo.getPlayerName() + " называл следующие числа " + Arrays.toString(playerNumberArrayTwo));
	}

	private void Check(Player player) {
			if (player.getPlayerNumber() < numberComp) {
			System.out.println(player.getPlayerName() + ", введенное вами число меньше того, что загадал компьютер");
			System.out.println(player.getPlayerNumber() + " < " + numberComp);
		
		} else if (player.getPlayerNumber() > numberComp) {
			System.out.println(player.getPlayerName() + ", введенное вами число больше того, что загадал компьютер");
			System.out.println(player.getPlayerNumber() + " > " + numberComp);

		} else {
			System.out.println(player.getPlayerName() + ", вы угадали!");
			System.out.println(player.getPlayerNumber() + " = " + numberComp);
			player.setPlayerRight(true);
		}
		System.out.println("");
	}
}