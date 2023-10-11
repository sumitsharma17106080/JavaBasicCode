package list.java.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GetFirst_LastElements_ArrayList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>() {{add("Ankit");add("Sumit");add("Deepa");}};
		list.add("Suman");
		list.add("Jairam");
		
		String firstElement=list.get(0);
		String lastEleent=list.get(list.size()-1);
		System.out.println(" First Element :"+firstElement+" , Last Element :"+lastEleent);
		
		Vector<String> vector=new Vector<>(list);
		System.out.println(" First Element :"+vector.firstElement()+" , Last Element :"+vector.lastElement());
	}

}
