package array.java2_D.programs;

import java.util.Scanner;

public class Find_Normal_Trace_Matrix {

	public static void main(String[] args) {
		int[][] matrix1=new int[3][3];
		initiateMatrix(matrix1);
		System.out.println("Matrix :");
		printMatrix(matrix1);
		double n=normalOfMatrix(matrix1);
		System.out.printf("\nNormal Of Matrix= %.2f ",n);
		int t=traceOfMatrix(matrix1);
		System.out.println("\nTrace Of Matrix ="+t);
	}
	private static int traceOfMatrix(int[][] matrix) {
		int t=0;
		for(int i=0;i<matrix.length;i++) {
			t+=matrix[i][i];
		}
		
		return t;
		
	}
	private static double normalOfMatrix(int[][] matrix) {
		double d=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				d+=Math.pow(matrix[i][j], 2);
			}
		}
		
		return Math.sqrt(d);
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
