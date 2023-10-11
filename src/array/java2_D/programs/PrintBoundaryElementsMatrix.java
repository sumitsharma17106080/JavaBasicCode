package array.java2_D.programs;

import java.util.Scanner;

public class PrintBoundaryElementsMatrix {

	public static void main(String[] args) {
		int[][] matrix1=new int[3][3];
		initiateMatrix(matrix1);
		System.out.println("Matrix :");
		printMatrix(matrix1);
		System.out.println("\nBoundary Elemrnt :");
		printBoundaryElement(matrix1);
	}
private static void printBoundaryElement(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				int l=matrix.length-1;
				if(i==0 || i==l ||j==0 || j==l) {
					System.out.print(matrix[i][j]+" ");
				}
				else System.out.print("  ");
			}
			System.out.println();
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
