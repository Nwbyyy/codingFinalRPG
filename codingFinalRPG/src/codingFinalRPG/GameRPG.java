package codingFinalRPG;

import java.util.*;
import java.util.Scanner;


public class GameRPG {

    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);
        int stageNum = 1;
        int roomsTotal = 5;
        int slot = 1;
        String startChoice = "";
        String invChoice = "";
        
        //Weapons and items
        Item rulerWep = new Item("The Ruler", 16.0, 100, false, false, false, 0, 0, 0);
        
        ArrayList<Item> inv = new ArrayList<Item>();
        inv.add(rulerWep);
        		
        		
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
                System.out.println("Room: " + stage1.getRooms().get(i).getRoomNumber());
	            RPGMethods.DisplayGoblin();
	            
	            while(player.getHealth() > 0 && stage1.getRooms().get(i).getEnemies().getHealth() > 0) {
	            
	            	String actionChoice = RPGMethods.DisplayActions();
	            	
		            if(actionChoice.equalsIgnoreCase("attack")) {
		                
                        Combat.AttackSeq(stage1, i, player);
		
		            }
		            
		            else if(actionChoice.equalsIgnoreCase("Inventory")) {
                        
                        RPGMethods.spaces100();
		                RPGMethods.DisplayInventory(player);
		                RPGMethods.DisplayInvOptions();
		                
		                invChoice = kboard.nextLine();
		                
                        if(invChoice.equalsIgnoreCase("exit")) {
                        	
                            continue;
                            
                        }

                        else {
                            
                        	Integer.parseInt(invChoice);
                        	
                            Item.useItem(player, slot);
                            
                        }
		
		            }
		
		            else if(actionChoice.equalsIgnoreCase("check")) {
		
		                //RPGMethods.check(enemy);
		
		            }

	            }
	            
	            if(player.getHealth() <= 0) {
	            	
	            	RPGMethods.DisplayYouDied();
	            	RPGMethods.wait10();
	            	System.exit(0);
	            	
	            }
	            
	            else if(stage1.getRooms().get(i).getEnemies().getHealth() <= 0) {
	            	
	            	RPGMethods.DisplayEnemyDefeated();
                    for(int k = 0; k < player.getInvSpace(); k++) {

                        if(player.getInv().get(k) == null) {
                            player.getInv().add(stage1.getRooms().get(i).getEnemies().getDrops(0));
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
