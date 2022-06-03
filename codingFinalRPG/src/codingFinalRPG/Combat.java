package codingFinalRPG;

public class Combat {
	
	//Condensed to do the attacking sequence (when you chose to attack)
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
	
	//Condensed to do the attacking sequence (when you chose to attack)
		public static boolean BossAttackSeq(Character player, Enemy boss) {

			if(((int) (Math.random()*3)) == 0) {

				if(((int) (Math.random()*2)) == 0) {
					
					boss.takeDamage(player.getInv().get(0).getDamage());
	                
					RPGMethods.DisplayYourAttack(player, boss);
									
					RPGMethods.DisplayEnemyMissed(player);

					RPGMethods.DisplayBossWeak();
					
					return true;
				}
				
				else {
					
					boss.takeDamage(player.getInv().get(0).getDamage());
	                
					RPGMethods.DisplayYourAttack(player, boss);
									
					RPGMethods.DisplayEnemyMissed(player);
					
					return false;
					
				}
				

			}

			else {

				boss.takeDamage(player.getInv().get(0).getDamage());
			                
				RPGMethods.DisplayYourAttack(player, boss);
								
				boss.enemyAttack(player);
								
				RPGMethods.DisplayEnemyAttack(player, boss);
				
				return false;

			}
			

		}
	
}
