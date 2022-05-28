package codingFinalRPG;

public class Character {

	private double health;
	private int mana; //idk if im adding this
	private int invSpace; //idk if im adding this
	private String[] inventory;
	private int experience;
	private int level;
	private int stage;
	
	//Default character constructor
	public Character() {
		
		health = 100;
		mana = 100;
		invSpace = 10;
		inventory = new String[invSpace];
		experience = 0;
		level = 1;
		stage = 0;
		
	}
	
	//Custom character constructor
	public Character(double h, int m, int invS, String[] inv, int exp, int lvl, int s) {
		
		health = h;
		mana = m;
		invSpace = invS;
		inventory = inv;
		experience = exp;
		level = lvl;
		stage = s;
		
	}

	//Lots of work to be done LOL
}
