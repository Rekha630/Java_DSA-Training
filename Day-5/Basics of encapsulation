// Encapsulation Example in Java
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setters
        student.setName("Alice");
        student.setAge(20);

        // Getting values using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Trying invalid age
        student.setAge(150); // Will show validation message
    }
}

// Student class demonstrating encapsulation
class Student {
    // Private fields (hidden from outside classes)
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Name cannot be empty.");
        }
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age with validation
    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be between 5 and 100.");
        }
    }
}
