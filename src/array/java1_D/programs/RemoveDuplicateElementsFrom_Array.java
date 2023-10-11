package array.java1_D.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class RemoveDuplicateElementsFrom_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt=new int[] {1,2,3,4,1,5,2,6,7,8,1,9,210,33,33,333,333,333};
		List<Integer> listInt=new ArrayList<>();
		
		//Approach 1  Using Brute Force
		for(int i=0;i<arrInt.length;i++) {
			boolean check =false;
			for(int j=i+1;j<arrInt.length;j++) {
				if(arrInt[i]==arrInt[j]) check =true;
			}
			if(check) continue;
			listInt.add(arrInt[i]);
		}
		System.out.println(listInt);
		
		//Approach 2 USing Set;
		Set<Integer> setInt=new HashSet<>();
		for(int i=0;i<arrInt.length;i++) {
			setInt.add(arrInt[i]);
		}
		System.out.println(setInt);
		
		//Approach for Sored Array
		
		Arrays.sort(arrInt);
		List<Integer> result=new ArrayList<>();
		int k=0;
		for(int i=0;i<arrInt.length-1;i++ ) {
			boolean check=false;
			if(arrInt[i]==arrInt[i+1])check=true;
			if(check) continue;
			result.add(arrInt[i]);
			
		}
		result.add(arrInt[arrInt.length-1]);
		for(int i: result)System.out.print(i+", ");
	}

}
