package dicegame;

public class Judge extends Recorder {

	Player Player = new Player();
	FraudPlayer FraudPlayer = new FraudPlayer();
	Dice Dice = new Dice();
	FraudDice FraudDice = new FraudDice();

	public void GameStart() {

		FraudPlayer.addScore(FraudDice.DiceNumber(Mode()));
		Player.addScore(Dice.DiceNumber());

		Result(Player, FraudPlayer);
	}

	public String Mode() {
		String mode = "NORMAL";
		FraudPlayer.mode = mode;

		if ( FraudPlayer.TScore < Player.TScore ) {
			mode = "STRONG";
			FraudPlayer.mode = mode;
		}
		if ( FraudPlayer.TScore - Player.TScore >= 6 ) {
			mode = "WEAK";
			FraudPlayer.mode = mode;
		}
		return mode;
	}

}
