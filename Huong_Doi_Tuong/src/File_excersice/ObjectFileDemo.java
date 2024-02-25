package File_excersice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class ObjectFileDemo {
	private static void printList(Vector<Person> list) {
        for (Person p : list) {
            System.out.println(p.toString());
        }
    }
    
    public static void main(String[] args) {
        Vector<Person> list = new Vector();
        list.add(new Person("Nguyen Van A", 20));
        list.add(new Person("Nguyen Van B", 21));
        list.add(new Person("Nguyen Van C", 22));
        
        System.out.println("Danh sach truoc khi luu");
        printList(list);
        save(list);
        
        Vector<Person> readList = read();
        System.out.println("Danh sach");
        printList(readList);
        
    }
    
    private static void save(Vector<Person> list) {
        FileOutputStream fout;
        ObjectOutputStream output;
        
        try {
            fout = new FileOutputStream("object.txt");
            output = new ObjectOutputStream(fout);
            
            output.writeInt(list.size());
            for (Person p : list) {
                output.writeObject(p);
            }
            
            output.close();
            fout.close();
        } catch(Exception ex) {
            System.out.println("Error" + ex.toString());
        }
    }
    
    private static Vector<Person> read() {
        Vector<Person> list = new Vector();
        
        FileInputStream fIn;
        ObjectInputStream input;
        
        try {
            fIn = new FileInputStream("object.txt");
            input = new ObjectInputStream(fIn);
            
            int num = input.readInt();
            for (int i = 0; i < num; i++) {
                Person p = (Person)input.readObject();
                list.add(p);
            }
            input.close();
            fIn.close();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        
        return list;
    }
}
