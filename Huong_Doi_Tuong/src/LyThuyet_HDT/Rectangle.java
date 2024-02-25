package LyThuyet_HDT;

public class Rectangle {
	int w;
	int h;
	
	Rectangle (int w , int h) {
		this.w = w;
		this.h = h;
	}
	
	void print_area() {
		System.out.println("area : " + w*h + "cm2");
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2,3);
		r1.print_area();
		Rectangle r2 = new Rectangle(3,4); {		
			 void print_area() {
				System.out.println("area : " + w*h*100 +  " mm2");
			 }
		};
		r2.print_area2();
		
	}
}
