package list.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class RemoveNull_List {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(null);
		list.add(2);
		list.add(null);
		list.add(3);
		list.add(null);
		list.add(4);
		list.add(4);
		ArrayList<Integer> list2=new ArrayList<>(list);
		ArrayList<Integer> list3=new ArrayList<>(list);
		System.out.println(list);
		list.removeIf(n->n==null);
		System.out.println(list);
		System.out.println(list2);
		list2.removeAll(Collections.singleton(null));
		System.out.println(list2);
		System.out.println(list3);
		removeNull(list3);
		System.out.println(list3);
	}

	private static void removeNull(ArrayList<Integer> list3) {
		for(int i=0;i<list3.size();i++) {
			if(list3.get(i)==null)list3.remove(null);
		}
	}

}
