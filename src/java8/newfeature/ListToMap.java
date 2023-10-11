package java8.newfeature;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=List.of("a","b","c","d","e");

		Map<Integer,String>map=list.stream().collect(Collectors.toMap(list::indexOf,x->x));
		Map<Integer,String>map2=list.stream().collect(Collectors.toMap(list::indexOf,x->x,(x,y)->x+":"+y));
		
		LinkedHashMap<Integer,String>map3=list.stream()
								.collect(Collectors.toMap(c->list.indexOf(c),x->x,(x,y)->x.join(",",y),LinkedHashMap::new));
		System.out.println(map);
		System.out.println(map2);
		System.out.println(map3);
		map.forEach((x,y)-> System.out.println(x+":"+y));
		
		
	}

}
