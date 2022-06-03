package codingFinalRPG;

public class Enemy {

	private String name;
	private String type;
	private double health;
	private int mana;
	private Item inHand;
	private Item[] drops;
	
	//Default enemy constructor
	public Enemy() {
		
		name = "Nameless";
		type = "Goblin";
		health = 50;
		mana = 100;
		inHand = null;
		drops = new Item[2];
		
	}

	//Custom enemy constructor
	public Enemy(String n, String t, double h, int m, Item hand, Item[] d) {
		
		name = n;
		type = t;
		health = h;
		mana = m;
		inHand = hand;
		drops = d;
		
	}

	//A method to do all the parts of the enemy
	public static Enemy CreateEnemy(int stageNum) {
		
		//Random name picker from a pre selected list
		String[] names = {"Crested Veno","Ebok","Great Zolo","Nomad Enora","Orange Cromo","Alco","Oroo","Pheba","Pink Qolg","Pode","Arra","Black Anate","Black Sevobo","Fanged Hene","Rosetag","Ergosa","Gotorc","Kalo","Mioutor","Seryag","Aiol","Asabo","Boctale","Erthol","Qonc","Ashra","Blue Odora","Levat","Mammoth Pega","Acknag","Aiorabe","Avonada","Black Aiosara","Eveot","Anarbe","Andra","Enovog","Geenod","Giant Daio","Great Orva"};
		String name = names[((int) (Math.random()*40))];
		
		//Randomly chooses a enemy type (only one atm)
		String[] types = {"Goblin"};
		String type = types[((int) (Math.random()*1))];
		
		//Randomly makes health higher depending on stage number (more relevant for endless)
		int multi = (stageNum-1) * 10;
		double health = (int) ((Math.random() * ((100+multi) - (50+multi))) + (50+multi));
		
		//Randomly assigns mana to enemy
		int mana = (int) ((Math.random() * (100 - 50)) + 50);
		
		//Creates weapons that the enemy can have ('Item' objects)
		Item rulerWep = new Item("The Ruler", 10.0, 100, false, false, false, 0, 0, 0);
		Item pencilWep = new Item("The Pencil", 7.0, 100, false, false, false, 0, 0, 0);
		Item penWep = new Item("The Pen", 12.0, 100, false, false, false, 0, 0, 0);
		
		//Assigns item to a list to be randomly selected
		Item[] handPos = {rulerWep, pencilWep, penWep};
		Item hand = handPos[((int) (Math.random()*3))];
		
		//Assigns it to the enemy
		Item inHand = hand;
		
		//Creates drops (potions) for the enemy ('Item' objects)
		Item healthPotion = new Item("Health Potion", 0.0, 1, true, false, false, 50, 0, 0);
		// Item manaPotion = new Item("Mana Potion", 0.0, 1, false, true, false, 0, 50, 0);
		
		//Randomly choses one of the two to drop
		// Item[] dropPos = {healthPotion, manaPotion};
		// Item drop = dropPos[((int) (Math.random()*2))];
		Item[] dropPos = {healthPotion};
		Item drop = dropPos[0];
		
		//Assigns potion to drop list
		Item[] drops;
		drops = new Item[1];
		drops[0] = drop;
		
		// //Makes a 33% chance of dropping weapon (now that i think about it, its not worth theyre weaker than normal weapons but idk)
		// if(((int) (Math.random()*3)) == 0) {
		// 	drops[1] = hand;
		// }
	
		//Creates the actual enemy
		Enemy monster = new Enemy(name, type, health, mana, inHand, drops);
		
		//Returns monster :)
		return monster;
		
	}
	
	//Lots of various return methods
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public double getHealth() {
		return health;
	}
	
	public int getMana() {
		return mana;
	}
	
	public Item getHeld() {
		return inHand;
	}
	
	public Item getDrops(int which) {
		return drops[which];
	}
	
	//Used to damage the enemy and take their mana when used
	public void setHealth(double hlth) {
		health = hlth;
	}
	
	public void setMana(int mna) {
		mana = mna;
	}
	
	public void takeDamage(double dmg) {
		health -= dmg;
	}
	
	//Makes the player take damage due the enemy? (i dont remeber writing this)
	public void enemyAttack(Character player) {
		player.takeDamage(this.getHeld().getDamage());
	}
	
}
