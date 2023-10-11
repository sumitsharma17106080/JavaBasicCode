package pattern.java.program;

import java.util.Scanner;

public class SpiralPattern {

		public static void main(String[] args)
		{
			int size;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter length =");
			size=sc.nextInt();
			int boundary=size-1;
			int ext=size-1;
			int row=0;
			int col=0;
			char move='r';
			int flag=1;
			int [][] matrix=new int[size][size];
			for(int i=1;i<=size*size;i++) {
				matrix[row][col]=i;
				
				switch(move) {
				case 'r' : col++; break;
				case 'l' : col--; break;
				case 'd' : row++; break;
				case 'u' : row--; break;
				}
				
				if(i==boundary) {
					boundary+=ext;
					
					if(flag!=2) {
						flag=2;
					}
					else {
						flag=1;
						ext--;
					}
					
					switch(move) {
					case 'r' : move='d'; break;
					case 'l' : move='u'; break;
					case 'd' : move='l'; break;
					case 'u' : move='r'; break;
				}
				}
			}
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					System.out.print(matrix[i][j]+"     ");
				}
				System.out.println();
			}
		}
	}

