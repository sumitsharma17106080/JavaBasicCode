package array.java2_D.programs;

import java.util.Scanner;

public class Sum_Diagonals_Matrix {

	public static void main(String[] args) {
		int[][] matrix1=new int[3][3];
		initiateMatrix(matrix1);
		System.out.println("Matrix :");
		printMatrix(matrix1);
		sumDiagonalsMatrix(matrix1);
	}
private static void sumDiagonalsMatrix(int[][] matrix) {
	System.out.println("matrix");
	int pd=0;int sd=0;int s=matrix.length-1;
	for(int i=0;i<matrix.length;i++) {
		
			pd+=matrix[i][i];
			sd+=matrix[i][s-i];
		
	}
	System.out.println("Primary Diagonal : "+pd);
	System.out.println("Secondary Diagonal : "+sd);
		
	}
private static void printMatrix(int[][] matrix) {
	
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

	private static void initiateMatrix(int[][] matrix) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Initiate Matrix : ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print("Enter Entry Matrix["+i+"]["+j+"] =");
				matrix[i][j]=sc.nextInt();
				
			}
		}
		
	}


}
