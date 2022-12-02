package controlFlow;
import java.util.Scanner;
import java.util.ArrayList;

public class ControlFlow {
	
	public static ArrayList<Integer> repo1 = new ArrayList<>();
	public static ArrayList<String> repo2 = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	

				//System.out.println("Hello, World!"); 
		System.out.println("Hello, World!");
		System.out.println("Please use the following valid entries.");
		AsciiChars.printNumbers();
		System.out.println();
		AsciiChars.printLowerCase();
		System.out.println();
		AsciiChars.printUpperCase();
		System.out.println();
		
		completeSurvey();
		luckyNumbers();
}

	public static void completeSurvey() {
		
		//create global arrayLists

	
//interact with user name
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String firstName = input.nextLine();
		
		System.out.printf("Hello %s!\n", firstName);
		
		System.out.println("Would you like to complete a survey?");
		String contSurvey = input.nextLine();
			if (contSurvey.equalsIgnoreCase("yes")) {
				questions();
			} else if (contSurvey.equalsIgnoreCase("no")) {
				System.out.println("please return later to complete the survey.");
				System.out.println("Goodbye");
				
			//	System.out.println("What is your last name?");
			//	String lastName = input.nextLine();
			}
	}
			
public static void questions() {
	Scanner input = new Scanner(System.in);
	
		String i0 = "What is your favorite movie star's first name?";
		String i1 = "Who is your fav pet?";
		String i2 = "Do you have a red car (yes or no).";
		String i3 = "How many years before your favorite pet dies?";
		String i4 = "What number do you consider to be lucky?";
		String i5 = "What is a number of your fav athlete?";
		String i6 = "Please give me a whole number between 1 and 50.";
		String i7 = "What year is your car- giving only the last 2 digits?";
		String [] survey = { i0, i1, i2, i3, i4, i5, i6, i7};
		
		//loop for string responses
		for (int i = 0; i < 3; i++) {
			System.out.println(survey[i]);
			String a = input.next();
			repo2.add(i, a);
		}
		
		//loop for int responses
		for (int i = 3; i < survey.length; i++) {
			System.out.println(survey[i]);
			int a = input.nextInt();
			int ix = i -3;
			repo1.add(ix, a);
			
		
		}
		
		System.out.println(repo1);
		System.out.println(repo2);
}
		
		
public static void luckyNumbers() {
	
	//magic 8ball min 1 max 75- math.random- 3 int
	int min = 1;
	int max = 75;
	
	int magic8Ball = (int)Math.floor(Math.random() * (max - min +1) +min);
	
	
// lottery numbers 3 int random= min 1, max 65
	int lmax = 65;
	int lottery1 = (int) Math.floor(Math.random() * (lmax - min +1) + min);
	int lottery2 = (int) Math.floor(Math.random() * (lmax - min +1) + min);
	int lottery3 = (int) Math.floor(Math.random() * (lmax - min +1) + min);
	
//	System.out.println(magic8Ball);
//	System.out.println(lottery1);
//	System.out.println(lottery2);
//	System.out.println(lottery3);

	//magic ball
	int magicB = (repo1.get(1) * magic8Ball);
	
	
	//lottery numbers 1-5
	int lot1 = repo1.get(2) + repo1.get(0) + repo1.get(1);//fav athlete # + pet death + lucky #
	int lot2 = repo1.get(0) + repo1.get(4);//pet death + car yr
	int lot3 = 42; //42
	int lot4 = repo1.get(3) - lottery1;//use rdm # between 1-50, subtracting 1 of the generated rdm #s
	int lot5 = repo1.get(4) + repo1.get(1);//use car + lucky number
	
	//fix lot1 if needed
	if (lot1 > lmax) {
		lot1 = lot1 - lmax;
	} else if (lot1 < min) {
		lot1 = lot1 + Math.abs(-1);
	} 
	
	//fix lot2if needed
	if (lot2 > lmax) {
			lot2 = lot2 - lmax;
	} else if (lot2 < min) {
			lot2 = lot2 + Math.abs(-1);
	} 
	//fix lot4 if needed
	if (lot4 > lmax) {
		lot4 = lot4 - lmax + Math.abs(-1);
	}
	else if(min > lot4) {
		lot4 = lot4 + 50;
	}
	
	//fix lot5 if needed
	if (lot5 > lmax) {
		lot5 = lot5 - lmax + Math.abs(-1);
	}
	else if (lot5 < min) {
		lot5 = lot5 + Math.abs(-1);
	}
	
	
	//give numbers to survey participant
	System.out.println("Lottery numbers: " + lot1 + ", " + lot2 + ", " + lot2 + ", " + lot3 + ", " + lot4 + ", " +lot5 + " Magic ball: " + magicB);
	doOver();
			}
public static void doOver () {
	Scanner input = new Scanner(System.in);
	System.out.println("Would you like to try for different numbers?");
	String doAgain = input.nextLine();
	
	if (doAgain.equalsIgnoreCase("yes")) {
		questions();
	} else if (doAgain.equalsIgnoreCase("no")) {
		System.out.println("Hope you find luck with the numbers, thanks for taking the survey.");
		System.out.println("Goodbye");
		

	

	}
	
	}}

