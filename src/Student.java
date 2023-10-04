public class Student {
    // Private instance variables
    private String name;
    private int age;
    private char grade;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String newName) {
        name = newName;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int newAge) {
        age = newAge;
    }

    // Getter method for grade
    public char getGrade() {
        return grade;
    }

    // Setter method for grade
    public void setGrade(char newGrade) {
        grade = newGrade;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }
}
