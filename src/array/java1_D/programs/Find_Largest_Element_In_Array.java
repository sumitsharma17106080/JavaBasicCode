package array.java1_D.programs;

import java.util.Arrays;

public class Find_Largest_Element_In_Array {

	public static void main(String[] args) {
		int[] arrInt=new int[] {113,25,332,453,355,236,947,758,339,510};
		
		//Approach 1 Using Brute Force
		int max=Integer.MIN_VALUE;
		max=maxNumber(arrInt,max);
		System.out.println(max +" is maximum Number");
		
		//Approach 2 Using Sorting
		Arrays.sort(arrInt);
		max=arrInt[arrInt.length-1];
		System.out.println(max +" is maximum Number");
		
		//Approach Using strem
		max=Arrays.stream(arrInt)
				.max()
				.getAsInt();
		System.out.println(max +" is maximum Number");

	}
	
	public static int maxNumber(int[]arr,int max) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)max=arr[i];
		}
		return max;
		
		
	}

}
