package codingFinalRPG;

import java.util.*;

public class Stage {

	private int roomsNumber;
	private ArrayList<Room> rooms;

	//Default stage constructor
	public Stage() {
		
		roomsNumber = 5;
		rooms = new ArrayList<Room>(roomsNumber);
		
	}
	
	//Custom stage constructor
	public Stage(int roomAmt, ArrayList<Room> rms) {
		
		roomsNumber = roomAmt;
		rooms = rms;
		
	}

	//Retruns the list of rooms
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
}
