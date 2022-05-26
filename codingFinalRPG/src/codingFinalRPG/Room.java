package codingFinalRPG;

public class Room {

    private Enemy[] enemies;
    private Item roomLoot;
    private int roomNumber;

    public Room() {

        enemies = new Enemy[1];
        roomLoot = null;
        roomNumber = 1000;

    }

    public Room(Enemy[] enemy, Item loot, int num) {
    
        enemies = enemy;
        roomLoot = loot;
        roomNumber = num;

    }

    public static Room[] GenerateRooms(int stageNum, int roomsTotal) {
        
        Room[] rooms;
        rooms = new Room[roomsTotal];

        Enemy[] enemies;
        enemies = new Enemy[1];

        Item rulerWep = new Item("The Ruler", 20.0, 100, false, false, false, 0, 0, 0);
		Item pencilWep = new Item("The Pencil", 14.0, 100, false, false, false, 0, 0, 0);
		Item penWep = new Item("The Pen", 24.0, 100, false, false, false, 0, 0, 0);
        Item healthPotion = new Item("Health Potion", 0.0, 1, true, false, false, 50, 0, 0);
		Item manaPotion = new Item("Mana Potion", 0.0, 1, false, true, false, 0, 50, 0);

        Item[] lootTable = {rulerWep, pencilWep, penWep, healthPotion, manaPotion};
        

        for(int i = 0; i < roomsTotal; i++) {

            enemies[0] = Enemy.CreateEnemy(stageNum);

            
            Item endRoomLoot = lootTable[((int) (Math.random()*5))];

            int roomNum = (int) ((Math.random() * ((1999+((stageNum-1)*1000)) - (1000+((stageNum-1)*1000)))) + (1000+((stageNum-1)*1000)));

            Room room = new Room(enemies, endRoomLoot, roomNum);
            rooms[i] = room;

        }

        return rooms;

    }

    public Enemy[] getEnemies() {
        return enemies;
    }

    public Item getRoomLoot() {
        return roomLoot;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}