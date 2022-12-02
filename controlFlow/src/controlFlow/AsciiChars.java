package controlFlow;

public class AsciiChars {
	 public static void printNumbers()
	  { 
		
		 for( int i = 48; i <= 57; i++) {
			 System.out.print((char) i);
		 }
		 
	    // TODO: print valid numeric input
	  }

	  public static void printLowerCase()
	  {
	    // TODO: print valid lowercase alphabetic input
		  for( int i = 97; i <= 122; i++) {
				 System.out.print((char) i);
			 }
	  }
	  

	  public static void printUpperCase()
	  {
	    // TODO: print valid uppercase alphabetic input
		  for( int i = 65; i <= 90; i++) {
				 System.out.print((char) i);
			 }
	  }
}
