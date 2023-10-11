package array.java2_D.programs;

import java.util.Scanner;

public class InterchangeElements_First_Last_Matrix_Across_Rows {

	public static void main(String[] args) {
		int[][] matrix1=new int[4][3];
		initiateMatrix(matrix1);
		System.out.println("Matrix :");
		printMatrix(matrix1);
		interchangeElements_First_Last_Rows_Matrix(matrix1);
		System.out.println("Result matrix :");
		printMatrix(matrix1);
		interchangeElements_First_Last_Col_Matrix(matrix1);
		System.out.println("Result matrix :");
		printMatrix(matrix1);
		
		

	}
private static void interchangeElements_First_Last_Col_Matrix(int[][] matrix) {
		int c=matrix[0].length-1;
		for (int j=0;j<matrix.length;j++){
			int  temp=matrix[j][0];
			matrix[j][0]=matrix[j][c];
			matrix[j][c]=temp;
			
		}
		
	}
private static void interchangeElements_First_Last_Rows_Matrix(int[][] matrix) {
	int l=matrix.length-1;
		for(int i=0;i<matrix[0].length;i++) {
			int temp=matrix[0][i];
			matrix[0][i]=matrix[l][i];
			matrix[l][i]=temp;
		}
		
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
