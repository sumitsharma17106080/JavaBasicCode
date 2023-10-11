package collections.java.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Get_Size_Collection {
		public static void main(String[] args) {
			//Size of ArrayList
			
			List<Student> stuList=new ArrayList<>();
			stuList.add(new Student("Ankit",1));
			stuList.add(new Student("Deepa",2));
			stuList.add(new Student("Sumit",3));
			System.out.println("Size of List :"+stuList.size());
			System.out.println("List Empty:"+stuList.isEmpty());
			//Size of Map 
			Map<Integer,Student> stuHashMap=new HashMap<>();
			stuHashMap.put(1,new Student("Ankit",1));
			stuHashMap.put(2,new Student("Deepa",2));
			stuHashMap.put(3,new Student("Sumit",3));
			System.out.println("\nSize of Map :"+stuHashMap.size());
			System.out.println("Map Empty:"+stuHashMap.isEmpty());
			
	}
}
