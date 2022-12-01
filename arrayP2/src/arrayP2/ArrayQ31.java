package arrayP2;

import java.util.ArrayList;
import java.util.*;


public class ArrayQ31 {

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

