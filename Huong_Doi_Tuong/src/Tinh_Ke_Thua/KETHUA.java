package Tinh_Ke_Thua;

public class KETHUA {
	String name;
	int year;
	
	void Show() {
		System.out.println(name + year);	
	}
	
	public KETHUA(String n, int y) {
		this.name = n;
		this.year = y;
	}
}
