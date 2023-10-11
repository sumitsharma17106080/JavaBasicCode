package list.java.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetMinimum_MaximumFrom_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,11,12,8,9,15,30);
		
		int minimum=minimum(list);
		int maximum=maximum(list);
		System.out.println(" List Minimum ="+minimum);
		System.out.println(" List Maximum ="+maximum);
		Collections.sort(list);
		System.out.println(" List Minimum ="+list.get(0));
		System.out.println(" List Maximum ="+list.get(list.size()-1));

	}
	public static int minimum(List<Integer> list) {
		int minimum=Integer.MAX_VALUE;
		if(list==null || list.size()==0)return minimum;
		for(int x: list) {
			if(x<minimum) minimum=x;
		}
		return minimum;
		
	}
	public static int maximum(List<Integer> list) {
		int maximum=Integer.MIN_VALUE;
		if(list==null || list.size()==0)return maximum;
		for(int x: list) {
			if(x>maximum) maximum=x;
		}
		return maximum;
		
	}

}
