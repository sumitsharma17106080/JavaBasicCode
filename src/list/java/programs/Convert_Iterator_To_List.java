package list.java.programs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Convert_Iterator_To_List {

	public static void main(String[] args) {
		Iterator<Integer>  iterator = Arrays.asList(1, 2, 3, 4, 5,6,7) .iterator();
		
		 List<Integer> list = new ArrayList<>(); 
		 
		 iterator.forEachRemaining(e->list.add(e));
		 System.out.println(list);
		 
		 while(iterator.hasNext()) {
		 list.add(iterator.next());
		 }
		 System.out.println(list);

	}

}
