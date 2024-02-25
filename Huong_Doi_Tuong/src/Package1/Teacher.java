package Package1;

class Teacher extends Person {
    private double salary;

    public Teacher(String fullName, int age, String gender, double salary) {
        super(fullName, age, gender);
        this.salary = salary;
    }

    // Getters and Setters for Teacher
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }
}
