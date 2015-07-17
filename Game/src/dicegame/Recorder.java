package dicegame;

public class Recorder {
	public void Result(Player player, FraudPlayer fraudplayer) {
		System.out.print("[" + player.name + ":" + player.TScore + "  ");
		System.out.println(fraudplayer.name + ":" + fraudplayer.TScore + " "
				+ "[" + fraudplayer.mode + "]" + "]");
	}

	public void Winner(Player player, FraudPlayer fraudplayer) {
		if ( player.TScore > fraudplayer.TScore ) {
			System.out.println(player.name + "가 승리했습니다!");
		} else {
			System.out.println(fraudplayer.name + "가 승리했습니다!");
		}
	}
}
