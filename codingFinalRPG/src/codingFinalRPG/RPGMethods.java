package codingFinalRPG;

import org.apache.commons.lang3.StringUtils;

public class RPGMethods {

	public static void spaces100() {
		for(int i = 0; i < 100; i++) {
	        System.out.println("");
	        }
	}

	public static void wait10() {

		try {
			Thread.sleep(10000);               
			} 
		 catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
		}

	}

	public static void wait5() {

		try {
			Thread.sleep(5000);               
			} 
		 catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
		}

	}

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

	public static void DisplayActions() {
		
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
		
	}
	
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

		System.out.printf("|%s|%n",StringUtils.center("Your fate is in your hands, chose to enter classrooms or keep moving.", 119));
		System.out.printf("|%s|%n",StringUtils.center("If you enter a classroom, you will be faced with a monster. Defeat it, and its loot is yours.", 119));
		System.out.printf("|%s|%n",StringUtils.center("On your way out of your classroom into the halls, you grab a ruler to protect yourself.", 119));
		System.out.printf("|%s|%n",StringUtils.center("Once in the hallway, you come across your first classroom... You hear sounds coming from behind the door...", 119));

		System.out.printf("|%119s| %n", "");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		RPGMethods.wait5();

	}

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

	public static void DisplayOptions() {
		
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
		
	}

	public static void DisplayEnterRoom() {

		for(int i = 0; i < 100; i++) {
	        System.out.println("");
	    }

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
