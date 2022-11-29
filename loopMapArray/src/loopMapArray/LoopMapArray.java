package loopMapArray;
import java.util.Scanner;
import java.util.ArrayList;//import java ArrayList class

public class LoopMapArray {

	public static void main(String[] args) {
		//creates an array of numbers called 'userNum' that has 5 indexes 
		ArrayList <Integer> numEntered= new ArrayList<>(5);  
	 
		
		Scanner input = new Scanner(System.in);
		//take input from user
		System.out.println("Please type a number");
	
			
		
		//for loop for iterating for 5 numbers
		for (int i=0; i < 5; i++) {
			int num = input.nextInt();
			//getting numbers from user and pushing back to console
			System.out.println("You entered " + num);//show numbers entered
			//add user number to array list
			numEntered.add(num);
		}
		input.close();
		//Print list of # users entered
		System.out.println(numEntered);
		
		
		//find sum of entered numbers
		int sum = 0;
		for (int i = 0; i < numEntered.size(); i++) {
			sum = sum + numEntered.get(i);
		}
		//output sum
		System.out.println("The sum is " + sum);
		

		//find product of entered numbers
		int product = 1;
		for (int i = 0; i <numEntered.size(); i++) {
			product = product * numEntered.get(i);
		}
		//output product
		System.out.println("The product is " + product);
		
	
		//find max of entered numbers
		int max = numEntered.get(0);
		for (int i = 0; i <numEntered.size(); i++) {
			
			
			if (max < numEntered.get(i)) {
			max = numEntered.get(i);
			}
		}
		System.out.println("The largest number is " + max);
		
		//fins min of entered numbers
		int min = numEntered.get(0);
		for (int i = 0; i <numEntered.size(); i++) {
			
			
			if (min > numEntered.get(i)) {
			min = numEntered.get(i);
			System.out.println("The smallest number is " + min);
			}
	}
	}}
