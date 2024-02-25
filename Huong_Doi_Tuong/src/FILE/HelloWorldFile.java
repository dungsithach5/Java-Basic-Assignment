package FILE;

import java.io.File;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelloWorldFile {
	public static void main(String[] args) {
		try{

				FileReader out = new FileReader("C:/JavaFile/Hello.txt");
				BufferedReader reader = new BufferedReader(out);
				System.out.println("Content of Hello.txt:");
				String line = reader.readLine();
				while(line != null){
				System.out.println(line);
				line = reader.readLine();
			}
				reader.close();
				//fileReader.close();
			}catch(IOException e){
				System.out.println("Error:" + e.toString());
			}
	}
	
	
}
