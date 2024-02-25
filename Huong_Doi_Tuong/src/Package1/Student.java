package Package1;

class Student extends Person {
    private String className;
    private double gpa;

    public Student(String fullName, int age, String gender, String className, double gpa) {
        super(fullName, age, gender);
        this.className = className;
        this.gpa = gpa;
    }

    // Getters and Setters for Student
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Class: " + className);
        System.out.println("GPA: " + gpa);
    }
}
