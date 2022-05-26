package codingFinalRPG;

public class Enemy {

	private String name;
	private String type;
	private double health;
	private int mana;
	private Items[] inHand;
	private Items[] drops;
	
	public Enemy() {
		
		name = "Nameless";
		type = "Goblin";
		health = 50;
		mana = 100;
		inHand = new Items[1];
		drops = new Items[2];
		
	}
	
	public Enemy(String n, String t, double h, int m, Items[] hand, Items[] d) {
		
		name = n;
		type = t;
		health = h;
		mana = m;
		inHand = hand;
		drops = d;
		
	}
	
	public static Enemy CreateEnemy(int stageNum) {
		
		String[] names = {"Crested Veno","Ebok","Great Zolo","Nomad Enora","Orange Cromo","Alco","Oroo","Pheba","Pink Qolg","Pode","Arra","Black Anate","Black Sevobo","Fanged Hene","Rosetag","Ergosa","Gotorc","Kalo","Mioutor","Seryag","Aiol","Asabo","Boctale","Erthol","Qonc","Ashra","Blue Odora","Levat","Mammoth Pega","Acknag","Aiorabe","Avonada","Black Aiosara","Eveot","Anarbe","Andra","Enovog","Geenod","Giant Daio","Great Orva"};
		String name = names[((int) (Math.random()*40))];
		
		String[] types = {"Goblin"};
		String type = types[((int) (Math.random()*1))];
		
		int multi = stageNum * 10;
		double health = (int) ((Math.random() * ((100+multi) - (50+multi))) + (50+multi));
		
		int mana = (int) ((Math.random() * (100 - 50)) + 50);
		
		Items rulerWep = new Items("The Ruler", 10.0, 100, false, false, 0, 0);
		Items pencilWep = new Items("The Pencil", 7.0, 100, false, false, 0, 0);
		Items penWep = new Items("The Pen", 12.0, 100, false, false, 0, 0);
		
		Items[] handPos = {rulerWep, pencilWep, penWep};
		Items hand = handPos[((int) (Math.random()*3))];
		
		Items[] inHand = {hand};
		
		Items healthPotion = new Items("Health Potion", 0.0, 1, true, false, 50, 0);
		Items manaPotion = new Items("Mana Potion", 0.0, 1, false, true, 0, 50);
		
		Items[] dropPos = {healthPotion, manaPotion};
		Items drop = dropPos[((int) (Math.random()*2))];
		
		Items[] drops;
		drops = new Items[2];
		drops[0] = drop;
		
		if(((int) (Math.random()*3)) == 0) {
			drops[1] = hand;
		}
	
		Enemy monster = new Enemy(name, type, health, mana, inHand, drops);
		
		return monster;
		
	}
	
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
	
	public Items getHeld(int which) {
		return inHand[which];
	}
	
	public Items getDrops(int which) {
		return drops[which];
	}
	
	public void setHealth(double dmg) {
		health -= dmg;
	}
	
	public void setMana(double used) {
		health -= used;
	}
}
