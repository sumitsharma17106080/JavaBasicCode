package list.java.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


class Student2{
	    Integer id; 
	    String name; 
	  
	    public Student2(Integer id, String name) 
	    { 
	        this.id = id; 
	        this.name = name; 
	    } 
	    public String toString() {
	    	return id+" : "+name;
	    }
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	    
	
	}
	public class Convert_List_to_Map {
	public static void main(String[] args) {
		
		List<Student2> list=new ArrayList<>();
		list.add(new Student2(1,"Sumit"));
		list.add(new Student2(2,"Ankit"));
		list.add(new Student2(3,"Suman"));
		list.add(new Student2(4,"Jairam"));
		list.add(new Student2(5,"Deepa"));
		
		//Approach 1 Using loop
		Map<Integer,String> map=new HashMap<>();
		for(Student2 s1:list) {
			map.put(s1.id, s1.name);
		}
		System.out.println(map);
		
		Map<Integer,String> map2=list.stream().collect(Collectors.toMap(s->s.id, s->s.name));
		System.out.println(map2);
		
		
		
		

	}

}
