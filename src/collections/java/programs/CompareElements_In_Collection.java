package collections.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareElements_In_Collection {

	public static void main(String[] args) {
		
		List<String> strList=new ArrayList<>();
		strList.add("sumit");
		strList.add("sumit");
		strList.add("sumit");
		
		
		// Approach 1 Using Brute force;
		boolean check=true;
		for(int i=1;i<strList.size();i++) {
			if(!strList.get(i).equals(strList.get(i-1))) {
				check=false;
				break;
			}
		}
		if(check) System.out.println("Collection Element Are Equals");
		else System.out.println("Collection Element Are Not Equals");
		
		// Approach 2 Using min max equality Collections
		String min=Collections.max(strList);
		String max=Collections.min(strList);
		if(!min.equals(max)) System.out.println("Collection Element Are Not Equals");
		else System.out.println("Collection Element Are Equals");
		

	}

}
