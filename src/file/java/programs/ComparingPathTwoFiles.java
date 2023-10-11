package file.java.programs;

import java.io.File;
public class ComparingPathTwoFiles {

	public static void main(String[] args) {
		File f1=new File("ab.txt");
		File f2=new File("cd.txt");
		File f3=new File("ab.txt");
		if(f1.compareTo(f2)==0) System.out.println("Files,   f1 and f2 are Same");
		else System.out.println("File ,   f1 and f2 are not Same");
		if(f1.compareTo(f3)==0) System.out.println("Files,   f1 and f3 are Same");
		else System.out.println("File ,   f1 and f3 are not Same");


	}

}
