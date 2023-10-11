package list.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Find_Sublist_Of_List {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int s,l;
		Scanner sc=new Scanner(System.in);
		try {
		System.out.print("Enter Starting Index =");
		s=sc.nextInt();
		System.out.print("Enter Ending Index =");
		l=sc.nextInt();
		
		List<Integer> subList=list.subList(s, l);
		System.out.println("Sub List :"+subList);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (IllegalArgumentException e) {
		System.out.println(e);
		}
		

	}

}
