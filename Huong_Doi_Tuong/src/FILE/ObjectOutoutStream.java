 package FILE;
import java.io.*;

public class ObjectOutoutStream {
	public static void main(String[] args) {
		
		
		
		ObjectOutputStream();
		ObjectInputStream();
	}
	
	
	
	public static void ObjectOutputStream() {
		try{
			FileOutputStream fout = new FileOutputStream("C:/JavaFile/data.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			Person p1 = new Person("Tran Van A", 21);
			Person p2 = new Person("Thai Hung", 20);
			out.writeInt(20); //write integer
			out.writeDouble(20.5d); //write double
			out.writeObject(p1);//write object
			out.writeObject(p2);//write object
			out.close();
			fout.close();
		}catch(IOException e){
			System.out.println("Error:" + e.toString());
		}
	}
	
	public static void ObjectInputStream() {
		try{
			FileInputStream fIn = new FileInputStream("C:/JavaFile/data.txt");
			ObjectInputStream in = new ObjectInputStream(fIn);
			int a = in.readInt();
			double b = in.readDouble(); // lưu dữ liệu theo bit lớn , nếu chuyển sang Float thì lưu dữ bit nhỏ (phải gấp đối float)
			Person p1 = (Person)in.readObject();
			Person p2 = (Person)in.readObject();
			System.out.println("Int: " + a + ", Double: " + b);
			p1.display();
			p2.display();
			in.close();
			fIn.close();

		}catch(Exception e){
			System.out.println("Error:" + e.toString());
		}
	}
}
