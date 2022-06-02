package codingFinalRPG;

import java.util.*;

public class Character {

	private double health;
	private int mana; //idk if im adding this
	private int invSpace; //idk if im adding this
	private ArrayList<Item> inventory;
	
	//Default character constructor
	public Character() {
		
		health = 100;
		mana = 100;
		invSpace = 5;
		inventory = new ArrayList<Item>(invSpace);
		
	}
	
	//Custom character constructor
	public Character(double h, int m, int invS, ArrayList<Item> inv) {
		
		health = h;
		mana = m;
		invSpace = invS;
		inventory = inv;
		
	}
	
	//Get methods
	public double getHealth() {
		return health;
	}
	
	public double getMana() {
		return mana;
	}
	
	public double getInvSpace() {
		return invSpace;
	}
	
	public ArrayList<Item> getInv() {
		return inventory;
	}
	
	//Useful methods to do things
	public void setHealth(double hlth) {
		health = hlth;
	}

	public void setMana(int mna) {
		mana = mna;
	}
	
	public void takeDamage(double dmg) {
		health -= dmg;
	}

	public void heal(double amt) {
		health += amt;
	}

	public void restoreMana(double amt) {
		mana += amt;
	}
	
}
