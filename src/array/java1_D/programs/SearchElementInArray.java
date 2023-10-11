package array.java1_D.programs;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		int[] arrInt=new int[] {1,2,3,4,5,6,7,8,9,10};
		int searhElement;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element For Search =");
		searhElement=sc.nextInt();
		boolean searchBool=false;
		//Approach 1 Linear Search
		for(int i=0;i<arrInt.length;i++) {
			if(arrInt[i]==searhElement) {searchBool=true; break;}
			
		}
		System.out.println("Is Element "+searhElement+" present in array : "+searchBool);
		
		//Approach 2 Binary Search  => Array.sort() and Array.binarySearch(arr,target)
		Arrays.sort(arrInt);
		int kc=Arrays.binarySearch(arrInt, searhElement);
		if(kc!=-1)System.out.println("Is Element "+searhElement+" present in array : "+searchBool);
		
		
		
		
		

	}

}
