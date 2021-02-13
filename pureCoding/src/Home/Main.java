package Home;



public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		Apartment a = new Apartment();
		Person p = new Person();
		Console cons = new Console();
		
			
			p.UnlockDoor("main door", "main key");
			p.OpenDoor("main door");
			p.CloseDoor("main door");
			Thread.sleep(5000);
			p.Smoking();	
			cons.Smoking(cons.scan);
					
			
			
//			p.Personality("Male", "Tomas", 30);
			
			
			

	
		/*
			
			
			p.CloseDoor("main door");
			p.LockDoor("main door", "main key");
		*/
			

	}

}
