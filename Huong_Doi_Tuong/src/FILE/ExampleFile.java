package FILE;

import java.io.File;
import java.io.*;
import java.io.IOException;

public class ExampleFile {
	public static void main(String[] args) {
		File fileObj = new File("C:/javaFile/Hello.txt");
		System.out.println("Path is: " + fileObj.getPath());
		System.out.println("Name is: " + fileObj.getName());
		System.out.println("File exist is: " + fileObj.exists());
		System.out.println("File is:  " + fileObj.isFile());
		File folderObj = new File("C:/JavaFile");
		if(!folderObj.exists()) {
			folderObj.mkdir();
		}
		
		if (!fileObj.exists()) {
			try {
			System.out.print("Creating a new file ... ");
			fileObj.createNewFile();
			System.out.println("done");
			System.out.println("File exists is: " + fileObj.exists());
			System.out.println("File is: " + fileObj.isFile());
			} catch (IOException e){
			System.out.println("Error" + e.toString());
			}

		}
		
	}
}
