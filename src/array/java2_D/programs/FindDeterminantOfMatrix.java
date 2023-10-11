package array.java2_D.programs;

import java.util.Scanner;

public class FindDeterminantOfMatrix {

	public static void main(String[] args) {
		int[][] matrix1=new int[3][3];
		initiateMatrix(matrix1);
		System.out.println("Matrix :");
		printMatrix(matrix1);
		
		int D=determinateOfMatrix(matrix1,matrix1.length);
		System.out.println("\nDeterminate Of Matrix : "+D);

	}
	private static int determinateOfMatrix(int[][] matrix, int length) {
		if(length==1) return matrix[0][0];
		if(length==2) return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
		
		int sign=1;int D=0;int n=length;
		int[][] temp=new int[n-1][n-1];
		
		
		for(int f=0;f<n;f++) {
			coficentOfMatirx(matrix,temp,0,f,n);
			
			D+=sign*matrix[0][f]*determinateOfMatrix(temp,n-1);
			sign=-sign;
			System.out.println(" D="+D);
		}
		
		return D;
	}
	private static void coficentOfMatirx(int[][] matrix, int[][] temp, int row, int col, int n) {
		int p=0;int q=0;
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=row && j!=col) {
					temp[p][q++]=matrix[i][j];
					
					if(q==n-1) {
						q=0;
						p++;
					}
				}
			}
		}
		
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
