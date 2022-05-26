package codingFinalRPG;

public class Stage {

	private int stageNumber;
	private int roomsNumber;
	private Room[] rooms;

	
	public Stage() {
		
		stageNumber = 0;
		roomsNumber = 5;
		rooms = new Room[roomsNumber];
		
	}
	
	public Stage(int stageNum, int roomAmt, Room[] rms) {
		
		stageNumber = stageNum;
		roomsNumber = roomAmt;
		rooms = rms;
		
	}

	public Room[] getRooms() {
		return rooms;
	}
}
