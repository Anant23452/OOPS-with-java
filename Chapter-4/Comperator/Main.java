import java.util.*;
//Student class without comparable
class Student{
    int rollNO;
    String name;

    Student(int rollNO, String name){
        this.rollNO = rollNO;
        this.name = name;
    }
    public String toString(){
        return "Roll No: " + rollNO + ", Name: " + name;
    }
}
// Comparator class to compare Student objects
class SortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name); // Ascending order based on name
    }

}

public class Main{
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sort using the Comparator
        Collections.sort(students, new SortByName());

        // Print sorted students
        for(Student s : students){
            System.out.println(s);
        }
    }
}