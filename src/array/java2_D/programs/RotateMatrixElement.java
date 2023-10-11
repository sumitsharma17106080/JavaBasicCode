package array.java2_D.programs;

import java.util.Scanner;

public class RotateMatrixElement {

	public static void main(String[] args) {
		int[][] matrix1=new int[3][3];
		System.out.println();
		initiateMatrix(matrix1);
		System.out.println();
		printMatrix(matrix1);
		int rotation;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Rotation =");
		rotation=sc.nextInt();
		//Approach 1 Right Side Rotation
		//int[][] r=rightSideRotation(matrix1,rotation);
		//printMatrix(r);
		printMatrix(matrix1);
		System.out.println("\nCircle Rotation matirx");
		circleRotation(matrix1,matrix1.length,matrix1[0].length);
		printMatrix(matrix1);

	}
	private static void circleRotation(int[][] matrix, int p,int q) {
		int previous,current;
		int rw=0,cl=0;
		
		while(rw <p && cl<q) {
			if(rw+1==p || cl+1==q)break;
			
			previous=matrix[rw+1][cl];
			for(int x=cl;x<q;x++) {
				current=matrix[rw][x];
				matrix[rw][x]=previous;
				previous=current;
			}
			rw++;
			for(int x=rw;x<p;x++) {
				current=matrix[x][q-1];
				matrix[x][q-1]=previous;
				previous=current;
			}
			q--;
			
			if(rw<p) {
				for(int x=q-1;x>=cl;x--){
					current=matrix[p-1][x];
					matrix[p-1][x]=previous;
					previous=current;
					
				}
			}
			p--;
			
			if(cl<q) {
				for(int x=p-1;x>=rw;x--) {
					current=matrix[x][cl];
					matrix[x][cl]=previous;
					previous=current;
				}
			}
			cl++;
		}
	
		}
		
	
	private static int[][] rightSideRotation(int[][] matrix,int k) {
		int p=matrix[0].length;
		k=k%p;
		int[][] r=new int[matrix.length][matrix[0].length];
		int c=0;
		for(int i=0;i<matrix[0].length;i++) {
			c=(p-k+i)%p;
			for(int j=0;j<matrix.length;j++) {
				
				r[j][i]=matrix[j][c];
				
			}
		}
	return r;
		
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
