package array.java2_D.programs;

import java.util.Scanner;

public class MatrixMultiple {

	public static void main(String[] args) throws Exception {
		
			int[][] matrix1=new int[3][3];
			int[][] matrix2=new int[3][3];
			
			initiateMatrix(matrix1);
			initiateMatrix(matrix2);
			System.out.println("Matrix 1:");
			printMatrix(matrix1);
			System.out.println("Matrix 2:");
			printMatrix(matrix2);
			
			int[][]matrix=multipleMatrix(matrix1,matrix2);
			System.out.println("Result Matrix :");
			printMatrix(matrix);

	}
private static int[][] multipleMatrix(int[][] matrix1, int[][] matrix2) throws Exception {
		int p1=matrix1.length;int q1=matrix1[0].length;
		int p2=matrix2.length;int q2=matrix2[0].length;
		if (q1!=p2) { throw new Exception("Matrix Can not Multiple Because of Order");}
		int[][] matrix=new int[p1][q2];
	
		for(int i=0;i<p1;i++) {
			for(int j=0;j<q2;j++) {
				for(int k=0;k<(q1=p2);k++) {
					matrix[i][j]+=
							matrix1[i][k]*
							matrix2[k][j];
				}
			}
		}
		return matrix;
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
		System.out.println("\nInitiate Matrix : ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print("Enter Entry Matrix["+i+"]["+j+"] =");
				matrix[i][j]=sc.nextInt();
				
			}
		}
		
	}


}
