package FILE;

import java.io.FileInputStream;
import java.io.IOException;

public class CopyStream {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("C:/JavaFile/Hello1.txt");
			
			int c;
			System.out.println("Content of Hello.txt:");
			while ((c = in.read()) != -1) { // đọc 1 byte trong file
				System.out.println(c);
			}
			in.close();
		} catch (IOException e){
			System.out.println("Error: " + e.toString());
		}
	}
	
}
