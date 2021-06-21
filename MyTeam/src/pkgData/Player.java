package pkgData;

public class Player {
	private int numberPlayer;
	private String namePlayer, position;
	
	public Player(int numberPlayer, String namePlayer, String position) {
		super();
		this.numberPlayer = numberPlayer;
		this.namePlayer = namePlayer;
		this.position = position;
	}

	@Override
	public String toString() {
		return "== Player => numberPlayer=" + numberPlayer + ", namePlayer=" + namePlayer + ", position=" + position;
	}	
}
