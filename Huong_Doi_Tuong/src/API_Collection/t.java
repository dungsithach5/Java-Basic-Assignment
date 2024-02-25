package API_Collection;

import java.util.ArrayList;
import java.util.List;

public class t {
	public static void main(String args[]){  
		 //Creating a List  
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango"); // thêm  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");
		 list.add("Orange");
		 list.clear(); // xóa sạch
		 list.addAll(list); //thêm toàn bộ dư liẹu
		 //list.equals();
		 list.get(1); // chọn ra 1 vị trí trong list 
		 list.hashCode(); // trả về mọt giá trị hashcode trong list
		 list.isEmpty(); // kiểm tra trong list có trống không
		 list.lastIndexOf(list); // trả về giá trị cuối cùng trong list , trả về -1 nếu ko giá trị trong list
		 list.contains("Mango"); // chứa một đối tương nào đấy
		 //list.replaceAll('',' '); // thay thế
		 list.sort(null); // trả về giá trị giảm dần
		 list.subList(0,0);
		 list.size(); // kích thước cảu list		 
		 
		 
		 
 		 //Iterating the List element using for-each loop  
		   
		 //list.remove(2); //xóa ở vị trí index
		 for(String fruit:list)  // dùng loop này đẻ chạy trên arraylist
			  System.out.println(fruit);
		}  
}
