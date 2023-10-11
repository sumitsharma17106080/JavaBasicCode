package array.java1_D.programs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Sort_Array {
	private static void sortArray(int[] arrInt) {
		for(int i=0;i<arrInt.length;i++) {
			for(int j=i+1;j<arrInt.length;j++) {
				if(arrInt[i]>arrInt[j]) {
				arrInt[i]=arrInt[i]+arrInt[j];
				arrInt[j]=arrInt[i]-arrInt[j];
				arrInt[i]=arrInt[i]-arrInt[j];}
						
			}
		}
		
	}
	private static void sortArrayDesc(int[] arrInt) {
		for(int i=0;i<arrInt.length;i++) {
			for(int j=i+1;j<arrInt.length;j++) {
				if(arrInt[i]<arrInt[j]) {
				arrInt[i]=arrInt[i]+arrInt[j];
				arrInt[j]=arrInt[i]-arrInt[j];
				arrInt[i]=arrInt[i]-arrInt[j];}
						
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arrInt=new int[] {113,25,332,453,355,236,947,758,339,-500,510};
		Student[] arrStu=new Student[] {new Student("Ankit",11),new Student("Sumit",3),new Student("Amit",5),new Student("Dhoom",7)};
		
		//Approach 1 Using Brute Force Swapping Mehtod
		sortArray(arrInt);
		System.out.println("Sorted Array 1 :");
		for(int x:arrInt)System.out.print(x+" ");
		
		//Approach  2 Using Arrays.sort
		Arrays.sort(arrInt);
		System.out.println("\nSorted Array 2 :");
		for(int x:arrInt)System.out.print(x+" ");
		
		//Approach Using Arrays sort On Reference
		
		Arrays.sort(arrStu,new StudentComparator());
		System.out.println("\nSorted  Student Array 3 :");
		for(Student x:arrStu)System.out.print(x.name+":"+x.rollNumber+"   ,");
		
		//Sort in Descending Order
		
		//Approach  Using Brute Force Swapping Mehtod
		sortArrayDesc(arrInt);
		System.out.println("\nSorted Array in Descending Order 1 :");
		for(int x:arrInt)System.out.print(x+" ");
				
		//Approach  Using Arrays.sort
		Integer[] arrInteger=new Integer[] {1,3,4,5,67};
		Arrays.sort(arrInteger,Collections.reverseOrder());
		System.out.println("\nSorted Array in Descending Order2 :");
		for(int x:arrInteger)System.out.print(x+" ");
				

		//Approach Using Arrays sort On Reference
		Arrays.sort(arrStu,new StudentComparatorD());
		System.out.println("\nSorted Array in Descending Order3 :");
	    for(Student x:arrStu)System.out.print(x.name+":"+x.rollNumber+", ");

		
	}



}
class Student  {
	String name;
	int rollNumber;
	
	Student(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
	}

	
	
}
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNumber-o2.rollNumber;
	}
	
}
class StudentComparatorD implements Comparator<Student>{
	@Override
	public int compare (Student s1, Student s2) {
		return s2.rollNumber-s1.rollNumber;
	}
	
}
