package array.java1_D.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Convert_SetofString_to_ArrayofString {

	public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	set.add("Sumit");
	set.add("Ankit");
	set.add("Jairam");
	set.add("Sumam");
	set.add("Deepa");
	
	String [] str=set.toArray(new String[0]);
	for(String s1:str) {System.out.print(s1+",");
	}
	System.out.println();
	 String[] str2 = Arrays .copyOf( set.toArray(), set.size(),  String[].class); 
	 for(String s1:str2) {System.out.print(s1+",");
		}

	}

}
