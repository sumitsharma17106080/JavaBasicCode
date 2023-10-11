package collections.java.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Student{
	String name;
	int rollNo;
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public Student() {
		super();
	}
	
	public String toString() {
		return name+" : "+rollNo;
	}
	
	
}

public class PrintCollection {

	public static void main(String[] args) {
		//Printing ArrayList of Student
		
		List<Student> stuList=new ArrayList<>();
		stuList.add(new Student("Ankit",1));
		stuList.add(new Student("Deepa",2));
		stuList.add(new Student("Sumit",3));
		System.out.println(stuList);
		for(Student s: stuList)System.out.print(s+" ,");
		
		//Printing HashMap of Student
		Map<Integer,Student> stuHashMap=new HashMap<>();
		stuHashMap.put(1,new Student("Ankit",1));
		stuHashMap.put(2,new Student("Deepa",2));
		stuHashMap.put(3,new Student("Sumit",3));
		
		System.out.println(stuHashMap);
		for(Map.Entry<Integer, Student> e: stuHashMap.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}

	}

}
