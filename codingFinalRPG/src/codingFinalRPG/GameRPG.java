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
        
        //ArrayList of player inventory
        ArrayList<Item> inv = new ArrayList<Item>();
        inv.add(rulerWep);
        	
        //Creates player :)
        Character player = new Character(1000000.0, 100, 5, inv);

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

        kboard.close();

    }

}
