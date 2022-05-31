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
                System.out.println("Room: " + stage1.getRooms()[i].getRoomNumber());
	            RPGMethods.DisplayGoblin();
	            
	            while(player.getHealth() > 0 && stage1.getRooms()[i].getEnemies().getHealth() > 0) {
	            
		            if(RPGMethods.DisplayActions().equalsIgnoreCase("attack")) {
		                
                        Combat.AttackSeq(stage1, i, player);
		
		            }
		
		            else if(RPGMethods.DisplayActions().equalsIgnoreCase("Inventory")) {
                        
                        RPGMethods.spaces100();
		                RPGMethods.DisplayInventory(player);
                        
                        if(RPGMethods.DisplayInvOptions().equalsIgnoreCase("exit")) {
                            continue;
                        }

                        else {
                            
                            Item.useItem(player);

                        }
		
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
	            
	            else if(stage1.getRooms()[i].getEnemies().getHealth() < 0) {
	            	
	            	RPGMethods.DisplayEnemyDefeated();
                    for(int k = 0; k < player.getInvSpace(); k++) {

                        if(player.getInv()[k] == null) {
                            player.getInv()[k] = stage1.getRooms()[i].getEnemies().getDrops(0);
                            break;
                        }
                    }
	            	RPGMethods.wait5();
	            }
	            
	        }
	
	        else if(RPGMethods.DisplayOptions().equalsIgnoreCase("move on")) {
	
                RPGMethods.spaces100();
                RPGMethods.DisplayMoveOn();
                RPGMethods.wait5();
	
	        }
	
	        else {
	
             System.out.println("That's not an option...");
	
	        }
        }

        //final boss here?

        kboard.close();

    }

}
