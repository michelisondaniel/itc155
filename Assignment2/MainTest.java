import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class MainTest extends Main {

	@Test
	void test() {
		int bound = 6;
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(4);
		list.add(7);
		list.add(9);
		list.add(-2);
		
		
			LinkedList<Integer> partList = partition(list, bound);
		
			assertTrue(partList.getLast() > bound);
			
	}

}
