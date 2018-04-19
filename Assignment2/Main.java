import java.util.LinkedList;
import java.util.Iterator;

public class Main {
	
	// private LinkedList<Integer> belowE = new LinkedList<Integer>();
	// private LinkedList<Integer> AboveE = new LinkedList<Integer>();
	
	public static LinkedList<Integer> partition(LinkedList<Integer> list, Integer e) {
		LinkedList<Integer> belowE = new LinkedList<Integer>();
		LinkedList<Integer> aboveE = new LinkedList<Integer>();
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()){
			Integer element = i.next();
			if(element < e) {
			belowE.add(element);
			} else {
				aboveE.add(element);
			}
			//if(i.hasNext() && i.next() > e) {
				//Integer element2 = i.next();
				//list.remove(element2);
				
			//}
		} 
		
		belowE.addAll(aboveE);
		return belowE;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(17);
		list.add(5);
		list.add(-6);
		list.add(30);
		list.add(19);
		list.add(2);
		list.add(16);
		list.add(4);
		
		System.out.println(list);
		System.out.println(partition(list, 10));
		

	}

}
