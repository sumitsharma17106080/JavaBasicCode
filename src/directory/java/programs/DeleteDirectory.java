package directory.java.programs;

import java.io.File;

public class DeleteDirectory {

	public static void main(String[] args) {
		File folder=new File("D:\\XYZ");
		
		deleteFiles(folder);
		System.out.println(folder.delete());
	}

	private static void deleteFiles(File folder) {
		for(File f1:folder.listFiles()) {
			if(f1.isDirectory()) {
				deleteFiles(f1);
			}
			System.out.println(f1.delete());
		}
		
	}

}
