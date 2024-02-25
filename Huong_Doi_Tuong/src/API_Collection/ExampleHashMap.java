package API_Collection;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        // Khởi tạo HashMap với key là String và value là Integer
        Map<String, Integer> hashMap = new HashMap<>();

        // Thêm cặp key-value vào HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // In các phần tử của HashMap
        System.out.println("HashMap elements: " + hashMap);

        // Truy cập giá trị thông qua key
        String keyToGet = "Two";
        int value = hashMap.get(keyToGet);
        System.out.println("Value for key '" + keyToGet + "': " + value);

        // Kiểm tra sự tồn tại của một key trong HashMap
        String keyToCheck = "Four";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println("Key '" + keyToCheck + "' is present in the HashMap.");
        } else {
            System.out.println("Key '" + keyToCheck + "' is not present in the HashMap.");
        }

        // Xóa một cặp key-value từ HashMap
        String keyToRemove = "Three";
        hashMap.remove(keyToRemove);

        // In lại các phần tử sau khi xóa
        System.out.println("HashMap elements after removing key '" + keyToRemove + "': " + hashMap);
    }
}

