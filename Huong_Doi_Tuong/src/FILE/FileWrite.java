package FILE;

import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class FileWrite {
	public static void main(String[] args) {
		FileWiter();
		FileReader();
		
	}
	
	public static void FileWiter() {
		try {
			FileWriter out = new FileWriter("C:/JavaFile/Hello.txt");
			out.write(1);
			out.write(50);
			out.write(200);
			out.write(4000);
			out.write(50000);
			out.close();
		} catch(IOException e){
			System.out.println("Error" + e.toString());
		}
	}
	
	public static void FileReader() {
		try {
				FileReader in = new FileReader("C:/JavaFile/Hello.txt");
				int c;
				System.out.println("Content of Hello.txt:");
				while ((c = in.read()) != -1) {
					System.out.println(c);
			}
				in.close();
			} catch (IOException e){
				System.out.println("Error: " + e.toString());
			}
	}

}
