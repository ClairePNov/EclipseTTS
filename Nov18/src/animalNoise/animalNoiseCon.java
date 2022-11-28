package animalNoise;

import java.util.Scanner;

public class animalNoiseCon {
	
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Type a farm animal?");
	
	String response = input.nextLine();
	
	if(response.contains("cow") ) {
		System.out.println("moo");
} else {
	System.out.println("Sorry, is that an animal?");
}
	}}
