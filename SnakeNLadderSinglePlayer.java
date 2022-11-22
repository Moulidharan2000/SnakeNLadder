package SankeNLadder;

public class SnakeNLadderSinglePlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player = 1;
		int startposition = 0;
		int playercheck = (int) Math.floor(Math.random()*10)/2;
		if (playercheck == player) {
			System.out.println("Player : "+player);
			System.out.println("Starting Position : "+startposition);
		}
		else {
			System.out.println("This is a Single Player Game");
		

		}
	}
}