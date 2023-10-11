package exceptions.errors.java.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandleCheckedExceptions {

	public static void main(String[] args) {
		
		//checked Exception  Handling
		
		File file=new File("xyz.txt");
		Pattern p=Pattern.compile("[a-zA-Z][a-z]+");
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			String str;
			while((str=br.readLine())!=null) {
				Matcher m=p.matcher(str);
				while(m.find()) {
					
					System.out.println(m.group());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
