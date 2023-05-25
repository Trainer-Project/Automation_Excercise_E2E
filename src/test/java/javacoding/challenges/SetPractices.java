package javacoding.challenges;

import java.util.HashSet;
import java.util.Set;

public class SetPractices {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(300);
		set1.add(300);
		set1.add(null);
		set1.add(null);
		set1.add(null);

		//System.out.println(set1.contains(200));
		System.out.println(set1);

		
	}
}