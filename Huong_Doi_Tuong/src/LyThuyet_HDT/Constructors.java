package LyThuyet_HDT;

// ví dụ về Constructors

public class Constructors {
	String color;
	int ink_level;

	Constructors(String c , int i) { // tạo Constructors object
		 color = c;
		 ink_level = i;
	}
	Constructors(String d) {
		 color = d;
		 ink_level = 100;
	}
	
	 void write(String text) { // giống print
		if (ink_level >= text.length()) {
			System.out.println("Write: " + text + " in " + color);
			ink_level = ink_level - text.length();
		}else {
			System.out.println("Not enough ink");
		}
	 }
	 void refill() { // cho dữ liệu 
		 ink_level = 100;
	 }
	 
	 public static void main(String[] args) {
		 ClassJ W = new ClassJ();
		 ClassJ R = new ClassJ();
		 Constructors marker1 = new Constructors("blue" , 50);
		 System.out.println(marker1.color + " " + marker1.ink_level); // gọi lại biến
		 marker1.write("Hello World"); // gọi và truyền dữ liệu
		 
		 Constructors marker2 = new Constructors("red" , 70);
		 System.out.println(marker2.color + " " + marker2.ink_level);
		 marker2.write("I'm learning OOP");
		 
		 System.out.println(marker2.color + " " + marker2.ink_level); // in ra giá trị đã thay đổi
		 
		 Constructors marker3 = new Constructors("pink");
		 
		 
	 }
	
}

