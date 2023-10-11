package directory.java.programs;

import java.io.File;
import java.io.FilenameFilter;

class MyFileNameFilter implements FilenameFilter{
	String initial;
	
	public MyFileNameFilter( String initial) {
		this.initial=initial;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.startsWith(initial);
	}
	
}

public class SearchFileInDirectory {

	public static void main(String[] args) {
		File dir=new File("D:\\XYZ");
		
		//Approach 1 Using FilenameFilter inteface and list(FilenameFIlter) method of dir
		MyFileNameFilter fileNameFilter=new MyFileNameFilter("ab");
		String[] files=	dir.list(fileNameFilter);
		if(files==null) System.out.println("Not Found");
		
		for(String name :files) {
			System.out.println(name +" Found");
			
		}
		
		//Approach 1 Using listFiles and iterator 
		File[] file=dir.listFiles();
		if(file.length==0) System.out.println("Not Found");
		
		for(File f:file) {
			if(f.getName().startsWith("ab")) {
			System.out.println(f.getName()+"Found");
			}
		}
		                 
		

	}

}
