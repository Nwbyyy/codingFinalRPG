package codingFinalRPG;

public class Items {

	private String name;
	private double damage;
	private int durability;
	private boolean doHealthRestore;
	private int healthRestore;
	private boolean doManaRestore;
	private int manaRestore;
	
	public Items() {
		
		name = "Flower";
		damage = 0;
		durability = 0;
		doHealthRestore = false;
		doManaRestore = false;
		
	}
	
	public Items(String n, double dmg, int dura, boolean doHR, boolean doMR, int HR, int MR) {
		
		name = n;
		damage = dmg;
		durability = dura;
		doHealthRestore = doHR;
		doManaRestore = doMR;
		
		if(doHR == true) {
			healthRestore = HR;
		}
		
		if(doMR == true) {
			manaRestore = MR;
		}
		
	}
}

