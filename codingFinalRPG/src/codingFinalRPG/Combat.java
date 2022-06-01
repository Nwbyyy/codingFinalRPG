package codingFinalRPG;

import java.util.*;

public class Combat {
	
	public static void AttackSeq(Stage stage, int i, Character player) {

		if(((int) (Math.random()*3)) == 0) {

			stage.getRooms().get(i).getEnemies().takeDamage(player.getInv().get(0).getDamage());
		                
			RPGMethods.DisplayYourAttack(player, stage.getRooms().get(i).getEnemies());
							
			RPGMethods.DisplayEnemyMissed(player);

		}

		else {

			stage.getRooms().get(i).getEnemies().takeDamage(player.getInv().get(0).getDamage());
		                
			RPGMethods.DisplayYourAttack(player, stage.getRooms().get(i).getEnemies());
							
			stage.getRooms().get(i).getEnemies().enemyAttack(player);
							
			RPGMethods.DisplayEnemyAttack(player, stage.getRooms().get(i).getEnemies());

		}
		

	}
	
}
