package fileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;

public class HandlingFiles {
	public static void fileop() {
		
		File f = new File("demo\\Target\\abcd.txt");
		try {
			f.createNewFile();
			if(f.exists()) {
				System.out.println("file is there");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//List< String> readLines = FileUtils.readLines(f, StandardCharsets.UTF_8);
		//System.out.println(readLines);
		
		
		try {
			FileUtils.write(f, "welcome to java files",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		String fileString;
		try {
			fileString = FileUtils.readFileToString(f, StandardCharsets.UTF_8);
			System.out.println(fileString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*if(f.exists()) {
			System.out.println("file created" +f.getName());
		}
		else {
			System.out.println("file not created");
		}
	*/}
	public static void main(String[] args) throws Throwable {
		fileop();
		
	}

}
