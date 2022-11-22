package SankeNLadder;

import java.util.Random;

public class SnakeNLadderExactWinningPosition {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int winposition = 100 ;
		int i = 0 , playerposition = 0;
		int player = 1;
		int win ;
		 while (playerposition<=winposition) {
			 
			 Random ran = new Random();
			 int dice = ran.nextInt(6)+1;
			 System.out.println("Dice Number is : "+dice);
			 int option = ran.nextInt(3);
			 
			 if(playerposition == winposition) {
				System.out.println("Player 1 Won The Game");
				break;
			}
			
			switch(option) {
			case 1 :
				System.out.println("No Play");
				System.out.println();
				break;
				
			case 2 :
				System.out.println("Ladder");
				playerposition += dice;
				System.out.println("Current Player Position : "+playerposition);
				
				if(playerposition>100) {
					playerposition = playerposition - dice ;
					System.out.println("Current Position : "+playerposition);
					System.out.println();
				}
				break;
				
			case 3 :
				System.out.println("Attacked by Snake");
				playerposition -= dice;
				System.out.println("Current Position : "+playerposition);
				
				if(playerposition<0) {
					playerposition = 0;
					System.out.println("Current Player Position : "+playerposition);
					System.out.println();
				}
				break;
				
			default :
				System.out.println();
		}
			
		}
	}
		
		
		
				

}
