package string.java.programs;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Get_Character_From_Given_String {

	public static void main(String[] args) {
		String str; int index;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String =");
		str=sc.next();
		System.out.print("Enter Index =");
		index=sc.nextInt();
		char chr = 0;
		
		//Approach 1 Using charAt
		chr=str.charAt(index);
		System.out.println("Character from "+str+" at index "+index+" is "+chr);
		
		//Approach 2 Using .toCharArray()
		char[] charArr=str.toCharArray();
		chr=charArr[index];
		System.out.println("Character from "+str+" at index "+index+" is "+chr);
		
		/*Approach 3 Using Stream
		Convert String into IntStream using String.chars() method.
		Convert IntStream into Stream using IntStream.mapToObj() method.
		Convert Stream into Character[] using toArray() method.
		Get the element at the specific index from this character array.
		Return the specific character.*/
		
		chr=(char) str.chars()
				.mapToObj(ch->(char)ch)
				.toArray()[index];
		
		System.out.println("Character from "+str+" at index "+index+" is "+chr);
		
		
		//Approach 4 Using .codePointAt()
		chr=(char)str.codePointAt(index);
		System.out.println("Character from "+str+" at index "+index+" is "+chr);
		
		//Approach 5 getChars()
		char[] charArr1=new char[1];
		str.getChars(index, index+1, charArr1, 0);
		chr=charArr1[0];
		System.out.println("Character from "+str+" at index "+index+" is "+chr);
		
	}
}
