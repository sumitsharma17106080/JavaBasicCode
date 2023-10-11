package methods.java.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Usage_hasNext_next_Method {

	public static void main(String[] args) {
		// hasNext() => return boolean
		// next() => return Value and iterate next
		List<String> list =new ArrayList<>();
		list.add("Ankit");
		list.add("Deepa");
		list.add("Sumit");
		
		Iterator<String> itr=list.iterator();
		System.out.println(itr.hasNext());
		itr.next();
		System.out.println(itr.hasNext());
		itr.next();
		System.out.println(itr.hasNext());
		itr.next();
		System.out.println(itr.hasNext());
		try{itr.next();} //Exception in thread "main" java.util.NoSuchElementException
		catch(NoSuchElementException e) {
			System.out.println(e);
		}
		System.out.println();
		
		itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
