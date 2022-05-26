package codingFinalRPG;

import java.util.Scanner;

public class GameRPG {

    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);

        RPGMethods.DisplayStart();
        String startChoice = kboard.nextLine();

        for(int i = 0; i < 100; i++) {
        System.out.println("");
        }

        RPGMethods.StartChoices(startChoice);

        kboard.close();
   

    	
//    	Enemy monster1 = Enemy.CreateEnemy(0);
//    	
//    	System.out.println(monster1.getName() + " the " + monster1.getType());
//    	System.out.println(monster1.getHealth());
//    	System.out.println(monster1.getMana());
//    	System.out.println(monster1.getHeld(0).getName());
//    	System.out.println(monster1.getDrops(0).getName());

    }

}
