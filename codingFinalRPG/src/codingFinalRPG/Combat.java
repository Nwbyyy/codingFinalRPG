package codingFinalRPG;

public class Combat {
	
	public static void AttackSeq(Stage stage, int i, Character player) {

		if(((int) (Math.random()*3)) == 0) {

			stage.getRooms()[i].getEnemies().takeDamage(player.getInv()[0].getDamage());
		                
			RPGMethods.DisplayYourAttack(player, stage.getRooms()[i].getEnemies());
							
			RPGMethods.DisplayEnemyMissed(player);

		}

		else {

			stage.getRooms()[i].getEnemies().takeDamage(player.getInv()[0].getDamage());
		                
			RPGMethods.DisplayYourAttack(player, stage.getRooms()[i].getEnemies());
							
			stage.getRooms()[i].getEnemies().enemyAttack(player);
							
			RPGMethods.DisplayEnemyAttack(player, stage.getRooms()[i].getEnemies());

		}
		

	}
	
}
