package Home;

public class Apartment {

	public void UnlockDoor(String doorInput, String key) {
		
		String mainDoor = "main door";
		String mainKey = "main key";
		
		if(doorInput.equals(mainDoor) && key.equals(mainKey)) {
			System.out.println("- Story: He arrived at his floor after "
					+ "a borring minute in the elevator,"
					+ " felt like a whole eternity in his busy mind"
					+ " overflown by his rushing thoughts.");
			System.out.println();
			System.out.println("- Tomas: 'Where did I put those damn keys,"
					+ " which pocket are they?'");
			System.out.println();
			System.out.println("- Story: Tomas reached to his front-right "
					+ "poket and took out a bunch of keys."
					+ " Choose one and quickly sticked it in the lock.");
					
			System.out.println("... main door unlocked!".toUpperCase());

		} 
		else {
			System.out.println("- Story: He arrived at his floor after "
					+ "a borring minute in the elevator,"
					+ " felt like a whole eternity in his busy mind"
					+ " overflown by his rushing thoughts.");
			System.out.println();
			System.out.println("- Tomas: 'Where did I put those damn keys,"
					+ " which pocket are they?'");
			System.out.println();
			System.out.println("- Story: Tomas was nervously touching his pockets"
					+ " wandering where the keys could be.");
			
			
			
			
			
			System.out.println("unlocking main door Failed");
		}
	}
		
	public void LockDoor(String doorInput, String key) {
			
			String mainDoor = "main door";
			String mainKey = "main key";
			
			
			if(doorInput.equals(mainDoor) && key.equals(mainKey)) {
				System.out.println("Main door locked");
			} else {
				System.out.println("locking main door Failed");
			}
		
	}

	public void OpenDoor(String doorInput) {
		System.out.println(doorInput + " is opened");
	}
	
	public void CloseDoor(String doorInput) {
		System.out.println(doorInput + " is closed");
	}
	
	
	
	
	public String livingRoom;
	public String bathroom;
	public String bedroom;
	
	public String mainDoor;
	public String livingroomDoor;
	public String bedroomDoor;
	public String bathroomDoor;
}
