package encapsulation;

public class Room {
	private String number;
	private boolean occupied;
	
	Room(String number){
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public boolean isOccupied() {
		return occupied;
	}

}
