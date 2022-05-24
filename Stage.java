package codingFinalRPG;

public class Stage {

	private int stageNumber;
	private int enemiesSpawned;
	private String[] endLoot;
	
	public Stage() {
		
		stageNumber = 1;
		enemiesSpawned = 1;
		endLoot = new String[1];
		
	}
	
	public Stage(int stageNum, int spawned, String[] loot) {
		
		stageNumber = stageNum;
		enemiesSpawned = spawned;
		endLoot = loot;
		
	}
}
