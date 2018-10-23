
import java.util.Scanner;

public class Assignment14Core {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter a Some Number : ");
	        @SuppressWarnings("resource")
			int drome = new Scanner(System.in).nextInt();
	       
	        if(Palindrome(drome)){
	            System.out.println("Number = " + drome + " is a palindrome");
	        }else{
	            System.out.println("Number = " + drome + " not a palindrome");
	        }      
	      
		}
		public static boolean Palindrome(int number) {
	        int drome = number; // copied number into variable
	        int reverse = 0;

	        while (drome != 0) {
	            int remainder = drome % 10;
	            reverse = reverse * 10 + remainder;
	            drome = drome / 10;
	        }
	        if (number == reverse) {
	            return true;
	        }
	        return false;
	    }
	}


