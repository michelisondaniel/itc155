
// https://github.com/MingoLink/ITC155-Data-Structures-Java-/blob/master/Assignment4.java
// copied from above link

public class Assignment4 {

	public static void writeSequence(int n) {
		
	    // base case
	    // if n is odd, print lone 1 in middle of sequence
	    if (n == 1) {
	        System.out.print("1 ");
		// account for client error
	    }else if (n < 1) {
	        throw new IllegalArgumentException("Please enter a value greater than 0");
	        
	    // recursive case    
	    } else {
	    	
	    	//prints front of sequence
	    	// integer divison with (n+1) / 2 accounts for correct values for odd and evens
	        System.out.print(((n + 1) / 2) + " ");
	        System.out.println("Execute Initial numbers");
	        // prints out middle numbers until it reaches 2
	        if (n != 2) {
	            writeSequence(n - 2);
	            System.out.println("Execute (n != 2) ");
	        }
	        

	        //prints back of sequence
	        //unfolds end sequence after program works out sequence pattern in (n != 2) sequence
	        System.out.print(((n + 1) / 2) + " ");
	        System.out.println("Unfold Back End");
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//writeSequence(6);
		//System.out.println();
		//writeSequence(7);
		//System.out.println();
		//writeSequence(8);
		//System.out.println();
		writeSequence(9);
		
	}

}
