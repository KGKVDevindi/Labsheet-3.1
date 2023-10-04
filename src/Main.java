public class Main {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student();

        // Use setter methods to set values for the name, age, and grade attributes
        student.setName("Alice");
        student.setAge(18);
        student.setGrade('A');

        // Call the displayInfo() method on the instance to display its information
        student.displayInfo();
    }
}
