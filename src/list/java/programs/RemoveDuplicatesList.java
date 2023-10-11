package list.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,1,5,6,7,1,8,2,9));
		
		//Approach 1 Using iterator
		System.out.println("List  :"+list);
		removeDuplicate(list);
		System.out.println("List Without Duplicate :"+list);
		list=new ArrayList<>(Arrays.asList(1,2,3,4,1,5,6,7,1,8,2,9));
		
		//Approach 2 Using stream distinct
		list=new ArrayList<>(Arrays.asList(1,2,3,4,1,5,6,7,1,8,2,9));
		System.out.println("List  :"+list);
		List<Integer> listWD=list.stream().distinct().collect(Collectors.toList());
		System.out.println("List Without Duplicate :"+listWD);
		//Approach 3 Using Set
		list=new ArrayList<>(Arrays.asList(1,2,3,4,1,5,6,7,1,8,2,9));
		System.out.println("List  :"+list);
		Set<Integer> set=new  HashSet<>(list);
		list=new ArrayList<>(set);
		System.out.println("List Without Duplicate :"+list);
		

	}

	private static void removeDuplicate(ArrayList<Integer> list) {
	
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) list.remove(list.get(i));
				
			}
		}
		
	}

}
