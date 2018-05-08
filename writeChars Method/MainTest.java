import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class MainTest {

	// using ByteArrayOutputStream and PrintStream from classmates example to
	// test writeChars
	
	@Test
	void test() {
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		
		// create output to be printed to the console for testing
		Main.writeChars(5);
		
		// expected output
		String expOutput = "<<*>>";
		
		// test expOutput against writeChars(5) as output
		assertEquals(output.toString(), expOutput);
		
		
	}

}
