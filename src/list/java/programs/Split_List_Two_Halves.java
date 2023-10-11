package list.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Split_List_Two_Halves {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,11,12,8,9,15);
		
		//Aproach 1 Using Brute Force
		splitIntoHalf(list);
		//Aproach 2 Using subList Method
		int l=list.size()/2;
		List<Integer> firstHalf=new ArrayList<>(list.subList(0, l));
		List<Integer> secondHalf=new ArrayList<>(list.subList(l, list.size()));
		System.out.println("First Half :"+firstHalf);
		System.out.println("Second Half :"+secondHalf);
		//Aproach 3 Using Brute collectors partitioningBy
	List<List<Integer>>	i=new ArrayList<>(list.stream().collect(Collectors.partitioningBy(s -> list.indexOf(s)>list.size()/2)).values());
	System.out.println(i.get(0));
	System.out.println(i.get(1));
	
	}

	private static void splitIntoHalf(List<Integer> list) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		int l=list.size()/2;
		int x=0;
		for(int y: list) {
			if(x<l) list1.add(y);
			if(x>=l) list2.add(y);
			x++;
		}
		System.out.println("First Half :"+list1);
		System.out.println("Second Half :"+list2);
		
	}

}
