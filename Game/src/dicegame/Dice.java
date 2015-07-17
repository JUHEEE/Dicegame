package dicegame;

public class Dice {
	int diceNumber;
	
	public int DiceNumber(){
		diceNumber = (int)(Math.random()*6+1);
		return diceNumber;
	}
}
