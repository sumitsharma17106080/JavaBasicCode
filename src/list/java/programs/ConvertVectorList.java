package list.java.programs;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ConvertVectorList {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.addElement("abc");
		vector.addElement("pqr");
		vector.addElement("mno");
		vector.addElement("xyz");
		
		
		List<String> list=Collections.list(vector.elements());
		List<String> list2=Collections.unmodifiableList(vector);
		for(String s1:list) {
			System.out.print(s1+" ");
		}
		System.out.println();
		for(String s1:list2) {
			System.out.print(s1+" ");
		}
		
	}

}
