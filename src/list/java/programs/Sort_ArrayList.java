package list.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student {
	String name;
	int marks;
	public Student(String name,int marks){
		this.marks=marks;
		this.name=name;
	}
	public String toString() {
		return name+" : "+marks ;
	}
}


public class Sort_ArrayList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>() {{add("Ankit");add("Sumit");add("Deepa");}};
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		List<Student> listStu=new ArrayList<Student>();
		listStu.add(new Student("Anjali", 25));
		listStu.add(new Student("Meena", 50));
		listStu.add(new Student("Kalyani", 28));
		listStu.add(new Student("Swati", 21));
		
		Collections.sort(listStu,new MyComparator());
		System.out.println(listStu);
		
	}
}
class MyComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2) {
		return s1.marks-s2.marks;
	}
}
