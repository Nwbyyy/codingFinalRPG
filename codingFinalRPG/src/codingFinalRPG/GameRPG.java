package codingFinalRPG;

import java.util.Scanner;

public class GameRPG {

    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);
        int stageNum = 1;
        int roomsTotal = 5;
        String startChoice = "";

        RPGMethods.DisplayStart();
        startChoice = kboard.nextLine();

        for(int i = 0; i < 100; i++) {
        System.out.println("");
        }

        RPGMethods.StartChoices(startChoice);

        Stage stage1 = new Stage(1, 5, Room.GenerateRooms(stageNum, roomsTotal));
            
        if(RPGMethods.DisplayOptions().equalsIgnoreCase("enter room")) {

            RPGMethods.DisplayEnterRoom();
            RPGMethods.wait10();
            RPGMethods.spaces100();
            RPGMethods.DisplayGoblin();
            
            if(RPGMethods.DisplayActions().equalsIgnoreCase("attack")) {
                
                //Combat.attack(enemy?);

            }

            else if(RPGMethods.DisplayActions().equalsIgnoreCase("inventory")) {

                //Character.invetory(?);

            }

            else if(RPGMethods.DisplayActions().equalsIgnoreCase("check")) {

                //RPGMethods.check(enemy);

            }
            
        }

        else if(RPGMethods.DisplayOptions().equalsIgnoreCase("move on")) {



        }

        else {



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
