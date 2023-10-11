package list.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonElementsTwoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		list1.add(1);list1.add(2);list1.add(13);list1.add(4);list1.add(6);
		list2.addAll(list1);
		list2.add(11);list2.add(21);list2.add(3);list2.add(14);list2.add(16);
		//Approach 1 Using retainAll method of list
		list2.retainAll(list1);
		System.out.println(list1);
		//Adding some common elements
		list2.add(0);
		list1.add(0);
		//Approach 1 Using stream filter contains method  S
		List<Integer> list=	list1.stream().filter(x-> list2.contains(x)).toList();
		System.out.println(list);

	}

}
