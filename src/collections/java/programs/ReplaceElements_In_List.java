package collections.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReplaceElements_In_List {

	public static void main(String[] args) {
		List<String> strList=new ArrayList<>();
		strList.add("sumit");
		strList.add("ankit");
		strList.add("deepa");
		strList.add("sumit2");
		strList.add("ankit2");
		strList.add("deepa2");
		strList.set(strList.indexOf("sumit"),"sumit3");
		strList.set(3, "sumit4");
		System.out.println(strList);

	}

}
