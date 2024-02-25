package LyThuyet_HDT;

// vì dụ về instance variable , class variable

public class student_test {
	String name;
	int studentID;
	int year;
	static int student_num;
	
	student_test(String n , int x){ //constructors
		name = n;
		year = x;
		student_num++;
		studentID = (year % 100)*10000  + student_num; // tạo method ở đây
	}
	
	static int writeNum() { // class method
		System.out.println("Student number : " + student_num);
		return student_num;
	}
	
	void writeInfo() { // instance method
		System.out.println(name + " " + studentID + " " + year);
	}
	
	public static void main(String[] args) {
		student_test st1 = new student_test("Huynh" , 2022);
		student_test st2 = new student_test("Anh" , 2023);
		student_test st3 = new student_test("Tien" , 2026);
		
		writeNum();
		st1.writeInfo();
		st2.writeInfo();
		st3.writeInfo();

		
		
	}
}
