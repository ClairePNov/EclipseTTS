package helloWorld;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println("Hello, World!"); 
		//System.out.print("Today is awesome!\n");
		//System.out.print("...don't you think?\n");
		System.out.println("What is your name?");
		String firstName = input.nextLine();
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		System.out.printf("Hello %s %s!\n", firstName, lastName);
		System.out.printf("Goodbye %s, %s!\n", lastName, firstName);
    }

}
