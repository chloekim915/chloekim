import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class jt {
	public static void main(String[] args) {
		
	}
	
	public void output() throws Exception {
		FileWriter fw = new FileWriter("C:/Temp/test.txt");
		try {
			String data = "�����մϴ�";
			String data1 = "�����ϴ�";
			
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
