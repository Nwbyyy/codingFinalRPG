package codingFinalRPG;

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
	
	//Returns name of item (used to test atm)
	public String getName() {
		return name;
	}
}

