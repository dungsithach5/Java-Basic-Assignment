package API_Collection;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        // Khởi tạo LinkedList
        LinkedList<String> linkedList = new LinkedList<>(); // tạo element nhanh hơn nhưng truy xuất element chậm hơn

        // Thêm phần tử vào LinkedList
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // In các phần tử của LinkedList
        System.out.println("LinkedList elements: " + linkedList);

        // Thêm phần tử vào đầu LinkedList
        linkedList.addFirst("First Element");

        // Thêm phần tử vào cuối LinkedList
        linkedList.addLast("Last Element");

        // In các phần tử sau khi thêm vào đầu và cuối
        System.out.println("LinkedList elements after adding first and last: " + linkedList);
    }
}

