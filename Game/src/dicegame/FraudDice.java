package dicegame;

public class FraudDice extends Dice {
	int FraudNumber;

	public int DiceNumber(String mode) {
		if ( mode == "WEAK" )
			return weakNum();
		if ( mode == "STRONG" )
			return strongNum();
		if ( mode == "NORMAL" )
			return getNumber();

		return getNumber();
	}

	public int weakNum() {
		do {
			getNumber();
		} while (FraudNumber > 2);

		return FraudNumber;
	}

	public int strongNum() {
		do {
			getNumber();
		} while (FraudNumber < 5);

		return FraudNumber;
	}

	public int getNumber() {
		FraudNumber = (int) (Math.random() * 6 + 1);
		return FraudNumber;
	}
}
