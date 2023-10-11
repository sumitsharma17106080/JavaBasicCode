package array.java1_D.programs;

import java.util.Scanner;

public class Array_Rotation {

	public static void main(String[] args) {
		int[] arrInt=new int[] {113,25,332,453,355,236,947,758,339,-500,510};
		int rotationIndex;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Rotation Index =");
		rotationIndex=sc.nextInt();
		int[] rArr=new int[arrInt.length];
		int k=0;
		for(int i=rotationIndex;i<arrInt.length;i++) {
			rArr[k++]=arrInt[i];
		}
		for(int i=0;i<rotationIndex;i++) {
			rArr[k++]=arrInt[i];
		}
		for(int x:rArr) System.out.print(x+", ");

	}

}
