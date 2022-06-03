package codingFinalRPG;

import java.util.*;
import java.util.Scanner;

public class GameRPG {

    public static void main(String[] args) {

        //Initializes needed variables
        Scanner kboard = new Scanner(System.in);
        int roomsTotal = 5;
        
        //Player weapon
        Item rulerWep = new Item("The Ruler", 16.0, 100, false, false, false, 0, 0, 0);
        
        //Boss weapon and drops
        Item gradeBookWep = new Item("Grade Book", 15.0, 100, false, false, false, 0, 0, 0);
        Item burrito = new Item("Breakfast Burrito", 0, 1, true, false, false, 100, 0, 0);
        Item[] bossDrops = {burrito};
        
        //ArrayList of player inventory
        ArrayList<Item> inv = new ArrayList<Item>();
        inv.add(rulerWep);
        	
        //Creates player :)
        Character player = new Character(100.0, 100, 5, inv);
        
        //Creates final boss :0
        Enemy finalBoss = new Enemy("Mr. K", "Teacher", 1000.0, 100, gradeBookWep, bossDrops);

        //Starts the game
        RPGMethods.DisplayStart();
        
        //Creates first stage and runs the game
        Stage stage = new Stage(roomsTotal, Room.GenerateRooms(1, roomsTotal));
        RPGMethods.RunGameStage(stage, player);

        //Creates second stage and runs the game with new stage
        stage = new Stage(roomsTotal, Room.GenerateRooms(2, roomsTotal));
        RPGMethods.RunGameStage(stage, player);

        //Final boss sequence
        RPGMethods.RunGameBoss(player, finalBoss);

        kboard.close();

    }

}




