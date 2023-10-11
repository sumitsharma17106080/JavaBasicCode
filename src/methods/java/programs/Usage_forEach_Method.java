package methods.java.programs;

import java.util.Hashtable;
import java.util.Map;

public class Usage_forEach_Method {

	public static void main(String[] args) {
	/*The forEach(BiConsumer) method of Hashtable class perform the BiConsumer operation on each 
	  entry of hashtable until all entries have been processed or the action throws an exception. 
	 */
	Map<Integer,String> hashTable=new Hashtable<>();
	hashTable.put(0, "A");
	hashTable.put(1, "B");
	hashTable.put(2, "C");
	hashTable.put(3, "D");
	hashTable.put(4, "E");
	hashTable.put(5, "F");
	
	hashTable.forEach((K,V)->{
		V=V.concat("=>"+K);
		hashTable.replace(K, V);
	});
	
	hashTable.forEach((k,v)->System.out.println(k+" : "+v));

	}

}
