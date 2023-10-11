package list.java.programs;

import java.util.List;
import java.util.ArrayList;

public class StringtoList_Of_Characters {

	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		
		//Approach 1 Using Stram
		List list=	str.chars().mapToObj(e->(char)e).toList();
		System.out.println(list);
		
		//Approach 2 Using Brute Force
		List<Character> list2=new ArrayList<Character>();
		for(int i=0;i<str.length();i++) {
			list2.add(str.charAt(i));
		}
		System.out.println(list2);
		
		

	}

}
