package array.java2_D.programs;

import java.util.Scanner;

public class FindTransposeMatrix {

	public static void main(String[] args) {
		int[][] matrix1=new int[3][4];
		initiateMatrix(matrix1);
		System.out.println("Matrix :");
		printMatrix(matrix1);
		
		int[][] rMatrix=transposeMatrix(matrix1);
		System.out.println("Transpose Matrix :");
		printMatrix(rMatrix);

	}
	private static int[][] transposeMatrix(int[][] matrix) {
		int[][] rMatrix=new int[matrix[0].length][matrix.length];
		for(int i=0;i<rMatrix.length;i++) {
			for(int j=0;j<rMatrix[i].length;j++) {
				
				rMatrix[i][j]=matrix[j][i];
				
			}
		}
		return rMatrix;
		
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
