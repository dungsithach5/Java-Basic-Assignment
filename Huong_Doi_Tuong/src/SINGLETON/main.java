package SINGLETON;

public class main {
	public static void main(String[] args) {
		Management m = Management.getInstance();
		m.add(10);
		System.out.println("Day 1" + m.getCount());
		
		Management m1 = Management.getInstance();
		m1.add(20);
		System.out.println("Day 2" + m1.getCount());
		
	}
}
