/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class Menu {

    ArrayList<Employee> employees = EmployeeController.getInstance().get();
    Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void printMenu() {
        System.out.print("""
                         -----------MANAGEMENT-----------
                         Press 1. Input employee
                         Press 2. Display employee list
                         Press 3. Best employees
                         Press 4. Display sorted employee list
                         Press 0. Exit
                         --------------------------------
                         """);
        System.out.print("Choose: ");
    }

    public void input() {
        int id;
        String name;
        String address;
        String phone;
        int salary;

        System.out.println("Input employee");
        System.out.print("Input id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input name: ");
        name = scanner.nextLine();
        System.out.print("Input address: ");
        address = scanner.nextLine();
        System.out.print("Input phone: ");
        phone = scanner.nextLine();
        System.out.print("Input salary: ");
        salary = scanner.nextInt();

        Employee employee = new Employee(id, name, address, phone, salary);
        if (EmployeeController.getInstance().isValid(employee)) {
            EmployeeController.getInstance().insert(employee);
            System.out.println("Input succesfullly!");
        } else {
            System.out.println("This id is valid!");
        }
    }

    public boolean isEmpty() {
        if (employees.isEmpty()) {
            System.out.println("No Employee");
            return false;
        }
        return true;
    }

    public void display() {
        Collections.sort(employees, ((Employee o1, Employee o2) -> o1.getId() - o2.getId()));
        display(employees);
    }

    public void display(ArrayList<Employee> employees) {
        if (isEmpty()) {
            System.out.printf("%-5s%-20s%-35s%-15s%-15s\n", "id", "name", "address", "phone", "salary");
            for (Employee e : employees) {
                System.out.println(e.toString());
            }
        }
    }

    public void sort() {
        if (isEmpty()) {
            Collections.sort(employees, (Employee o1, Employee o2) -> o1.getSalary() - o2.getSalary());
            display(employees);
        }
    }

    public void best() {
        if (isEmpty()) {
            Collections.sort(employees, (Employee o1, Employee o2) -> o2.getSalary() - o1.getSalary());
            int max = employees.get(0).getSalary();

            System.out.println("------BEST EMPLOYEE------");
            System.out.printf("%-5s%-20s%-35s%-15s%-15s\n", "id", "name", "address", "phone", "salary");
            for (Employee e : employees) {
                if (max == e.getSalary()) {
                    System.out.println(e.toString());
                } else {
                    break;
                }
            }
        }

//        if (isEmpty()) {
//            Collections.reverse(sort());
//            int max = employees.get(0).getSalary();
//            for (Employee e : employees) {
//                if (max == e.getSalary()) {
//                    System.out.println(e.toString());
//                } else {
//                    break;
//                }
//            }
//        }
    }

    public void process(int selected) {
        switch (selected) {
            case 1 -> {
                System.out.println();
                input();                
            }
            case 2 ->
                display();
            case 3 ->
                best();
            case 4 ->
                sort();
            case 0 ->
                System.out.println("Bye!");
            default ->
                System.out.println("Wrong Input! Try again.");
        }
    }

    public void run() {
        int selected;
        do {
            printMenu();
            selected = scanner.nextInt();
            process(selected);
            System.out.println();
        } while (selected != 0);
    }
}
