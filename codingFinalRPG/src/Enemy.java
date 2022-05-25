package codingFinalRPG;

public class Enemy {

	private String name;
	private String type;
	private double health;
	private int mana;
	private String[] inHand;
	private String[] drops;
	
	public Enemy() {
		
		name = "Nameless";
		type = "Goblin";
		health = 50;
		mana = 100;
		inHand = new String[1];
		drops = new String[2];
		
	}
	
	public Enemy(String n, String t, double h, int m, String[] hand, String[] d) {
		
		name = n;
		type = t;
		health = h;
		mana = m;
		inHand = hand;
		drops = d;
		
	}
}
