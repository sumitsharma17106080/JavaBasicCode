package list.java.programs;

import java.util.LinkedList;

public class LinkedlistToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList =new LinkedList<>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		
		String[] strArr=linkedList.toArray(new String[0]);
		
		for(String s1:strArr) {
			System.out.print(s1+" ");
		}

	}

}
