package FILE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) {
		FileInput();
		FileOutput();
		
	}
	
	public static void FileInput() {
		try {
			FileInputStream in = new FileInputStream("C:/JavaFile/Hello2.txt");
			
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
	
	public static void FileOutput() {
		try {
			FileOutputStream out = new FileOutputStream("C:/JavaFile/Hello2.txt");
			out.write(1);
			out.write(50);
			out.write(200);
			out.write(4000); // file chỉ đọc 1 byte và lấy 8-bit , nếu nhập vào 4000 byte thì máy tự động chuyển sang nhị phần rồi lấy 8-bit
			out.write(50000);
			out.close();
		} catch(IOException e){
			System.out.println("Error" + e.toString());
		}
	}
	
	
}
