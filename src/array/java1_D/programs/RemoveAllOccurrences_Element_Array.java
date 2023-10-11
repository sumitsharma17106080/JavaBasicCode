package array.java1_D.programs;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllOccurrences_Element_Array {

	public static void main(String[] args) {
		Integer[] arrInt=new Integer[] {1,2,3,4,5,6,7,8,9,10,1};
		int element;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element =");
		element=sc.nextInt();
		
		
		//Approach 1 Using loop
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<arrInt.length;i++){
			if(element!=arrInt[i])list.add(arrInt[i]);
		}
		System.out.println(list);
		
		//Approach 2 Using Stream
	 list=Arrays.stream(arrInt).filter(i->i!=element).toList();
	 System.out.println(list);
	
					
	
		

		

	}

}
