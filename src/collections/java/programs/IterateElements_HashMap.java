package collections.java.programs;

import java.util.HashMap;
import java.util.Map;

public class IterateElements_HashMap {

	public static void main(String[] args) {
		Map<Integer,Student> stuHashMap=new HashMap<>();
		stuHashMap.put(1,new Student("Ankit",1));
		stuHashMap.put(2,new Student("Deepa",2));
		stuHashMap.put(3,new Student("Sumit",3));
		System.out.println(stuHashMap);
		
		// Approach 1 Using Map.Entry and entrySet
		for(Map.Entry<Integer, Student> e: stuHashMap.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		// Approach 2 Using Map.Entry and 
		for(int i: stuHashMap.keySet()) {
			System.out.print(i+",            ");
		}
		System.out.println();
		for(Student i: stuHashMap.values()) {
			System.out.print(i+",");
		}

	}

}
