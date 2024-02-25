package OUTER_NESTED;

public class outer {
	int a ;
	private int b;
	class inner {
		int c = a + b;
		void print_value() { // 2 method are the same name but different class
			System.out.println("inner value: " + c);
			this.print_value(); // call method in another class
		}
	}
	
	void print_value() {
		class LocalInner { // local inner only in 1 method	
			int c = 10 ;
			void print_value() {
				System.out.println("local inner value: " + c);
			}
		}
		LocalInner objL = new LocalInner();
		System.out.println("local inner valuer: " + objL.c);
		System.out.println("outer value: " + a);
	}
	
	public static void main(String[] args) {
		outer objO = new outer();
		outer.inner objI= objO.new inner();
		
//		objI.print_value();
		objO.print_value();
//		objI.c = 5;
//		objI.print_value();
		
	}
}
