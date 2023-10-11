package directory.java.programs;
import java.io.File;
public class TraverseInDirectory {

	public static void main(String[] args) {
		File folder=new File("D:\\BasicJavaCode");
		System.out.println(folder.length());
		disPlaysFiles(folder);
	}

	private static void disPlaysFiles(File folder) {
		
		File [] files=folder.listFiles();
		for(File f1:files){
			if(f1.isDirectory()) {
				System.out.println(f1.getAbsolutePath()+" is directory");
				disPlaysFiles(f1);
				
			}
			else {
				System.out.println(f1.getAbsolutePath()+" is File");
				
			}
			
	}
	}
}
