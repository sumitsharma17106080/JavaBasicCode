package array.java2_D.programs;

import java.util.Scanner;
public class Print_2D_Array {

	public static void main(String[] args) {
	int[][] arr2D=new int[3][3];
	Scanner sc =new Scanner(System.in);
	
	for(int i=0;i<arr2D.length;i++) {
		for(int j=0;j<arr2D[i].length;j++) {
			System.out.print("Enter Entry arr["+i+"]["+j+"] =");
			arr2D[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("Array :");
	for(int i=0;i<arr2D.length;i++) {
		for(int j=0;j<arr2D[i].length;j++) {
			System.out.print(arr2D[i][j]+" ");
			
		}
		System.out.println();
	}

	}

}
