package encapsulation;

public class Hotel {
	private String name;
	private Manager manager;
	private Room [] rooms = new Room[5];
	
	Hotel(String name) {
		this.name = name;
		
		//EARLY 
		rooms[0] = new Room("101");
		rooms[1] = new Room("102");
		rooms[2] = new Room("103");
		
	}
	
	public String getName() {
		return name;
	}
	
	public void appointManager(String name, int age) {
		manager = new Manager(name, age);
	}
	
	public Manager getManager() {
		return manager;
	}
	
	public void addRoom(String roomNumber) {
		
		//LAZY 
		for(int i = 0 ; i < rooms.length; i++) {
			if(rooms[i] != null) {
				rooms[i] = new Room(roomNumber);
				break;
			}
		}
	}
	
	public boolean removeRoom(String roomNumber) {
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null && rooms[i].getNumber().equals(roomNumber)) {
				for (int j = i; j < rooms.length - 1; j++) { 
					rooms[j] = rooms[j + 1]; 
					}	
				rooms[rooms.length - 1] = null; 
				System.out.println("Room " + roomNumber + " removed."); 
				return true;
			}
		}
		System.out.println("Room " + roomNumber + " not found."); 
		return false;
	}
    public Room findRoom(String roomNumber) {
    	for(int i = 0; i < rooms.length; i++) {
    		if(rooms[i] != null && rooms[i].getNumber().equals(roomNumber)) 
    		{
    			return rooms[i];
    		}
    	}
    	return null;
    }

}
