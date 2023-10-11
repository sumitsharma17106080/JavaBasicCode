package collections.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleElementsCollection {

	public static void main(String[] args) {

		List<String> strList=new ArrayList<>();
		strList.add("sumit");
		strList.add("ankit");
		strList.add("deepa");
		strList.add("sumit2");
		strList.add("ankit2");
		strList.add("deepa2");
		System.out.println("Original :\n"+strList);
		Collections.shuffle(strList);
		System.out.println("Shuffle :\n"+strList);
		Collections.shuffle(strList, new Random(3));
		System.out.println("Shuffle Random :\n"+strList);
		
	}
}
