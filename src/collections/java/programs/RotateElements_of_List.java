package collections.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RotateElements_of_List {

	public static void main(String[] args) throws IOException {
		List<String> strList=new ArrayList<>();
		strList.add("sumit");
		strList.add("ankit");
		strList.add("deepa");
		strList.add("sumit2");
		strList.add("ankit2");
		strList.add("deepa2");
		Scanner sc=new Scanner(System.in);
		System.out.print("Rotate Point :");
		int k=sc.nextInt();
		System.out.println(strList);
		List<String> result=new ArrayList<>();
		int p=strList.size();
		for(int i=0;i<strList.size();i++ ) {
			int t=(k+i)%p;
			result.add
			(strList.get(t));
		}
		System.out.println(result);
		
		Collections.rotate(strList, k);
		System.out.println(strList);
		
		

	}

}
