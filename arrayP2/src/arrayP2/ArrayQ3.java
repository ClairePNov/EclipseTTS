package arrayP2;
import java.util.ArrayList;

public class ArrayQ3 {
	
	static void main(int [] args) {
		
		int size = 4;
		int power = 2;
		
		//initiate arrayList
		ArrayList<Integer> toPower = new ArrayList <> (size);
		
		//for statement
		for (int i = 0; i < size; i++) {
			toPower.add(i, (int)Math.pow(i, power));
		}
		//check result
		System.out.println(toPower);
	}
	}

/* prompt: Write a public static method called "toPower" that 
takes in as parameters two integers called size and 
power. The method should return an array of size 
"size" with each array index raised to the value of
 "power." So, for example, if we passed in "size = 4" 
 and "power = 2" to the "toPower," the method should
  return the following result: [0,1,4,9].
Submit to your GitHub and provide a link to your 
repository*/