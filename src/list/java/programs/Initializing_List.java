package list.java.programs;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

public class Initializing_List {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sumit");
		list.add(1);
		list.add(true);
		list.add(3.90);
		System.out.println(list);
		List<String> listSt=new ArrayList<>();
		listSt.add("Sumit");
		listSt.add("Ankit");
		listSt.add("Deepa");
		listSt.add("Jairam");
		listSt.add("Suman");
		//listSt.add(5);//Error :  List<String> is not applicable for the arguments (int)
						// Error : List<T> is not applicable for the argument (Y)
		
		List<Integer> listA=Arrays.asList(1,3,4,5,6,78,8,9);
		System.out.println(listA);
		
		List<String> listS=new ArrayList<>(){{add("Sumit");add("ANkit");add("Deepa");}};
		System.out.println(listS);
		
		List<Integer> listI=List.of(1,2,3,4,5,6,7,8);
		System.out.println(listI);
		
		List<String> listS2=Stream.of("Ankit","Deepa","Sumit").toList();
		System.out.println(listS2);
		
		Integer[] arr=new Integer[] {1,2,3,4,5,66,7,8,9};
		List<Integer> listI2=Arrays.stream(arr)
				.filter(i->i>5).toList();
		System.out.println(listI2);

	}

}
