package javacoding.challenges;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapPractices {

	
	
	public static void main(String[] args) {
		//HashMap map = new HashMap();
		
		HashMap <Integer, String> mapOne = new HashMap<Integer, String>();
		mapOne.put(23413, "Alam");
		mapOne.put(23456, "Alam");
		mapOne.put(23487, "Alam");	
		mapOne.put(23487, "Alam");
		mapOne.put(23487, "Alam");
		mapOne.put(null,  "Rakib");
		mapOne.put(null,  "Mohammed");
		mapOne.put(null,  "Fahim");
		mapOne.put(34365,   null);
		mapOne.put(5665,    null);
		mapOne.put(4545,    null);
		mapOne.put(978,     "Emaran");
		
		for (Entry newValue : mapOne.entrySet()) {
			 System.out.println(newValue.getKey() + " " + newValue.getValue());
			
		}
		
	}
	
}
