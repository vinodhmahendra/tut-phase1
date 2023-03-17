package composition;

public class House {
	
	private Room livingRoom;
	private Room bedroom;
	
	
	public House() {
		livingRoom = new Room("Living Room");
		bedroom = new Room("Bedroom");
	}
	
	public void describe() {
		System.out.println("This house has a " + livingRoom.getName() + " and a "+bedroom.getName());
		
	}

}
