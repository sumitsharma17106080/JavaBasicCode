package collections.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseCollection {

	public static void main(String[] args) {
		List<String> strList=new ArrayList<>();
		strList.add("sumit");
		strList.add("ankit");
		strList.add("deepa");
		strList.add("sumit2");
		strList.add("ankit2");
		strList.add("deepa2");
		System.out.println("Original :\n"+strList);
		Collections.reverse(strList);
		System.out.println("Reverse :\n"+strList);
		
		//Collection.reverse is applicable  for Only List
		Map<Integer,Student> stuHashMap=new HashMap<>();
		stuHashMap.put(1,new Student("Ankit",1));
		stuHashMap.put(2,new Student("Deepa",2));
		stuHashMap.put(3,new Student("Sumit",3));
		System.out.println("Original :\n"+stuHashMap);
		//Collections.reverse(stuHashMap);

	}

}
