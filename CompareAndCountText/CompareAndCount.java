// Group Coding Project Compare and Count
// April 19, 2018
// By Dan Micheli and James Shively

import java.io.*;
import java.util.*;

public class CompareAndCount {

	public static void main(String[] args) throws FileNotFoundException  {
		
		// welcome message
		System.out.println("This program will compare two text files\nand see which common words\nthey share throughout each text");
		System.out.println("We will be using the texts of Hamlet and Romeo and Juliet");
		
		// recieve input from scanners
		Scanner sc = new Scanner(new File("hamlet.txt"));
		Scanner sc2 = new Scanner(new File("mobydick.txt"));
		
		// create TreeSets
		Set<String> f1 = getWordCountSet(sc);
		Set<String> f2 = getWordCountSet(sc2);
		
		double wordsInHam = f1.size();
		double wordsInDick = f2.size();
		
		System.out.println("Words in Hamlet: " + f1.size());
		System.out.println( "Words in Moby Dick: "+ f2.size());
		
		
		// Set<String> compared = new TreeSet<String>();
		
		Set<String> comparedSets = compareSet(f1, f2);
		
		System.out.println("% of overlap in Hamlet: " + (100 * ((double) comparedSets.size() / (double) wordsInHam)));
		System.out.println("% of overlap in Moby Dick: " + (100 * ((double) comparedSets.size() / (double) wordsInDick)));
		

	}
	
	// create method to compare sets
	private static Set<String> compareSet(Set<String> f1, Set<String> f2) {
		Set<String> comparedSets = new TreeSet<String>();
		
		
		f1.retainAll(f2);
		// System.out.println(f1);
		System.out.println("Common words in both texts: " + f1.size());
		comparedSets.addAll(f1);
		
		
		// double f1ToF2 = (double) f1.size() / (double) f2.size();
		// double f2ToF1 = (double) f2.size() / (double) f1.size();
		// System.out.println(f1ToF2);
		// System.out.println(f2ToF1);
		
		return comparedSets;
	}

	// create method to count words and put into sets
	private static Set<String> getWordCountSet(Scanner sc){
		Set<String> wordCount = new TreeSet<String>();
		
		while(sc.hasNext()) {
			String word = sc.next().toLowerCase();
			wordCount.contains(word);
			wordCount.add(word);
			// double count = wordCount.size();
		}
		
		return wordCount;
	}
	
	

}
