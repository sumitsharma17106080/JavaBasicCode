package array.java1_D.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class FindCommonArrayElements {

	public static void main(String[] args) {
		int[] arr1=new int[] {113,25,332,453,355,758};
		int[] arr2=new int[] {236,947,758,339,113,-500,510};
		
		// Approach 1 brute force 
		List<Integer> list=new ArrayList<>();
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j])list.add(arr1[i]);
			}
		}
		System.out.println(list);
		
		//Approach 2Using Set retailAll method
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		for(int i=0;i<arr1.length;i++)set1.add(arr1[i]);
		for(int i=0;i<arr1.length;i++)set2.add(arr2[i]);
		set1.retainAll(set2);
		System.out.println(set1);
		

		

	}

}
