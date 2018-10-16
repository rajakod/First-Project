
public class Assignment3Core {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.out.println("Starting of main method");	
		 displayDetails("babu", "advancedJava", "45", "Malli"); 
		 displayDetails("satya", "ui", "65", "Raja");  
		 displayDetails("gopal", "spring", "45", "Bhanu"); 
	    System.out.println("Ending of main method");
	}
	
	 static void displayDetails(String name, String course, String duration, String boyName ){
		System.out.println("name provided as input for this method is "+name);
		System.out.println("course provided as input for this method is "+course);
		System.out.println("email provided as input for this method is "+ duration);
		System.out.println("email provided as input for this method is "+ boyName);
		
	}
	}
