package conditional;
import java.util.Scanner;

public class conditional {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int ageLimit = 18;
	
	System.out.println("How old are you?");
	
	String ageString = input.nextLine();
	int age = Integer.parseInt(ageString);

	if(age <= ageLimit) {
		System.out.println("Welcome");
	} else {
		System.out.println("Sorry, have a nice day!");
		System.exit(0);
	}
}
}