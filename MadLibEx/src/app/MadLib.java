//Create a new project called MadLib using Eclipse.
//Example:
//Dear name,
//You are adverb adjective and I want to be your noun! I want to go to the nounTwo with you in number days.  
//Sincerely, yourName
//Use the variables below to compose the following paragraph:
//name, adjective, verbOne, verbTwo, number, yourName
package app;

public class MadLib {
	import java.util.Scanner;
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Type a name?");
	String name = input.nextLine();
	System.out.println("What is an adjective?");
	String adjective = input.nextLine();
	System.out.println("Type a verb");
	String verbOne = input.nextLine();
	System.out.println("Type a second verb");
	String verbTwo = input.nextLine();
	System.out.println("What is your favorite number?");
	// needs to be changed to integer number = 
	System.out.println("What is your name?");
	String yourName = input.nextLine();
}


System.out.printf("Dear %s,", name);
System.out.printf("You are %s %s and I want to be your %s!"
		+ " I want to go to the %s  with you in 7 days.", adjective, verbOne, verbTwo);
System.out.printf("Sincerely, %s", yourName);