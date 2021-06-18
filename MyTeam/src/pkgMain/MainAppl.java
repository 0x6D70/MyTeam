package pkgMain;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {
		Player player = new Player(2, "Dragovic", "Defense");
		
		System.out.println("== " + player);
	}
}
