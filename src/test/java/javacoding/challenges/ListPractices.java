package javacoding.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListPractices {

	// What is the collection?
	// Ans:- The collection in java a framework that an architecture to store and
	// manipulate the group of object

	// Differences between collection, Collections & Collectors
	// Collection -> The Collection is an interface to store and manipulate the
	// group of the object

	// Collections -> Collections is a utility class in java, Help with with
	// collections we can
	// reverse the string/number of value, find out max, min value as well as many
	// more operations

	// Collectors -> collectors is final class that extend the object class,Help
	// of collector we can remove the duplicate value & many more

	
	
	// ArrayList support dynamic arrays that can grow as needed
	// ArrayList allows duplicate elements and null values as well
	// ArrayList class maintain the insertion order
	// ArrayList is non-synchronized, That means it's faster
	// ArrayList flowing the index theory java
	// ArrayList when add the new values increases the size 50%

	// How to declare List or array List? 
	public static void main(String[] args) {
		int num [] = {10, 20, 30, 40, 50};
		int value = num.length;
		//System.out.println(value);
		
		// One way
		ArrayList listOne = new ArrayList(); // old
		
		// 2nd way
		ArrayList<Integer> listTwo = new ArrayList<Integer>(); // new 
		listTwo.add(100);
		listTwo.add(100);
		listTwo.add(200);
		listTwo.add(300);
		listTwo.add(null);
		listTwo.add(null);
		listTwo.add(null);
		
		System.out.println(listTwo.get(2));
		//System.out.println(listTwo);
		
		for (int i =0; i<listTwo.size(); i++) {
			System.out.println(listTwo.get(i));
		}
		
		
	
		//3rd way
		List<Integer> listThree = new ArrayList<Integer>(); // new 
		listThree.add(100);
		listThree.add(200);
		
		
		// 4th way 
		List<Integer> listFour = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500, 600)); // new 
		int s = listFour.size();
		//System.out.println(s);
		
		
		LinkedList<String> linkedlist = new LinkedList<String> ();
		linkedlist.add("Sayed Marwan"); 
		
		Vector<String> vector = new Vector<String> ();
		vector.add("Sayed Marwan");
		vector.add("Sayed Marwan");
		
		Stack<String> stack = new Stack<String> ();
		stack.add("Sayed Marwan");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
