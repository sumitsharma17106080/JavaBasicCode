package collections.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArray_Into_Collection {

	public static void main(String[] args) {
	String [] strArr= {"sumit","ankit","deepa","sumit2","ankit2","deepa2"};
	List<String> strList=Arrays.asList(strArr);
	System.out.println(strList);
	List<String> strList2=List.of(strArr);
	System.out.println(strList2);
	List<String> strList3=new ArrayList<>();
	Collections.addAll(strList3, strArr);
	System.out.println(strList3);
	
	List<String> strList4=Arrays.stream(strArr).collect(Collectors.toList());
	System.out.println(strList4);

	}

}
