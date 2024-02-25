package LyThuyet_HDT;


public class Student {
	String name;
	int studentID;
	String major;
	int year;
	String address;
	String phone;
	String status;
	double GPA;
	
	Student(String n , int ID , String m) {
		name = n;
		studentID = ID;
		major = m ;
		year = 2022;
	}
	
	Student(double G) {
		GPA = G ;
	}
	
	void displayBasicInfo() { //public stactic int count (static) la class variable
		System.out.println(name + studentID + major + year);
	}
	
	void displayAllInfo() {
		System.out.println(name + studentID + major + year + address + phone + status + GPA);
	}
	
	void register() {
		status = "register";
	}
	
	void withdraw() {
		status = "withdraw";
	}
	
	public static void main(String[] args) {	
		Student st1 = new Student("Tien " , 202 , " CSE ");
		Student st2 = new Student("Khoa " , 102 , " DS ");
		Student st3 = new Student("Tuan " , 204 , " IBM ");
		
		st1.displayBasicInfo();
		st2.displayBasicInfo();
		st3.displayBasicInfo();
		
		System.out.println();
		
		Student Tien = new Student(9.5);
		System.out.println("GPA of Tien : " + Tien.GPA);
		
		Student Khoa = new Student(6.5);
		System.out.println("GPA of Khoa : " + Khoa.GPA);
		
		Student Tuan = new Student(8.5);
		System.out.println("GPA of Tuan : " + Tuan.GPA);
		
		System.out.println();
		
		double Average = (Tien.GPA + Khoa.GPA + Tuan.GPA)/3;
		
		System.out.println("Average of 3 students = " + Average);
	}
}
