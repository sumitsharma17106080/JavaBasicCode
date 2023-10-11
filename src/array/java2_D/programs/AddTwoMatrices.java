package array.java2_D.programs;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int[][] matrix1=new int[3][3];
		int[][] matrix2=new int[3][3];
		
		initiateMatrix(matrix1);
		System.out.println();
		initiateMatrix(matrix2);
		System.out.println();
		printMatrix(matrix1);
		System.out.println();
		printMatrix(matrix2);
		
		int [][] matrix=addMatrix(matrix1,matrix2);
		System.out.print("Sum of ");
		printMatrix(matrix);
		

	}

	private static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix2[i].length;j++) {
				
				matrix1[i][j]+=matrix2[i][j];
				
			}
		}
		return matrix1;
	}

	private static void printMatrix(int[][] matrix) {
		System.out.println("Matrix : ");
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
