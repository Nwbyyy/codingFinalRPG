package codingFinalRPG;

public class RPGMethods {
	
	public static void DisplayOptions() {
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%85s| %n", "|                              |                           ");
		}
		
		System.out.printf("|%85s| %n", "Attack           |          Inventory           |           Check           ");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("|%85s| %n", "|                              |                           ");
		}
		
		System.out.println("---------------------------------------------------------------------------------------");
		
	}
	
	public static void DisplayGoblin() {
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		System.out.printf("|%85s| %n", "           ,      ,                                      ");
		System.out.printf("|%85s| %n", "          /(.-\"\"-.)\\                                     ");
		System.out.printf("|%85s| %n", "      |\\  \\/      \\/  /|                                 ");
		System.out.printf("|%85s| %n", "      | \\ / =.  .= \\ / |                                 ");
		System.out.printf("|%85s| %n", "      \\( \\   o\\/o   / )/                                 ");
		System.out.printf("|%85s| %n", "       \\_, '-/  \\-' ,_/                                  ");
		System.out.printf("|%85s| %n", "         /   \\__/   \\                                    ");
		System.out.printf("|%85s| %n", "         \\,___/\\___,/                                    ");
		System.out.printf("|%85s| %n", "       ___\\ \\|--|/ /___                                  ");
		System.out.printf("|%85s| %n", "     /`    \\      /    `\\                                ");
		System.out.printf("|%85s| %n", "    /       '----'       \\                               ");

		System.out.println("---------------------------------------------------------------------------------------");
		
	}





	
}
