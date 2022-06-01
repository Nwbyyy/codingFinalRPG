package codingFinalRPG;

import java.util.*;

public class Stage {

	private int stageNumber;
	private int roomsNumber;
	private ArrayList<Room> rooms;

	//Default stage constructor
	public Stage() {
		
		stageNumber = 1000;
		roomsNumber = 5;
		rooms = new ArrayList<Room>(roomsNumber);
		
	}
	
	//Custom stage constructor
	public Stage(int stageNum, int roomAmt, ArrayList<Room> rms) {
		
		stageNumber = stageNum;
		roomsNumber = roomAmt;
		rooms = rms;
		
	}

	//Retruns the list of rooms
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
}
