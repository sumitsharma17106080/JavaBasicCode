package list.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Remove_Sublist_List {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		int s,l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Index =");
		s=sc.nextInt();
		System.out.print("Enter Ending Index =");
		l=sc.nextInt();
		
		// Approach 1 Using subList and clear
		list.subList(s, l).clear();
		System.out.println(list);
		// Approach 1 Using sublist and removeAll
		list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		list.removeAll(list.subList(s, l));
		System.out.println(list);
		

		 
	}

}
