package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class AddTwoBinaryString {

	public static void main(String[] args) {
		String a,b;
		Scanner sc =new Scanner(System.in);
		System.out.print("a=");
		a=sc.next();
		System.out.print("b=");
		b=sc.next();
		
		// Approach  1 Brut Force
				int carry =0;
				
				
				int l1=a.length()-1;
				int l2=b.length()-1;
				StringBuilder result=new StringBuilder();
				int i=l1,j=l2;
				while(i>=0 ||j>=0) {
					int sum=carry;
					if(i>=0)
					sum+=Character.getNumericValue(a.charAt(i));
					
					if(j>=0)sum+=Character.getNumericValue(b.charAt(j));
					
					
					if(sum==0) {
						carry=0;
						result.append("0");
						
					}
					if(sum==1) {
						
						carry=0;
						result.append("1");
						
					}
					if(sum==2) {
						carry=1;
						result.append("0");
						
					}
					if(sum==3) {
						carry=1;
						result.append("1");
						
					}
				i--;j--;
				}
				result.append(carry);
				
		System.out.println("Brut Force Binary Result="+result.reverse());
		
		// Approach Using Wrapper Class Method
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		int x=Integer.parseInt(a,2);
		int y=Integer.parseInt(b,2);
		int c=x+y;
		String result1=Integer.toBinaryString(c);
		System.out.println("Using Wrapper Class Binary Result="+result1);
		
		
		
		
		
		
	}

}
