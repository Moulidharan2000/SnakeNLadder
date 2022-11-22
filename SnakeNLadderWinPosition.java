package SankeNLadder;

import java.util.Random;

public class SnakeNLadderWinPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerposition = 0;
        final int winposition = 100;
        while (playerposition <= winposition) {
            Random rand = new Random();
            int diceValue = rand.nextInt(6) + 1;
            System.out.println("Dice Value is  " + diceValue);
            int option = rand.nextInt(3);

            if (option == 0) {
                System.out.println("No Play");
            } else if (option == 1) {
                System.out.println("Ladder");
                playerposition += diceValue;
                System.out.println("Current Position is : " + playerposition);
            } else if (option == 2) {
                System.out.println("Snake");
                playerposition -= diceValue;
                System.out.println("Current Position is : " + playerposition);

                if (playerposition < 0) {
                    playerposition = 0;
                    System.out.println("Current Position is : " + playerposition);

                }
            }
	}

}

}