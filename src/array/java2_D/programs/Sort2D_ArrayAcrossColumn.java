package array.java2_D.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort2D_ArrayAcrossColumn {

	public static void main(String[] args) {
		int[][] matrix1=new int[4][4];
		initiateMatrix(matrix1);
		
		int refCol;
		Scanner sc =new Scanner(System.in);
		System.out.print("Reference Column :");
		refCol=sc.nextInt();
		System.out.println();
		System.out.println();
		printMatrix(matrix1);
		
		//Approach 1 Brute Force
		sortMatrixAcrossColumn(matrix1,refCol-1);
		printMatrix(matrix1);
		
		//Approach2 Using Arrays.sort
		System.out.println("Array.sort Matrix");
		Arrays.sort(matrix1, (int[]a,int[]b)->Integer.compare(a[refCol-1],b[refCol-1]));
		printMatrix(matrix1);
		
		//Approach 3 Using Arrys.sort with comparator
		
		Arrays.sort(matrix1,new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[refCol-1]>o2[refCol-1]) return 1;
				if(o1[refCol-1]<o2[refCol-1]) return -1;
				return 0;
			}

		});
		System.out.println("Arrays Sort with  comparator");
		printMatrix(matrix1);

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
	private static void printMatrix(int[][] matrix) {
		System.out.println("Matrix : ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(" "+matrix[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}
	private static void sortMatrixAcrossColumn(int [][]matrix,int col) {
		
		for(int i=0;i<matrix[col].length;i++) {
			for(int j=i+1;j<matrix[col].length;j++) {
				if(matrix[i][col]>matrix[j][col]) {
					swapMatrix(matrix,i,j);
				}
			}
		}
	}
	private static void swapMatrix(int[][] matrix, int i, int j) {
			for(int k=0;k<matrix.length;k++) {
				int temp=matrix[i][k];
				matrix[i][k]=matrix[j][k];
				matrix[j][k]=temp;
			}
		
	}

}
