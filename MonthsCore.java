package Assignments;

/* Assignment 7.1 
 * Write a method and pass month value (atleast 6) and display its month name using SWITCH CASE */

public class MonthsCore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		displayMonth("Jan");
		displayMonth("Feb");
		displayMonth("Mar");
		displayMonth("Apr");
		displayMonth("May");
		displayMonth("June");
		System.out.println("End Method");
	}

	static void displayMonth(String displayCal){
		switch (displayCal){
		case "Jan":
					System.out.println("Month is Jan");
					break;
		case "Feb":
			System.out.println("Month is Feb");
			break;
		case "Mar":
			System.out.println("Month is Mar");
			break;
		case "Apr":
			System.out.println("Month is Apr");
			break;
		case "May":
			System.out.println("Month is May");
			break;
		case "June":
			System.out.println("Month is June");
			break;
				
		
		}
	}
	
}
