package list.java.programs;

import java.util.LinkedList;

public class AddElementFirst_LastPosition_Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> linkList=new LinkedList<>();
		linkList.add("Abc");
		linkList.add("def");
		linkList.add("ghi");
		linkList.add("jkl");
		System.out.println(linkList);
		linkList.addFirst("000");
		linkList.addLast("zzz");
		System.out.println(linkList);
		
	}

}
