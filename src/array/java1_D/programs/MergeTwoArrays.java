package array.java1_D.programs;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] arr1=new int[] {113,25,332,453,355};
		int[] arr2=new int[] {236,947,758,339,-500,510};
		int[] arr=new int [arr1.length+arr2.length];
		//Approach 1 Using 
		//System.copyarray( sourceArray,sourceStartingIndex,destinationArray,destinationStartingIndex,numberOfElementsTOCopyFromSourceArray
		System.arraycopy(arr1, 0, arr, 0, arr1.length);
		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
		for(int x:arr) System.out.print(x+", ");
		
		//Approach 2 Using Brute Force
		arr=new int [arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)arr[i]=arr1[i];
		int k=0;
		for(int i=arr1.length;i<arr1.length+arr2.length;i++)arr[i]=arr2[k++];
		for(int x:arr) System.out.print(x+", ");
		
		
		
	}

}
