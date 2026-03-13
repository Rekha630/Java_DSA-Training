class Student {
class student {
    String name;
    int id;

    // Constructor using 'this' keyword
    Student(String name, int id) {
    student(String name, int id) {
        this.name = name;
        this.id = id;
    }
@@ -13,7 +13,7 @@ void display() {
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        student s = new student("Alice", 101);
        s.display();
    }
}
