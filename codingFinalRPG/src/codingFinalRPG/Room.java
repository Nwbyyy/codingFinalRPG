package codingFinalRPG;

import java.util.*;

public class Room {

    private Enemy enemies;
    private Item roomLoot;
    private int roomNumber;

    //Default room constructor
    public Room() {

        enemies = null;
        roomLoot = null;
        roomNumber = 1000;

    }

    //Custom room constructor
    public Room(Enemy enemy, Item loot, int num) {
    
        enemies = enemy;
        roomLoot = loot;
        roomNumber = num;

    }

    //Generates random custom rooms to be put into the stage arrays
    public static ArrayList<Room> GenerateRooms(int stageNum, int roomsTotal) {
        
        ArrayList<Room> rooms = new ArrayList<Room>();

        //Weapons and drops ('Item' object) for monsters in room
        Item rulerWep = new Item("The Ruler", 20.0, 100, false, false, false, 0, 0, 0);
		Item pencilWep = new Item("The Pencil", 14.0, 100, false, false, false, 0, 0, 0);
		Item penWep = new Item("The Pen", 24.0, 100, false, false, false, 0, 0, 0);
        Item healthPotion = new Item("Health Potion", 0.0, 1, true, false, false, 50, 0, 0);
		Item manaPotion = new Item("Mana Potion", 0.0, 1, false, true, false, 0, 50, 0);

        Item[] lootTable = {rulerWep, pencilWep, penWep, healthPotion, manaPotion};
        
        //Creates multiple rooms to put into a list
        for(int i = 0; i < roomsTotal; i++) {
            
            //Uses method to create all the enemies in the room
            Enemy enemy = Enemy.CreateEnemy(stageNum);

            //Randomly drops one of five items after defeating enemy
            Item endRoomLoot = lootTable[((int) (Math.random()*5))];

            //Randomly generates room number depending on your floor
            int roomNum = (int) ((Math.random() * ((1999+((stageNum-1)*1000)) - (1000+((stageNum-1)*1000)))) + (1000+((stageNum-1)*1000)));

            Room room = new Room(enemy, endRoomLoot, roomNum);
            rooms.add(room);

        }

        return rooms;

    }

    //Returns the enemy list (eventually needed)
    public Enemy getEnemies() {
        return enemies;
    }

    //Returns the loot in the room (testing)
    public Item getRoomLoot() {
        return roomLoot;
    }

    //Returns the room number (testing)
    public int getRoomNumber() {
        return roomNumber;
    }

}
