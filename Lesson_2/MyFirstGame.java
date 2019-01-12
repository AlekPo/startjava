import java.util.Random;

public class MyFirstGame {
    Player playerOne;
    Player playerTwo;
    Random random = new Random();
    private int numberComp = (random.nextInt(100));

    public MyFirstGame (Player playerOne, Player playerTwo) {
    	this.playerOne = playerOne;
    	this.playerTwo = playerTwo;
   	}
  
	public void Game() {
		while (!playerOne.getPlayerRight() && !playerTwo.getPlayerRight()) {
			playerOne.PlNumber();
			playerTwo.PlNumber();
			Check(playerOne);
			Check(playerTwo);
		}
		if (playerOne.getPlayerRight() == true && playerTwo.getPlayerRight() == true) {
			System.out.println(playerOne.getPlayerName() + ", " + playerTwo.getPlayerName() + " победила дружба!");
		} else if (playerOne.getPlayerRight() == true) {
			System.out.println("Победитель - " + playerOne.getPlayerName());

		} else if (playerTwo.getPlayerRight() == true) {
			System.out.println("Победитель - " + playerTwo.getPlayerName());
		}
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