
public class SwitchDemoEX {
	public static void main(String[] args) {

		System.out.println("Starting of main method");
		displayProfile("raja");
		System.out.println("Ending of main method");
	}
	
	static void displayProfile(String playerName) {
		
		switch(playerName){
			case "class" : 
				System.out.println("Class start today");
				System.out.println("Class will be held everyday");
				break;
			case "raja" : 
				System.out.println("raja works everyday");
				System.out.println("raja do examples everyday");
				
			case "java" : 
				System.out.println("java is based on coding");
				System.out.println("java is coding language ");
				
		}		
		
	}
}

	