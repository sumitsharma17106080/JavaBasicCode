package list.java.programs;

import java.util.ArrayList;
import java.util.List;

public class Convert_List_String_CommaSeparatedString {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>() {{add("Ankit");add("Sumit");add("Deepa");}};
		list.add("Suman");
		list.add("Jairam");
		String str=String.join(",", list);
		System.out.println(str);
		String abcd=String.join(",", "a","b","c","d");
		System.out.println(abcd);

	}

}
