package february2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) throws  FileNotFoundException{
		
		
		openFile("abc.txt");
		

	}
	
	public static void openFile(String path) throws FileNotFoundException{
		File fh = new File(path);
		FileInputStream io = new FileInputStream(fh);
		
	}


}
