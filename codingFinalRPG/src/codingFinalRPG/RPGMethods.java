package codingFinalRPG;

import org.apache.commons.lang3.StringUtils;
import java.lang.Math.*;

public class RPGMethods {

	public static void wait10() {

		try {
			Thread.sleep(10000);               
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

	public static void DisplayOptions() {
		
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

	public static void CreateEnemy(int stageNum) {
		
		String[] names = {"Crested Veno","Ebok","Great Zolo","Nomad Enora","Orange Cromo","Alco","Oroo","Pheba","Pink Qolg","Pode","Arra","Black Anate","Black Sevobo","Fanged Hene","Rosetag","Ergosa","Gotorc","Kalo","Mioutor","Seryag","Aiol","Asabo","Boctale","Erthol","Qonc","Ashra","Blue Odora","Levat","Mammoth Pega","Acknag","Aiorabe","Avonada","Black Aiosara","Eveot","Anarbe","Andra","Enovog","Geenod","Giant Daio","Great Orva"};
		String name = names[((int) (Math.random()*40))];
		
		String[] types = {"Goblin"};
		String type = types[((int) (Math.random()*1))];
		
//		Enemy monster = new Enemy(name, )
		
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

/*
"Crested Veno","Ebok","Great Zolo","Nomad Enora","Orange Cromo","Alco","Oroo","Pheba","Pink Qolg","Pode","Arra","Black Anate","Black Sevobo","Fanged Hene","Rosetag","Ergosa","Gotorc","Kalo","Mioutor","Seryag","Aiol","Asabo","Boctale","Erthol","Qonc","Ashra","Blue Odora","Levat","Mammoth Pega","Acknag","Aiorabe","Avonada","Black Aiosara","Eveot","Anarbe","Andra","Enovog","Geenod","Giant Daio","Great Orva"
*/
