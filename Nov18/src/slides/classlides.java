package slides;

import java.util.ArrayList;
import java.io.Console;
import java.util.*;

public class classlides {
	public static void main(String[] args) {
		
		//arrays
		        String[] my_array = {"Aaron","Joan","Layla"};
		        Console console = System.console();

		        console.printf(my_array[1]);
		        // returns "Joan"
		        int size = my_array.length;
		        System.out.println(size);
		          // returns the length or size of the array (3)
	


		//different types of lists
	//	List <Integer> list1= new Array();  
	//	List <Integer> list2 = new Linked();  
	//	List <Integer> list3 = new Vector();  
	//	List <Integer> list4 = new Stack();  
		
		//create an array list
		ArrayList<Integer> otherArray = new ArrayList<Integer>(2);
		System.out.println(otherArray);
		
		otherArray.add(1);//adds 1 to the array
		System.out.println(otherArray);
		otherArray.add(45);//adds 45 to the array
		System.out.println(otherArray).get(0);
		otherArray.remove(1);//array so position, not actual #
		
		//hashmapes
		//creates a hashmap with a string as key and integer as the value it points to
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

	//iterators
		String [] fruitList = {"Apple", "Banana", "Grapes"};

				for (String fruit : fruitList){
				   System.out.println(fruit);
						}
		
}
}
