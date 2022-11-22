package SankeNLadder;

public class SnakeNLadderChecksOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1 ;
		int playerposition = 30;
		@SuppressWarnings("unused")
		int player = 1;
		int option = (int) Math.floor(Math.random()*8)/2;
		int dice = (int) Math.floor(Math.random()*14)/2;
		System.out.println("Player Position : "+playerposition);
		System.out.println("Dice Number : "+dice);
		
		if (option >= num) {
			switch (option) {
			case 1 :
				System.out.println("No Play");
				System.out.println("Player Position : "+playerposition);
				break;
				
			case 2 :
				System.out.println("Player can Use Ladder ");
				System.out.println("Player Position : "+ (playerposition+dice));
				break;
				
			case 3 :
				System.out.println("Player Attacked by Sanke ");
				System.out.println("Player Position : "+ (playerposition-dice));
				break;
				
			default :
				System.out.println("There is NO Options");
			}
		}
		else 
			System.out.println("The Number is Invalid");

	}
	
}
