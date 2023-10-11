package methods.java.programs;

import java.util.Scanner;

public class Usage_codePointAt_Method {

	public static void main(String[] args) {
	/*The codePointAt() method of StringBuffer class returns a character 
	  Unicode point at that index in sequence contained by StringBuffer.
	 */
	int p;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Position =");
	p=sc.nextInt();
	
	StringBuffer sb=new StringBuffer();
	sb.append("Sumit Sharma");
	int unicode =sb.codePointAt(p);
	System.out.println("Unicode of Character at Position "+p+ " Unicode= "  + unicode);

	}

}
