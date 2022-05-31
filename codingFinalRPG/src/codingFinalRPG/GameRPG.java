package codingFinalRPG;

import java.util.Scanner;

public class GameRPG {

    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);
        int stageNum = 1;
        int roomsTotal = 5;
        String startChoice = "";
        
        //Weapons and items
        Item rulerWep = new Item("The Ruler", 16.0, 100, false, false, false, 0, 0, 0);
//		Item pencilWep = new Item("The Pencil", 14.0, 100, false, false, false, 0, 0, 0);
//		Item penWep = new Item("The Pen", 20.0, 100, false, false, false, 0, 0, 0);
//      Item healthPotion = new Item("Health Potion", 0.0, 1, true, false, false, 50, 0, 0);
//		Item manaPotion = new Item("Mana Potion", 0.0, 1, false, true, false, 0, 50, 0);
        
        Item[] inv;
        inv = new Item[5];
        inv[0] = rulerWep;
        		
        		
        Character player = new Character(100.0, 100, 5, inv);

        RPGMethods.DisplayStart();
        startChoice = kboard.nextLine();

        RPGMethods.spaces100();

        RPGMethods.StartChoices(startChoice);
        
        Stage stage1 = new Stage(stageNum, roomsTotal, Room.GenerateRooms(stageNum, roomsTotal));
        
        for(int i = 0; i < roomsTotal; i++) {

        	RPGMethods.DisplayFromHallway();
	        
	        if(RPGMethods.DisplayOptions().equalsIgnoreCase("enter room")) {
	
	        	
	            RPGMethods.DisplayEnterRoom();
	            RPGMethods.wait5();
	            RPGMethods.spaces100();
	            RPGMethods.DisplayGoblin();
	            
	            while(player.getHealth() > 0 && stage1.getRooms()[i].getEnemies()[0].getHealth() > 0) {
	            
		            if(RPGMethods.DisplayActions().equalsIgnoreCase("attack")) {
		                
		            	stage1.getRooms()[i].getEnemies()[0].takeDamage(player.getInv()[0].getDamage());
		                
		                RPGMethods.DisplayYourAttack(player, stage1.getRooms()[i].getEnemies()[0]);
		                
		                stage1.getRooms()[i].getEnemies()[0].enemyAttack(player);
		                
		                RPGMethods.DisplayEnemyAttack(player, stage1.getRooms()[i].getEnemies()[0]);
		
		            }
		
		            else if(RPGMethods.DisplayActions().equalsIgnoreCase("Inventory")) {
		
		                RPGMethods.DisplayInventory(player);
		
		            }
		
		            else if(RPGMethods.DisplayActions().equalsIgnoreCase("check")) {
		
		                //RPGMethods.check(enemy);
		
		            }

	            }
	            
	            if(player.getHealth() < 0) {
	            	
	            	RPGMethods.DisplayYouDied();
	            	RPGMethods.wait10();
	            	System.exit(0);
	            	
	            }
	            
	            else if(stage1.getRooms()[i].getEnemies()[0].getHealth() < 0) {
	            	
	            	RPGMethods.DisplayEnemyDefeated();
	            	RPGMethods.wait5();
	            }
	            
	        }
	
	        else if(RPGMethods.DisplayOptions().equalsIgnoreCase("move on")) {
	
	
	
	        }
	
	        else {
	
	
	
	        }
        }

        


    	
        // Enemy monster1 = Enemy.CreateEnemy(0);
        
        // System.out.println(monster1.getName() + " the " + monster1.getType());
        // System.out.println(monster1.getHealth());
        // System.out.println(monster1.getMana());
        // System.out.println(monster1.getHeld(0).getName());
        // System.out.println(monster1.getDrops(0).getName());


        // int stageNum = 1;
        // int roomsTotal = 5;
        // Stage stage1 = new Stage(1, 5, Room.GenerateRooms(stageNum, roomsTotal));

        // System.out.println(stage1.getRooms()[0].getRoomNumber());
        // System.out.println(stage1.getRooms()[0].getEnemies()[0].getName());
        // System.out.println(stage1.getRooms()[0].getRoomLoot().getName());

        kboard.close();
    }

}
