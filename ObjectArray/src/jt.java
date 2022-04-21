import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class jt {
	public static void main(String[] args) {
		
	}
	
	public void output() throws Exception {
		FileWriter fw = new FileWriter("C:/Temp/test.txt");
		try {
			String data = "감사합니다";
			String data1 = "고맙습니다";
			
			fw.write(data1);
			fw.write(data);
			fw.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		fw.close();
	}
}
