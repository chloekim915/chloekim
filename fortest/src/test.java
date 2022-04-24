 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class test {
public static void main(String[] args) {
//	File file1 = new File("C:/Temp/file1.txt");

	FileWriter fw = null;
	try {
		fw = new FileWriter("C:/Temp/file1.txt",true);

		fw.append("\n고맙습니다.");
		fw.append("\n감사합니다.");
		
		fw.flush();

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if( fw != null) {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
}