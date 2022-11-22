package SankeNLadder;

public class SnakeNLadderDieRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int dice = (int) Math.floor(Math.random()*14)/2;
		if (dice >= num) {
		System.out.println("Dice Number : "+dice);
		}
		else 
			System.out.println("Invalid Number");

	}

}
