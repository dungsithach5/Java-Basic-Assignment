package API_Collection;

import java.util.ArrayList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Khai báo và khởi tạo danh sách
        ArrayList<Person> list = new ArrayList<>();

        // Thêm các đối tượng Person vào danh sách
        Person objPerson1 = new Person("abc", 1);
        list.add(objPerson1);

        list.add(new Person("def", 2));
        list.add(new Person("ghi", 3));

        // In thông tin của các đối tượng trong danh sách
        System.out.println("Danh sách ban đầu:");
        for (Person x : list) {
            System.out.println(x.toString());
        }

        System.out.println("--------------");

        // Xóa đối tượng có tên là "def" khỏi danh sách
        for (Person x : list) {
            if (x.getName().equals("def")) {
                list.remove(x);
                break; // Thêm break để tránh ConcurrentModificationException
            }
        }

        // In thông tin của các đối tượng sau khi xóa
        System.out.println("Danh sách sau khi xóa:");
        for (Person x : list) {
            System.out.println(x.toString());
        }
    }
}




