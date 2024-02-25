package Package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Students");
            System.out.println("2. Add Teachers");
            System.out.println("3. Display Student List");
            System.out.println("4. Display Teacher List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Full Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String studentGender = scanner.nextLine();
                    System.out.print("Enter Class Name: ");
                    String className = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();

                    students.add(new Student(studentName, studentAge, studentGender, className, gpa));
                    break;
                case 2:
                    System.out.print("Enter Full Name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int teacherAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String teacherGender = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    teachers.add(new Teacher(teacherName, teacherAge, teacherGender, salary));
                    break;
                case 3:
                    System.out.println("Student List:");
                    for (Student student : students) {
                        student.displayInfo();
                        System.out.println("----------------");
                    }
                    break;
                case 4:
                    System.out.println("Teacher List:");
                    for (Teacher teacher : teachers) {
                        teacher.displayInfo();
                        System.out.println("----------------");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
