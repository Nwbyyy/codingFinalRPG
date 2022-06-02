package codingFinalRPG;

import java.util.*;
import java.util.Scanner;


public class GameRPG {

    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);
        int roomsTotal = 5;
        String startChoice = "";
        
        Item rulerWep = new Item("The Ruler", 160.0, 100, false, false, false, 0, 0, 0);
        
        ArrayList<Item> inv = new ArrayList<Item>();
        inv.add(rulerWep);
        		
        Character player = new Character(1000000.0, 100, 5, inv);

        RPGMethods.DisplayStart();
        startChoice = kboard.nextLine();

        RPGMethods.spaces100();

        RPGMethods.StartChoices(startChoice);
        
        Stage stage = new Stage(roomsTotal, Room.GenerateRooms(1, roomsTotal));
        
        RPGMethods.RunGameStage(stage, player);

        stage = new Stage(roomsTotal, Room.GenerateRooms(2, roomsTotal));

        RPGMethods.RunGameStage(stage, player);

        //final boss here?

        kboard.close();

    }

}
