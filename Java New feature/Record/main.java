

public class main {
    // Define a record to store student data
record Student(String name, int rollNo) { }
    public static void main(String[] args){
          // Create a Student record object
    Student s1 = new Student("Annt", 101);
    System.out.println(s1);

    }
}
//sealed class 
sealed class Animal permits Dog, Cat { }

final class Dog extends Animal { }
final class Cat extends Animal { }
