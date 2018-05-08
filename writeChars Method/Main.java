
public class Main {

	public static void main(String[] args) {
		writeChars(3);
		System.out.println();
		writeChars(4);
		System.out.println();
		writeChars(5);
		System.out.println();
		writeChars(6);
		System.out.println();
		writeChars(7);
		System.out.println();
		writeChars(8);
		

	}
	
	public static void writeChars(int n) {
		
		// base cases
		if(n < 1){
			throw new IllegalArgumentException("Value must be greater than 1");
			
		}
		if(n == 1) {
			System.out.print("*");
		}
		else if (n == 2) {
			System.out.print("**");
		}
		
		// continue to print the insides and outsides of the write chars
		// until the base cases are met,  n - 2 will maintain the odd or even integer values
		else {
			System.out.print("<");
			writeChars(n - 2);
			System.out.print(">");
		}
		
	}

}
