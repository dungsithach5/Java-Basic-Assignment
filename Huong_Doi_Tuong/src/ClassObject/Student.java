package ClassObject;

public class Student {
	String fullName;
    String className;
    double averageScore;

    public Student(String a, String b, double c) {
        this.fullName = a;
        this.className = b;
        this.averageScore = c;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String a) {
        fullName = a;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String b) {
        className = b;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double c) {
        averageScore = c;
    }
    
    public void printStudentInfo() {
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Lớp: " + className);
        System.out.println("Điểm trung bình: " + averageScore);
    }
    
    public void toUpperCaseFullName() {
        fullName = fullName.toUpperCase();
    }

    public void toLowerCaseFullName() {
        fullName = fullName.toLowerCase();
    }
    
    @Override
    public String toString() {
        return 
                "fullname='" + fullName + '\'' +
                ", className='" + className + '\'' +
                ", GPA=" + averageScore;
    }
}
