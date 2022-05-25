package codingFinalRPG;

public class Character {

	private double health;
	private int mana; //idk if im adding this
	private int invSpace;
	private String[] inventory;
	private int experience;
	private int level;
	private int stage;
	
	public Character() {
		
		health = 100;
		mana = 100;
		invSpace = 10;
		inventory = new String[invSpace];
		experience = 0;
		level = 1;
		stage = 0;
		
	}
	
	public Character(double h, int m, int invS, String[] inv, int exp, int lvl, int s) {
		
		health = h;
		mana = m;
		invSpace = invS;
		inventory = inv;
		experience = exp;
		level = lvl;
		stage = s;
		
	}
}
