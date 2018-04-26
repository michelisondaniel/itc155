import java.util.*;

public class Main {

	private static Map<String, String> names = new TreeMap<String, String>();
	private static Map<String, String> testNames = new TreeMap<String, String>();
	private static Map<String, String> failNames = new TreeMap<String, String>();
	
	private static boolean isTrue;
	
	private static boolean isUnique(Map<String, String> names) {
		
		Set<String> valueSet = new HashSet<String>();
		// Map<String, String> valueSet2 = new HashMap<String, String>();
		// add values to the set
		for(String name : names.keySet()) {
			String key = names.get(name);
			valueSet.add(key);
		}
		
		
		return valueSet.size() == names.size();
	}
	
	public static void main(String[] args) {
		
		names.put("Micheli", "Daniel");
		names.put("Gorohoff", "Kathy");
		names.put("Thompson", "Debbie");
		names.put("Bernard", "Thomas");
		names.put("Weertman", "Andre");
		
		isTrue = isUnique(names);
		System.out.println("Map returns " + isTrue);
		
		testNames.put("Sheen", "Martin");
		testNames.put("Prior", "Richard");
		testNames.put("Smith", "Will");
		testNames.put("Skywalker", "Luke");
		testNames.put("Smith", "Jim");
		
		isTrue = isUnique(testNames);
		System.out.println("Map returns " + isTrue);
		
		failNames.put("Smith", "Will");
		failNames.put("Joplin", "Janis");
		failNames.put("Hendrix", "Jimi");
		failNames.put("Micheli", "Daniel");
		failNames.put("Louie", "Daniel");
		failNames.put("Micheli", "Daniel");
		
		isTrue = isUnique(failNames);
		System.out.println("Map returns " + isTrue);
		
		
	}

}
