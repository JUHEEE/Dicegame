package dicegame;

public class Gamemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Judge jud = new Judge();
		jud.Player.name = "한주희";
		jud.FraudPlayer.name = "아이유";

		for (int i = 0; i < 5; i++) {
			jud.GameStart();
		}
		
		System.out.println();
		jud.Winner(jud.Player, jud.FraudPlayer);
	}

}
