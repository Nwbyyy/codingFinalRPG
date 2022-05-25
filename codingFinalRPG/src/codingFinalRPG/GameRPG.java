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

    }

}