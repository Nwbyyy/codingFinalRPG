package codingFinalRPG;

import java.util.*;

public class Item {

	//Vars :)
	private String name;
	private double damage;
	private int durability;
	private boolean doHealthRestore;
	private int healthRestore;
	private boolean doManaRestore;
	private int manaRestore;
	private boolean costMana;
	private int manaCost;
	
	//Default item constructor
	public Item() {
		
		name = "Flower";
		damage = 0;
		durability = 0;
		doHealthRestore = false;
		doManaRestore = false;
		costMana = false;
		healthRestore = 0;
		manaRestore = 0;
		manaCost = 0;
		
	}
	
	//Custom item constructor
	public Item(String n, double dmg, int dura, boolean doHR, boolean doMR, boolean cM, int HR, int MR, int mC) {
		
		name = n;
		damage = dmg;
		durability = dura;
		doHealthRestore = doHR;
		doManaRestore = doMR;
		costMana = cM;
		
		if(doHR == true) {
			healthRestore = HR;
		}
		
		if(doMR == true) {
			manaRestore = MR;
		}

		if(cM == true) {
			manaCost = mC;
		}
		
	}
	
	//Importing Items
	static Item healthPotion = new Item("Health Potion", 0.0, 1, true, false, false, 50, 0, 0);
	static Item manaPotion = new Item("Mana Potion", 0.0, 1, false, true, false, 0, 50, 0);

	//Returns name of item
	public String getName() {
		return name;
	}
	
	public double getDamage() {
		return damage;
	}

	public int getHealthRestore() {
		return healthRestore;
	}

	public int getManaRestore() {
		return manaRestore;
	}

	//Uses an item (health potion atm)
	public static void useItem(Character player, int slot) {
		System.out.println(slot);
		if(player.getInv().get(slot).getName().equalsIgnoreCase("Health Potion")) {

			if(player.getHealth() == 100) {

				RPGMethods.spaces100();
				RPGMethods.DisplayHealed(player);
				player.getInv().remove(slot);
				
			}

			else if(player.getHealth() + healthPotion.getHealthRestore() > 100) {

				RPGMethods.spaces100();
				player.setHealth(100);
				RPGMethods.DisplayHealed(player);
				player.getInv().remove(slot);

			}

			else if(player.getHealth() + healthPotion.getHealthRestore() < 100) {

				RPGMethods.spaces100();
				player.heal(healthPotion.getHealthRestore());
				RPGMethods.DisplayHealed(player);
				player.getInv().remove(slot);

			}
		}

		else if(player.getInv().get(slot).getName().equalsIgnoreCase("Mana Potion")) {

			if(player.getMana() == 100) {

				RPGMethods.spaces100();
				RPGMethods.DisplayRestoredMana(player);
				player.getInv().remove(slot);
				
			}
			
			else if(player.getMana()+healthPotion.getManaRestore() > 100) {

				RPGMethods.spaces100();
				player.setMana(100);
				RPGMethods.DisplayRestoredMana(player);
				player.getInv().remove(slot);

			}
			
			else if(player.getMana()+healthPotion.getManaRestore() < 100) {

				RPGMethods.spaces100();
				player.restoreMana(healthPotion.getManaRestore());
				RPGMethods.DisplayRestoredMana(player);
				player.getInv().remove(slot);

			}
		}

		else {

			System.out.println("This item is not useable.");
			RPGMethods.wait5();
			
		}
	}
}

