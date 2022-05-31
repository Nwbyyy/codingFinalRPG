package codingFinalRPG;

public class Character {

	private double health;
	private int mana; //idk if im adding this
	private int invSpace; //idk if im adding this
	private Item[] inventory;
	
	//Default character constructor
	public Character() {
		
		health = 100;
		mana = 100;
		invSpace = 5;
		inventory = new Item[invSpace];
		
	}
	
	//Custom character constructor
	public Character(double h, int m, int invS, Item[] inv) {
		
		health = h;
		mana = m;
		invSpace = invS;
		inventory = inv;
		
	}
	
	public double getHealth() {
		return health;
	}
	
	public double getMana() {
		return mana;
	}
	
	public double getInvSpace() {
		return invSpace;
	}
	
	public Item[] getInv() {
		return inventory;
	}
	
	public void setHealth(double hlth) {
		health = hlth;
	}
	
	public void takeDamage(double dmg) {
		health -= dmg;
	}
}
