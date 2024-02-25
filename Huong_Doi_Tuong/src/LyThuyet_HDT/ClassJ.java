package LyThuyet_HDT;



public class ClassJ {
	String color;
	int ink_level;

	 void write(String text) {
		if (ink_level >= text.length()) {
			System.out.println("Write" + text + "in" + color);
			ink_level = ink_level - text.length();
		}else {
			System.out.println("Not enough ink");
		}
	 }
	 void refill() {
		 ink_level = 100;
	 }
	 
	 public static void main(String[] args) {
		 ClassJ W = new ClassJ();
		 
		 W.write("Anh tien");
		 
	 }
}
