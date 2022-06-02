package codingFinalRPG;

import java.util.*;
import java.util.Scanner;


public class GameRPG {

    public static void main(String[] args) {

        //Initializes needed variables
        Scanner kboard = new Scanner(System.in);
        int roomsTotal = 5;
        String startChoice = "";
        
        //Player weapon (buffed to test atm)
        Item rulerWep = new Item("The Ruler", 160.0, 100, false, false, false, 0, 0, 0);
        
        //Boss weapon and drops
        Item burrito = new Item("Breakfast Burrito", 0, 1, true, false, false, 100, 0, 0);
        Item[] bossDrops = {burrito};
        
        //ArrayList of player inventory
        ArrayList<Item> inv = new ArrayList<Item>();
        inv.add(rulerWep);
        	
        //Creates player :)
        Character player = new Character(1000000.0, 100, 5, inv);
        
        //Creates final boss :0
        Enemy finalBoss = new Enemy("Mr. K", "Teacher", 1000.0, 100, rulerWep, bossDrops);

        //Starts the game
        RPGMethods.DisplayStart();
        startChoice = kboard.nextLine();
        RPGMethods.spaces100();
        RPGMethods.StartChoices(startChoice);
        
        //Creates first stage and runs the game
        Stage stage = new Stage(roomsTotal, Room.GenerateRooms(1, roomsTotal));
        RPGMethods.RunGameStage(stage, player);

        //Creates second stage and runs the game with new stage
        stage = new Stage(roomsTotal, Room.GenerateRooms(2, roomsTotal));
        RPGMethods.RunGameStage(stage, player);

        //final boss here?
        RPGMethods.DisplayBossDialog();
        RPGMethods.DisplayFinalBoss();
        
        
        //Scanner kboard = new Scanner(System.in);

        int slot = 1;
        String invChoice = "";
        String actionChoice = "";
        boolean weakened = false;
        
        while(player.getHealth() > 0 && finalBoss.getHealth() > 0) {
            
            actionChoice = RPGMethods.DisplayActions();
            
            if(actionChoice.equalsIgnoreCase("attack")) {
                
               weakened = Combat.BossAttackSeq(player, finalBoss);
               
            }
            
            else if(actionChoice.equalsIgnoreCase("Inventory")) {
                
                RPGMethods.spaces100();
                RPGMethods.DisplayInventory(player);
                RPGMethods.DisplayInvOptions();
                
                invChoice = kboard.nextLine();
                
                if(invChoice.equalsIgnoreCase("exit")) {
                    
                	RPGMethods.spaces100();
                    continue;
                    
                }

                else {
                    
                    slot = Integer.parseInt(invChoice);
                    
                    Item.useItem(player, slot);
                    
                }

            }

            else if(actionChoice.equalsIgnoreCase("check")) {

                RPGMethods.DisplayCheck(finalBoss);

            }

        }

        kboard.close();

    }

}


