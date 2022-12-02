package exceptions;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  public static void main(String[] args) {
		    int result = divide();
		    System.out.println(result);
		  }
		  
		  private static int divide() {
		    int x = getInt();
		    int y = getInt();
		    System.out.println("x is " + x + ", y is " + y);
		    return x / y;
		  }
		  
		  private static int getInt() {
		    Scanner s = new Svanner(System.in);
		    System.out.println("Please enter a number ");
		    return s.next(Int);
		  }
		}
	}

}
