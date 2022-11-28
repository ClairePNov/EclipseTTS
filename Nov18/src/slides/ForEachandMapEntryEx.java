package slides;

import java.util.HashMap;
import java.util.Scanner;

public class ForEachandMapEntryEx {
	
public static void main(String [] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please type 5 numbers.");
	String response = input.nextLine();
	
	//hashmap
	HashMap<String, Integer> person = new HashMap<>();

	//.put adds items to the hash map
	person.put("Joan", 21);
	person.put("Anna", 34);
	person.put("Mike", 55);
	person.put("Daniel", 42);

	//creates the following HashMap
	=> {Joan=21, Mike=55, Daniel=42, Anna=34}


	//.get retrieves data from the hash map
	person.get("Joan");
	=> 21 //returns the value associated with the key


			//2
			HashMap<String, Integer> vehicles = new HashMap<String, Integer>();
	System.out.println("What car model are you looking for?");
	
	vehicles.put("toyota", "tundra");
	String query = input.nextLine();
	
	
	//determine if they have the vehicle
	if(vehicles.containsKey(query)) {
		System.out.println("We have that model.");
		System.out.println("the make is "+ vehicles.get(query).toString());
} else {
	System.out.println("We don't have that model");
	System.exit(0);
}
}
