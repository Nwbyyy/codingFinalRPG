package codingFinalRPG;

import org.apache.commons.lang3.StringUtils;
import java.util.*;

public class RPGMethods {

	//Prints 100 spaces lol
	public static void spaces100() {
		for(int i = 0; i < 100; i++) {
	        System.out.println("");
	        }
	}

	//Waits 10 seconds
	public static void wait10() {

		try {
			Thread.sleep(10000);               
			} 
		 catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
		}

	}

	//Waits 5 seconds
	public static void wait5() {

		try {
			Thread.sleep(5000);               
			} 
		 catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
		}

	}

	//Displays the title card
	public static void DisplayStart() {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 1; i++) {
			System.out.printf("|%119s| %n", "");
		}

		System.out.printf("|%119s| %n", " ______     __  __     ______     ______     ______      ______   ______        ______   __  __     ______       ");
		System.out.printf("|%119s| %n", "/\\  __ \\   /\\ \\/\\ \\   /\\  ___\\   /\\  ___\\   /\\__  _\\    /\\__  _\\ /\\  __ \\      /\\__  _\\ /\\ \\_\\ \\   /\\  ___\\      ");
		System.out.printf("|%119s| %n", "\\ \\ \\/\\_\\  \\ \\ \\_\\ \\  \\ \\  __\\   \\ \\___  \\  \\/_/\\ \\/    \\/_/\\ \\/ \\ \\ \\/\\ \\     \\/_/\\ \\/ \\ \\  __ \\  \\ \\   __\\     ");
		System.out.printf("|%119s| %n", "\\ \\___\\_\\  \\ \\_____\\  \\ \\_____\\  \\/\\_____\\    \\ \\_\\       \\ \\_\\  \\ \\_____\\       \\ \\_\\  \\ \\_\\ \\_\\  \\ \\_____\\    ");
		System.out.printf("|%119s| %n", "\\/___/_/   \\/_____/   \\/_____/   \\/_____/     \\/_/        \\/_/   \\/_____/        \\/_/   \\/_/\\/_/   \\/_____/    ");
		System.out.printf("|%119s| %n", "");
		System.out.printf("|%119s| %n", "__         __  __     __   __     ______     __  __        __         __     __   __     ______     ______      ");
		System.out.printf("|%119s| %n", "/\\ \\       /\\ \\/\\ \\   /\\ \"-.\\ \\   /\\  ___\\   /\\ \\_\\ \\      /\\ \\       /\\ \\   /\\ \"-.\\ \\   /\\  ___\\   /\\  ___\\     ");
		System.out.printf("|%119s| %n", "\\ \\ \\____  \\ \\ \\_\\ \\  \\ \\ \\-.  \\  \\ \\ \\____  \\ \\  __ \\     \\ \\ \\____  \\ \\ \\  \\ \\ \\-.  \\  \\ \\  __\\   \\ \\___  \\    ");
		System.out.printf("|%119s| %n", "\\ \\_____\\  \\ \\_____\\  \\ \\_\\\\\"\\_\\  \\ \\_____\\  \\ \\_\\ \\_\\     \\ \\_____\\  \\ \\_\\  \\ \\_\\\\\"\\_\\  \\ \\_____\\  \\/\\_____\\   ");
		System.out.printf("|%119s| %n", "\\/_____/   \\/_____/   \\/_/ \\/_/   \\/_____/   \\/_/\\/_/      \\/_____/   \\/_/   \\/_/ \\/_/   \\/_____/   \\/_____/   ");
		
		System.out.printf("|%119s| %n", "");

		System.out.printf("|%119s| %n", ".__         .  .      .                                                  ");
		System.out.printf("|%119s| %n", "[__)  . *   |\\ |.    ,|_   .                                             ");
		System.out.printf("|%119s| %n", "[__)\\_| *   | \\| \\/\\/ [_)\\_|                                             ");
		System.out.printf("|%119s| %n", "._|                  ._|                                             ");

		System.out.printf("|%119s| %n", "");

		System.out.printf("|%119s| %n", "Start                                                         ");
		System.out.printf("|%119s| %n", "");
		System.out.printf("|%119s| %n", "Credits                                                        ");

		for(int i = 0; i < 1; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

	}

	//Continues the games depending on choice
	public static void StartChoices(String choice) {

		if(choice.equalsIgnoreCase("Start")) {
			RPGMethods.DisplayGuide();
		}

		else if(choice.equalsIgnoreCase("Credits")) {
			//RPGMethods.DisplayCredits();
		}

		else {
			System.out.println("Not a valid choice :/");
		}
	}

	//Displays combat choices
	public static String DisplayActions() {
		
		Scanner kboard = new Scanner(System.in);

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "|                                       |                                       ");
		}
		
		System.out.printf("|%s|%s|%s|%n",
                StringUtils.center("Attack", 39),
                StringUtils.center("Inventory", 39),
                StringUtils.center("Check", 39));

		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "|                                       |                                       ");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		String actionChoice = kboard.nextLine();

		return actionChoice;

		
	}
	
	//Displays the full guide sequence
	public static void DisplayGuide() {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		System.out.printf("|%119s| %n", ("   ___________________________                                              "));   
		System.out.printf("|%119s| %n", ("  / _________________________ \\                                             "));
		System.out.printf("|%119s| %n", ("  |/----,                    \\|                                             "));
		System.out.printf("|%119s| %n", ("  ||NEWS|                    ||                                             "));
		System.out.printf("|%119s| %n", ("  ||----\'     .-\"\"-.         ||                                             "));
		System.out.printf("|%119s| %n", ("  ||         / \\    \\        ||                                             "));
		System.out.printf("|%119s| %n", ("  ||         | /`-._|        ||                                             "));
		System.out.printf("|%119s| %n", ("  ||         |/ . . |        ||                                             "));
		System.out.printf("|%119s| %n", ("  ||         (   _\\ )        ||                                             "));
		System.out.printf("|%119s| %n", ("  ||         |\\  = |         ||                                             "));
		System.out.printf("|%119s| %n", ("  ||        /\\ \\_._/         ||                                             "));
		System.out.printf("|%119s| %n", ("  ||       /\\_\\___//\\        ||                                             "));
		System.out.printf("|%119s| %n", ("  ||     /`  \\  \\|   `\\      ||                                             "));
		System.out.printf("|%119s| %n", ("  |\\____/_____|__;_____|__CNN/|                                             "));
		System.out.printf("|%119s| %n", ("  \\___________________________/                                             "));
		System.out.printf("|%119s| %n", ("      |:::::::::::::::::::|                                                 "));
		System.out.printf("|%119s| %n", ("      |:::::::::::::::::::|                                                 "));
		System.out.printf("|%119s| %n", ("      |::():():::::():()::|                                                 "));
		System.out.printf("|%119s| %n", ("      |:::::::::::::::::::|                                                 "));
		System.out.printf("|%119s| %n", ("    __|:::::::::::::::::::|__                                               "));
		System.out.printf("|%119s| %n", ("   /                         \\                                              "));
		System.out.printf("|%119s| %n", ("  \'===========================\'                                             "));

		System.out.printf("|%119s| %n","");

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.printf("|%119s| %n", "");

		System.out.printf("|%s|%n",StringUtils.center("Breaking News! Clark Magnet High School has been overrun by creatures of all sorts!", 119));
		System.out.printf("|%s|%n",StringUtils.center("Luckily, most students were able to evacuate in time, however, there is still a student and a teacher trapped", 119));
		System.out.printf("|%s|%n",StringUtils.center("within the building! With no resuce teams avaliable, their only option is to fight their way out!", 119));

		System.out.printf("|%119s| %n", "");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		RPGMethods.wait10();

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.printf("|%119s| %n", "");

		System.out.printf("|%s|%n",StringUtils.center("To the student and teacher inside: There are items you can use within the classrooms", 119));
		System.out.printf("|%s|%n",StringUtils.center("to fend off the creatures around you. Make sure to stay safe and kill any monster that challenges you.", 119));
		System.out.printf("|%s|%n",StringUtils.center("Some items may be useful later, make sure to grab everything while you can. Good luck...", 119));
		System.out.printf("|%s|%n",StringUtils.center("(As you play, type in your actions as seen in the action boxes.)", 119));

		System.out.printf("|%119s| %n", "");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		RPGMethods.wait10();
		
		for(int i = 0; i < 100; i++) {
	        System.out.println("");
	        }
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.printf("|%119s| %n", "");

		System.out.printf("|%s|%n",StringUtils.center("Your fate is in your hands, choose to enter classrooms or keep moving.", 119));
		System.out.printf("|%s|%n",StringUtils.center("If you enter a classroom, you will be faced with a monster. Defeat it, and its loot is yours.", 119));
		System.out.printf("|%s|%n",StringUtils.center("On your way out of your classroom into the halls, you grab a ruler to protect yourself.", 119));

		System.out.printf("|%119s| %n", "");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		RPGMethods.wait5();

	}

	//Displays the goblin image
	public static void DisplayGoblin() {
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		System.out.printf("|%119s| %n", "           ,      ,                                                       ");
		System.out.printf("|%119s| %n", "          /(.-\"\"-.)\\                                                      ");
		System.out.printf("|%119s| %n", "      |\\  \\/      \\/  /|                                                  ");
		System.out.printf("|%119s| %n", "      | \\ / =.  .= \\ / |                                                  ");
		System.out.printf("|%119s| %n", "      \\( \\   o\\/o   / )/                                                  ");
		System.out.printf("|%119s| %n", "       \\_, '-/  \\-' ,_/                                                   ");
		System.out.printf("|%119s| %n", "         /   \\__/   \\                                                     ");
		System.out.printf("|%119s| %n", "         \\,___/\\___,/                                                     ");
		System.out.printf("|%119s| %n", "       ___\\ \\|--|/ /___                                                   ");
		System.out.printf("|%119s| %n", "     /`    \\      /    `\\                                                 ");
		System.out.printf("|%119s| %n", "    /       '----'       \\                                                ");

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
	}

	//Displays the options for rooms
	public static String DisplayOptions() {
		
		Scanner kboard = new Scanner(System.in);

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", StringUtils.center("|", 119));
		}
		
		System.out.printf("|%s|%s|%n",
                StringUtils.center("Enter Room", 59),
                StringUtils.center("Move On", 59));

		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", StringUtils.center("|", 119));
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		String optionChoice = kboard.nextLine();

		return optionChoice;
		
	}

	//Displays the message when you enter a room
	public static void DisplayEnterRoom() {

		RPGMethods.spaces100();
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n",
                StringUtils.center("You enter the classroom. Everything seems to be fine until you see the source of the noises you were hearing before.", 119),
                StringUtils.center("A monster moves to attack you!", 119));

		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}
	
	//Displays the message when youre in the hallway outside
	public static void DisplayFromHallway() {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("You come across a classroom, it sounds like there is something inside.", 119));

		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}
	
	//Displays the message when you attack
	public static void DisplayYourAttack(Character player, Enemy goblin) {

		RPGMethods.spaces100();

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("You strike the enemy with " + player.getInv().get(0).getName() + ", dealing " + player.getInv().get(0).getDamage() + " to the goblin.", 119));
		System.out.printf("|%s|%n", StringUtils.center("The goblin has " + goblin.getHealth() + " HP remaining.", 119));

		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}
	
	//Displays the message when the enemy attacks
	public static void DisplayEnemyAttack(Character player, Enemy goblin) {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("The goblin strikes you with " + goblin.getHeld().getName() + ", dealing " + goblin.getHeld().getDamage(), 119));
		System.out.printf("|%s|%n", StringUtils.center("You have " + player.getHealth() + " HP remaining.", 119));
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}
	
	//Displays the message when you check your inv
	public static void DisplayInventory(Character player) {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		for(Item i : player.getInv()) {
			if(i != null) {
				System.out.printf("|%s|%n", StringUtils.center(i.getName(), 119));
			}
			else {
				continue;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

	}
	
	//Displays the message when you check your inv
	public static void DisplayYouDied() {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("You died.", 119));
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}
	
	//Displays the message when you check your inv
	public static void DisplayEnemyDefeated() {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("The goblin has been defeated! Continue your adventure.", 119));
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}

	//Displays the options for invetory
	public static void DisplayInvOptions() {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", StringUtils.center("|", 119));
		}
		
		System.out.printf("|%s|%s|%n",
				StringUtils.center("Use Item (Slot Number Input)", 59),
				StringUtils.center("Exit", 59));

		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", StringUtils.center("|", 119));
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
	}

	//Displays the message when you heal
	public static void DisplayHealed(Character player) {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("You healed! Your new health is " + player.getHealth(), 119));
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}

	//Displays the message when you mana restore
	public static void DisplayRestoredMana(Character player) {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("You restored your mana! Your new mana is " + player.getMana(), 119));
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}

	//Displays the message when you move on
	public static void DisplayMoveOn() {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("You moved pass that room, who knows what was in there...", 119));
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}

	//Displays the message when you move on
	public static void DisplayEnemyMissed(Character player) {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("The enemy misses its swing! You still have " + player.getHealth() + " HP.", 119));
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}

	//Displays the message when you move on
	public static void DisplayBeatFloor() {

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center("You have completed this floor! You travel onwards to see what the next one holds...", 119));
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}

	//Displays the message when you move on
	public static void DisplayCheck(Enemy enemy) {

		RPGMethods.spaces100();

		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 1; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.printf("|%s|%n", StringUtils.center(enemy.getName() + " the " + enemy.getType(), 119));
		System.out.printf("|%s|%n", StringUtils.center("HP: " + enemy.getHealth(), 119));
		System.out.printf("|%s|%n", StringUtils.center("Holding: " + enemy.getHeld().getName() + " (Damage: " + enemy.getHeld().getDamage() + ")", 119));
		System.out.printf("|%s|%n", StringUtils.center("Drops: " + enemy.getDrops(0).getName(), 119));
		
		for(int i = 0; i < 1; i++) {
			System.out.printf("|%119s| %n", "");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	}

	//Runs the entire game (I cant belive this fits in a single method)
	public static void RunGameStage(Stage stage1, Character player) {

		Scanner kboard = new Scanner(System.in);

		int roomsTotal = 5;
		int slot = 1;
        String invChoice = "";
        String enterChoice = "";
        String actionChoice = "";

		for(int i = 0; i < roomsTotal; i++) {

            RPGMethods.spaces100();
            
            while(true) {

                RPGMethods.DisplayFromHallway();
	            enterChoice = RPGMethods.DisplayOptions();

                if(enterChoice.equalsIgnoreCase("enter room")) {
        
                    
                    RPGMethods.DisplayEnterRoom();
                    RPGMethods.wait5();
                    RPGMethods.spaces100();
                    System.out.println("Room: " + stage1.getRooms().get(i).getRoomNumber());
                    RPGMethods.DisplayGoblin();
                    
                    while(player.getHealth() > 0 && stage1.getRooms().get(i).getEnemies().getHealth() > 0) {
                    
                        actionChoice = RPGMethods.DisplayActions();
                        
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
            
                            RPGMethods.DisplayCheck(stage1.getRooms().get(i).getEnemies());
            
                        }

                    }
                    
                    if(player.getHealth() <= 0) {
                        
                        RPGMethods.DisplayYouDied();
                        RPGMethods.wait10();
                        System.exit(0);
                        
                    }
                    
                    else if(stage1.getRooms().get(i).getEnemies().getHealth() <= 0) {
                        
                        RPGMethods.DisplayEnemyDefeated();
                        player.getInv().add(stage1.getRooms().get(i).getEnemies().getDrops(0));
                        RPGMethods.wait5();
                    }

                    break;
                    
                }
        
                else if(enterChoice.equalsIgnoreCase("move on")) {
        
                    RPGMethods.spaces100();
                    RPGMethods.DisplayMoveOn();
                    RPGMethods.wait5();
                    break;
        
                }
        
                else {
        
                System.out.println("That's not an option...");
                continue;
        
                }
            }
        }

		RPGMethods.spaces100();
		RPGMethods.DisplayBeatFloor();
		RPGMethods.wait5();
	}

}


/*

Final Boss:

                   _,,,_
                  /     \
                  ;      ;
                 (  '7'  )
                  ;  ~  ;
                   \ _ /
                .---)_(---.
               /\\  <_>  //\ 
              ;   > / \ <' _;
              |   | | | |   |
         _____|  |\_|_|_/_  |_______
        /    /  /        /  /      /|
       /   \/==/------, /==/      //|
      /    (\( -     /  \\(      //||
     /       / ~~~~ /           // ||
    /       '------'           //  ||
   /__________________________//   ||
   |-------------------------;;    ||
   ||   ||     |  ||  |==||  ||    ||
   ||   ||     |==||==|  ||  ||    ||
   ||   |/    /  / /  /      ||    |/
   ||        (__/ (__/       ||
   ||                        || 
   ||                        ||
   |/                        |/
*/
