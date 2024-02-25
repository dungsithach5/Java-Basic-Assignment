package ArrayOfObject;
// tạo mảng object
public class Student {
	String name;
	int year;
	
	Student(String name , int year) {
		this.name = name;
		this.year = year;
	}
	
	public static void main(String[] args) {
		Student st1 = new Student("abc" , 2022);
		Student[] st_array = new Student[100];
		
		for(int i = 0 ; i < 100 ; i++) {
			st_array[i] = new Student("Student " + i,2022);
		}
		
		System.out.println(st_array[10].name);
		System.out.println(st_array.length);
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(st_array[i].name); // liệt kê i
		}
	}
}
