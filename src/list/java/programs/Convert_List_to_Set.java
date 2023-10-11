package list.java.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Convert_List_to_Set {

	public static void main(String[] args) {
		List<Student2> list=new ArrayList<>();
		list.add(new Student2(1,"Sumit"));
		list.add(new Student2(2,"Ankit"));
		list.add(new Student2(3,"Suman"));
		list.add(new Student2(4,"Jairam"));
		list.add(new Student2(5,"Deepa"));
		
		//Approach 1  Using Constructor
		Set<Student2> set=new HashSet<>(list);
		System.out.println(set);
		Set<Student2> set2=new HashSet<>(list);
		set.addAll(list);
		System.out.println(set);
		

	}

}
