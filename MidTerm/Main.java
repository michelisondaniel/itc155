/* ********************************************************************
 * 
 * Midterm Exam ITC 155
 * 
 * Authors:		 James Shively, Daniel Micheli
 * Date:		 May 15, 2018 		
 * 
 ******************************************************************* */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	// question 1
	public static int maxOccurences(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<>();
		
		// iterates through list
		for(int i = 0; i < list.size(); i++) {
			Integer key = new Integer(list.get(i));
			// map contains key at index of list[i]
			if(map.containsKey(key)){
				int value = map.get(key);
				map.put(key, value + 1);
				
			/*	map.get(list.size());
				map.get(list.get(i));
				map.put(list.get(i), map.get(list.get(i) + 1));*/
				
			} else { 
				map.put(key, 1);
			}
			
	}
		int mode = 0;
		for(Integer val : map.values()) {
			if (val > mode)
				mode = val;
		}

		return mode;
		
	}
	
	// question 2
	// mystery(6) returns 6
	// mystery(17) returns 8
	
	
	// question 3
	public static int digitMatch(int n1, int n2) {
		
		
		// ya got us good i don't know.... where to go from here
		final Set<Integer> set = new HashSet<Integer>();
		final Set<Integer> set1 = new HashSet<Integer>();
		
		while(n1 > 0) {
			if(!set.add(n1 % 10) ) {
				n1 /= 10;
			}
			
		}
		
		
		return 0;
	}
	
	//question 4 
	// a: 4, 7, 8, 9
	// b: 4, -6
	// c: 4, 1
	// d: 4, 1, -1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(3);
		list.add(6);
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(3);
		list.add(4);

	
		System.out.print(maxOccurences(list));
	}

}
