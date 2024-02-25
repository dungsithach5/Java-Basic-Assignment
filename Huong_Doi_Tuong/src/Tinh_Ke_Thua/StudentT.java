package Tinh_Ke_Thua;

public class StudentT extends KETHUA {
	double score;
	
	public void print_student() {
//		System.out.println(name + " - " + year + " - " + score);
		super.Show(); // lấy method show() từ class KETHUA
		super(name,year);
	}
	
	
	public static void main(String[] args) {
		StudentT st1 = new StudentT();
		st1.score = 8;
		st1.name = "abc";
		st1.year=2022;
		st1.Show();
		st1.print_student();
	}
}
