package Revision;

public class Employee {
	private int id;
    private String name;
    private String address;
    private String phone;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String address, String phone, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%-5d%-20s%-35s%-15s%-12d", id, name, address, phone, salary);
    }
}
