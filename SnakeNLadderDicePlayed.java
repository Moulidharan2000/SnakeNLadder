package SankeNLadder;

import java.util.Random;

public class SnakeNLadderDicePlayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerposition = 0;
        int DiceRollCount = 0;
        final int winposition = 100;
        System.out.println("Initial Position " +playerposition);
        while(playerposition <= winposition) {
            Random rand = new Random();
            int diceValue = rand.nextInt(6)+1;
            System.out.println("Dice Value is " +diceValue);
            int option = rand.nextInt(3);
            DiceRollCount++;
            if(playerposition == winposition) {
                System.out.println("you won the game");

                break;
            }
            switch(option) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    playerposition += diceValue;
                    System.out.println("Current Position is " + playerposition);

                    if(playerposition > 100) {
                        playerposition = playerposition - diceValue;
                        System.out.println("Current Position is " + playerposition);
                    }
                    break;
                case 2:
                    System.out.println("Snake");
                    playerposition -= diceValue;
                    System.out.println("Current Position is " + playerposition);

                    if(playerposition < 0) {
                        playerposition = 0;
                        System.out.println("Current Position is " + playerposition);
                    }
                    break;
                default:
                    System.out.println("Not Correct");
            }
            System.out.println("Dice Roll Count "+DiceRollCount);

        }
    }


	}

