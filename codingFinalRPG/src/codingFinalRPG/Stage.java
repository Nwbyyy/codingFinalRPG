package codingFinalRPG;

public class Stage {

	private int stageNumber;
	private int roomsNumber;
	private Room[] rooms;

	//Default stage constructor
	public Stage() {
		
		stageNumber = 1000;
		roomsNumber = 5;
		rooms = new Room[roomsNumber];
		
	}
	
	//Custom stage constructor
	public Stage(int stageNum, int roomAmt, Room[] rms) {
		
		stageNumber = stageNum;
		roomsNumber = roomAmt;
		rooms = rms;
		
	}

	//Retruns the list of rooms
	public Room[] getRooms() {
		return rooms;
	}
	
}
