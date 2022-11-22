package SankeNLadder;

import java.util.Random;

public class SnakeNLadderTwoPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerposition1 = 0;
        int playerposition2 = 0;
        int counterP1 = 0;
        int counterP2 = 0;
        final int winposition = 100;


        while(playerposition1 <= winposition  && playerposition2 <= winposition) {
            Random rand = new Random();
            int diceValue1 = rand.nextInt(6)+1;
            System.out.println("PLAYER1");
            System.out.println("Dice Value is ==> " +diceValue1);
            int option = rand.nextInt(3);

            counterP1++;
            if(playerposition1 == winposition) {
            	System.out.println();
                System.out.println("               Player 1 Won The Game           ");
                break;
            }
            switch(option) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    playerposition1 += diceValue1;
                    System.out.println("Current Position is ==>" + playerposition1);

                    if(playerposition1 > 100) {
                        playerposition1 = playerposition1 - diceValue1;
                        System.out.println("Current Position is ==>" + playerposition1);
                    }
                    break;
                case 2:
                    System.out.println("Snake");
                    playerposition1 -= diceValue1;
                    System.out.println("Current Position is ==>" + playerposition1);

                    if(playerposition1 < 0) {
                        playerposition1 = 0;
                        System.out.println("Current Position is ==>" + playerposition1);
                    }
                    break;
                default:
                    System.out.println("Not Correct");
            }
            System.out.println("Dice Roll Count for Player1 ===>"+counterP1);
            System.out.println();

            int diceValue2 = rand.nextInt(6)+1;
            System.out.println("PLAYER2");
            System.out.println("Dice Value is ==> " +diceValue2);
            int option2 = rand.nextInt(3);
            counterP2++;
            if(playerposition2 == winposition){
            	System.out.println();
                System.out.println("           Player 2 Won The Game          ");
                break;
            }
            switch(option2) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    playerposition2 += diceValue2;
                    System.out.println("Current Position is ==>" + playerposition2);

                    if(playerposition2 > 100) {
                        playerposition2 = playerposition2 - diceValue2;
                        System.out.println("Current Position is ==>" + playerposition2);
                    }
                    break;
                case 2:
                    System.out.println("Snake");
                    playerposition2 -= diceValue2;
                    System.out.println("Current Position is ==>" + playerposition2);

                    if(playerposition2 < 0) {
                        playerposition2 = 0;
                        System.out.println("Current Position is ==>" + playerposition2);
                    }
                    break;
                default:
                    System.out.println("Not Correct");

            }
            System.out.println("Dice Roll Count for Player2 ===>"+counterP2);
            System.out.println();

        }

      
    }
}
