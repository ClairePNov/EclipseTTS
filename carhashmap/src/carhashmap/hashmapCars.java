package carhashmap;
import java.util.HashMap;
import java.util.Scanner;

public class hashmapCars {

	public static void main(String[] args) {
		HashMap<String, String> carInventory = new HashMap<>();

		//.put adds items to the hash map
		//establish inventory
		carInventory.put("Civic", "Honda");
		carInventory.put("Accord", "Honda");
		carInventory.put("Saturn", "Toyota");
		carInventory.put("Camry", "Toyota");
		carInventory.put("Forester", "Subaru");
		carInventory.put("Outback", "Subaru");

		System.out.println(carInventory);
		//creates the following HashMap
		//==>{Saturn=Toyota, Outback=Subaru, Forester=Subaru, Civic=Honda, Camry=Toyota, Accord=Honda}

		
		//ask customer for what they are looking for
		Scanner input = new Scanner(System.in);	
		System.out.println("What car model are you looking for?");
		
		
		String request = input.nextLine();

		
		System.out.println("You asked to see our " + request);
		// repeats for customer to ensure correct selection
		
		//check inventory
		System.out.println(carInventory.get(request));
		
		
		
		



	}
}
