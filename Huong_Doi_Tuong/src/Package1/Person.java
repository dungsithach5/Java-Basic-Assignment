package Package1;

class Person {
    private String fullName;
    private int age;
    private String gender;

    public Person(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
    // Full Name
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}