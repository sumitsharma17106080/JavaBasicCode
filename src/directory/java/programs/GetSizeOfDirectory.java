package directory.java.programs;

import java.io.File;

public class GetSizeOfDirectory {

	public static void main(String[] args) {
		File folder=new File("D:\\BasicJavaCode");
		long l=getSizeOfDirectory(folder);
		System.out.println(l);

	}

	private static Long getSizeOfDirectory(File folder) {
		long l=0;
		File[] files=folder.listFiles();
		for(File f1:files) {
			if(f1.isFile())l+=f1.length();
			else {
				l+=getSizeOfDirectory(f1);
			}
		}
		return l;
	}

}
