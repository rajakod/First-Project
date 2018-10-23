package Inheritance;

public class MethodOverloading {
	  public static void main(String args[])
	   {
	       MethodOverloading obj = new MethodOverloading();
	       
	       obj.disp('x', 50 );
	       obj.disp(50, 'y');
	   }
	   public void disp(char c, int num)
	   {
	       System.out.println("I’m the first definition of method disp");
	   }
	   public void disp(int num, char c)
	   {
	       System.out.println("I’m the second definition of method disp" );
	   }
	}
