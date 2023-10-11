package directory.java.programs;

import java.io.File;
public class FindCurrentWorkingDirectory {

	public static void main(String[] args) {
		// getProperty(String key) method of System
		String p=System.getProperty("user.dir");
		System.out.println("Current Working Directory : "+p);
		File file=new File(p);
		File[] files=file.listFiles();
		System.out.println("All Directory :");
		for(File f: files) {
			if(f.isDirectory()) System.out.println(f.getAbsolutePath());
			
		}

	}

}
