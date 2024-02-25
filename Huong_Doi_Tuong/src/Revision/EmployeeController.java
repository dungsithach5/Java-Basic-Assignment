/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author This PC
 */
public class EmployeeController {
    private ArrayList<Employee> listEmployees;
    private static EmployeeController instance;
    
    private EmployeeController() {
        listEmployees = new ArrayList<>();
    }
    
    public static EmployeeController getInstance() {
        if (instance == null) {
            instance = new EmployeeController();
        }
        return instance;
    }
    
    public boolean isVaild(String id) {
        for (Employee e : listEmployees) {
            if (e.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }
    
    public void add(Employee e) {
        listEmployees.add(e);
    }
    
    public ArrayList<Employee> getListEmployee() {
        return listEmployees;
    }
    
    public ArrayList<Employee> getBestEmployee() {
        double salary = 0;
        for (Employee e : listEmployees) {
            if (e.getSalary() > salary) {
                salary = e.getSalary();
            }
        }
        ArrayList<Employee> tmpElist = new ArrayList<>();
        for (Employee e : listEmployees) {
            if (e.getSalary() == salary) {
                tmpElist.add(e);
            }
        }
        return tmpElist; 
    }
    
    
    public ArrayList<Employee> getSortedListEmployee() {
        ArrayList<Employee> tmpElist = new ArrayList<>(listEmployees);
        Collections.sort(tmpElist, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return Double.compare(employee1.getSalary(), employee2.getSalary());
            }
        });
        return tmpElist;
    }
}
