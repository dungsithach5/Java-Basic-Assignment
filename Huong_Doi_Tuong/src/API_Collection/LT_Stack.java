package API_Collection;

import java.util.Stack;
import java.util.*;
/*
 boolean empty()
 */

public class LT_Stack {
	public static void main(String[] args) {
		STACK();
		//PriorityQueue();
		
	}
	
	public static void STACK() {
		Stack<Integer> stack = new Stack<>();
		stack.push(10); // thêm số vào đỉnh của stack ( nằm cuối danh sách )
		stack.push(20);
		stack.push(30);
		stack.push(40); // top
		
		int a = stack.peek(); // lấy vị trí đầu (ko thể vị loại bỏ)
		System.out.println("Element of top: " + a);
		
//		System.out.print("All element: ");
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " "); //pop() là xóa giá trị ở đỉnh stack
		}
		System.out.println(stack.size());
	}
	
	public static void PriorityQueue() {
		Queue<String> myQueue = new PriorityQueue<String>(); // tự động sắp xếp theo alpha b
		myQueue.offer("Monday"); // thêm giá trì vào cuối
		myQueue.offer("Tuesday");
		myQueue.offer("Wednesday");
		myQueue.add("Thursday"); // thêm giá trị vào cuối
		myQueue.add("Friday");
		myQueue.add("Weekend");
		
		String head = myQueue.remove();
		System.out.print("1) Push out " + head + "from the queue ");
		System.out.println("and the new head is now : " + myQueue.element()); // trả về giá trị ở vị trí đầu
		
		head = myQueue.poll();
		System.out.print("2) Push out " + head + "from the queue ");
		System.out.println("and the new head is now : " + myQueue.peek());
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll()); // lấy câu lệnh trên cùng (tương tự remove();
		}
//		head = myQueue.poll(); // kiểu poll() trả về giá tị null
//		head = myQueue.remove(); // kiểu remove() trá về lỗi
//		System.out.println(head);
		
		// có 3 cách để xóa
		// cách 1
		if (myQueue.isEmpty()) {
			System.out.println("queue is empty!");
		}else {
			head = myQueue.remove();
		}
		System.out.println("-------------");
		
		// cách 2
		head = myQueue.poll();
		if (head == null) {		
			System.out.println("queue is empty!");
		}
		System.out.println("-------------");
		
		// cách 3
		try {
			head = myQueue.remove();
		} catch (NoSuchElementException e) {
			System.out.println("queue is empty!");
		}
		
	}
}
