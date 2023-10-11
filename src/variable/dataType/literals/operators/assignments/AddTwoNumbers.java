package variable.dataType.literals.operators.assignments;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AddTwoNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
	//Approach 1 fix number with values
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Fix Sum ="+c);
	
	//Approach 2 Take input from Keyboard
	int x,y,z;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("x =");
	x=sc.nextInt();
	
	System.out.print("y =");
	y=sc.nextInt();
	
	  z=x+y;
	System.out.println("Sum ="+z);
	
	
	//Approach 3 Take Input from a file;
	File f=new File("abc.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	
	int p,q,r;
	p=Integer.parseInt(br.readLine());
	q=Integer.parseInt(br.readLine());
	
	r=p+q;
	br.close();
	System.out.println("Sum By File ="+r);
	
	
	
	
	
	}

}
