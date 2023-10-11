package collections.java.programs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConvertCollection_Into_Array {

	public static void main(String[] args) {
		List<String> strList=new ArrayList<>();
		strList.add("sumit");
		strList.add("ankit");
		strList.add("deepa");
		strList.add("sumit2");
		strList.add("ankit2");
		strList.add("deepa2");
		System.out.println("Original :\n"+strList);
		
		String[] str=strList.toArray(new String[0]);
		System.out.println("String Array :");
		for(String s1:str) System.out.print(s1+", ");
		
		List<Student> stuList=new ArrayList<>();
		stuList.add(new Student("Ankit",1));
		stuList.add(new Student("Deepa",2));
		stuList.add(new Student("Sumit",3));
		Student [] stuArr=stuList.toArray(new Student[0]);
		System.out.println("\nStudent Array :");
		for(Student s1:stuArr) System.out.print(s1+", ");

	}

}
