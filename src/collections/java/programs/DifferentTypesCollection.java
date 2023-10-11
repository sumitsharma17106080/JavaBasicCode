package collections.java.programs;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.TreeMap;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayDeque;


import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.IdentityHashMap;
import java.util.Hashtable;
import java.util.Properties;

public class DifferentTypesCollection {

	public static void main(String[] args) {
		
		//List 
		List<Integer> arrayList=new ArrayList<>();
		List<String> linkedList=new LinkedList<>();
		List<Object> vector=new Vector<>();
		List<Boolean> stack=new Stack<>();
		
		//Set
		Set<Integer> hashSet=new HashSet<>();
		Set<String> linkedHashSet=new LinkedHashSet<>();
		Set<Integer> treeSet=new TreeSet<>();
		
		//Queue
		
		Queue<Integer> priorityQueue=new  PriorityQueue<>();
		Queue<String> arrayDeque=new ArrayDeque<>();
		
		
		Map<Integer, String> hashMap=new HashMap<>();
		Map<Integer, String> linkedHashMap=new LinkedHashMap<>();
		Map<Integer, String> weakHashMap=new WeakHashMap<>();
		Map<Integer, String> identityHashMap=new IdentityHashMap<>();
		Map<Integer, String> treeMap=new TreeMap<>();
		Map<Integer, String> hashTable=new Hashtable<>();
		Map<Object, Object> properties=new Properties();
				
		
	}

}
