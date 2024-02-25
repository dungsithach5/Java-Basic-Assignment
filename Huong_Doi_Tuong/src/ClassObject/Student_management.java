package ClassObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import Package1.Student;
public class Student_management {
ArrayList<Student> students = new ArrayList<>();
    

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudentList() {
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i));
            System.out.println("");
        }
    }

    public void displayStudentWithHighestAverageScore() {
        Student maxStudent = Collections.max(students, Comparator.comparingDouble(Student::getAverageScore));
        maxStudent.printStudentInfo();
    }

    public void displayStudentWithLowestAverageScore() {
        Student minStudent = Collections.min(students, Comparator.comparingDouble(Student::getAverageScore));
        minStudent.printStudentInfo();
    }

    public void displayStudentsSortedByAverageScoreDescending() {
        Collections.sort(students, Comparator.comparingDouble(Student::getAverageScore).reversed());
        displayStudentList();
    }

    public void searchStudentByName(String name) {
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(name)) {
                student.printStudentInfo();
                return;
            }
        }
        System.out.println("No student named: " + name);
    }

    public void deleteStudentsWithLowAverageScore(double threshold) {
        students.removeIf(student -> student.getAverageScore() < threshold);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_management management = new Student_management();

        while (true) {
            System.out.println("--------------------------MENU---------------- -------");
            System.out.println("1. Enter students");
            System.out.println("2. Display list");
            System.out.println("3. Student with highest score");
            System.out.println("4. Student with the lowest score");
            System.out.println("5. List descending by average score");
            System.out.println("6. Search");
            System.out.println("7. Capitalize student name");
            System.out.println("8. Lower case student name");
            System.out.println("9. Delete students < 5 points");
            System.out.println("-------------------------------------------- ---------------");
            System.out.print("Select: ");
            int choice;
            try {
            choice = sc.nextInt();
            sc.nextLine();
            } catch (InputMismatchException e) {
                sc.nextLine(); // Xóa dòng nhập không hợp lệ
                continue; // Quay lại vòng lặp để yêu cầu chọn lại
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter first and last name: ");
                    String fullName = sc.nextLine();
                    System.out.print("Enter class: ");
                    String className = sc.nextLine();
                    System.out.print("Enter average score: ");
                    double averageScore = sc.nextDouble();
                    Student student = new Student(fullName, className, averageScore);
                    management.addStudent(student);
                    break;
                case 2:
                    management.displayStudentList();
                    break;
                case 3:
                    management.displayStudentWithHighestAverageScore();
                    break;
                case 4:
                    management.displayStudentWithLowestAverageScore();
                    break;
                case 5:
                    management.displayStudentsSortedByAverageScoreDescending();
                    break;
                case 6:
                    System.out.print("Enter the name of the student you want to search for: ");
                    String searchName = sc.nextLine();
                    management.searchStudentByName(searchName);
                    break;
                case 7:
                    System.out.print("Enter the student's name to be capitalized: ");
                    String upperCaseName = sc.nextLine();
                    for (Student s : management.students) {
                        if (s.getFullName().equalsIgnoreCase(upperCaseName)) {
                            s.toUpperCaseFullName();
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.print("Enter the student's name in lowercase: ");
                    String lowerCaseName = sc.nextLine();
                    for (Student s : management.students) {
                        if (s.getFullName().equalsIgnoreCase(lowerCaseName)) {
                            s.toLowerCaseFullName();
                            break;
                        }
                    }
                    break;
                case 9:
                    double threshold = 5;
                    management.deleteStudentsWithLowAverageScore(threshold);
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
                    break;
            }
        }
    }
}
