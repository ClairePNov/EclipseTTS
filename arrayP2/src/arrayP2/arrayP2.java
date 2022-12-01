package arrayP2;

public class arrayP2 {

	public static void main(int[] args) {
//		
//		//set up array and assign numbers
//		int[] someNumbers = {42, 3, 54, 7, 43};
//		
//		int sum = 0
//		
//		//for loop to add each number in array
//		for (int i = 0; i<someNumbers.length; i++) 
//				sum += [i]someNumbers;
//			
//		return sum;
//			}
//		System.out.println(index);
		int[] numbers = {1,2,3,4};
		int sum = 0;
		for( int i : numbers) {
		    sum += i;
			System.out.println(sum);
		}

		System.out.println(sum);
	}

}


