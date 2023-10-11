package array.java1_D.programs;

import java.util.Arrays;

public class CheckIf_TwoArraysAreEqual_Not {
	
	public static boolean cheakArrayEquality(int[]arr1,int []arr2) {
		if(arr1.length!=arr2.length) return false;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) return false;}
			return true;
			
			}

	public static void main(String[] args) {
		int[] arr1=new int[] {113,25,332,453,355};
		int[] arr2=new int[] {236,947,758,339,-500,510};
		
		boolean check=Arrays.equals(arr1, arr2);
		System.out.println(" Array Are Equal : "+check);
		
		boolean check2=cheakArrayEquality(arr1,arr2);
		System.out.println(" Array Are Equal : "+check2);

	}

}
