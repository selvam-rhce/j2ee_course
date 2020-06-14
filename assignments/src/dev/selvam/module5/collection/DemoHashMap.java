package dev.selvam.module5.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "ayyanar");
		hmap.put(2, "lakshmi");
		hmap.put(3, "selvam");
		hmap.put(4, "mallika");
		hmap.put(5, "aaranya");

		Set<Map.Entry<Integer, String>> myset = hmap.entrySet();
		System.out.println("Employee ID \t Employee Name\n");
		for (Map.Entry<Integer, String> entry : myset) {
			System.out.println(entry.getKey()+" \t\t "+entry.getValue());
		}
	}
}
