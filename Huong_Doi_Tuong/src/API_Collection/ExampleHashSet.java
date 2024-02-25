package API_Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * List là hàm chưa đối tượng null , trùng nhau
 * SET ko cho phsep trùng nhau , tập hợp không trùng nhau
 * Wrapper là kiểu dữ liệu không cho phép dùng kiểu dữ liệu nguyên thủy
 */

public class ExampleHashSet {
	public static void main(String[] args) {
		DEMOSet();
		hashset();
    }
	
	public static void DEMOSet() {
		Scanner sc = new Scanner(System.in);
		Set<Integer> numSet = new HashSet();
		int n; 
		do {
			System.out.println("Input 0 = exit . Input n =");
			n = sc.nextInt();
			numSet.add(n);
		}while (n != 0);
			for (Integer i : numSet) {
				System.out.println(i + " ");
			}
	}
	
	public static void hashset() {
		// Khởi tạo HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Thêm phần tử vào HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");  // Phần tử trùng lặp, sẽ không được thêm vào

        // In các phần tử của HashSet
        System.out.println("HashSet elements: " + hashSet);

        // Kiểm tra sự tồn tại của một phần tử trong HashSet
        String searchElement = "Banana";
        if (hashSet.contains(searchElement)) {
            System.out.println(searchElement + " is present in the HashSet.");
        } else {
            System.out.println(searchElement + " is not present in the HashSet.");
        }

        // Xóa một phần tử từ HashSet
        hashSet.remove("Orange");

        // In lại các phần tử sau khi xóa
        System.out.println("HashSet elements after removing 'Orange': " + hashSet);
	}
}
