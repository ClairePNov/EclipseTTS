package arrayQ2;

public class FindOutput {

	public static void main(String[] args) {
		
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 0; i<exampleArray.length; i++){
        		index += exampleArray [i];
            /* if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }*/
	}
        System.out.println(index);
	} 
}
