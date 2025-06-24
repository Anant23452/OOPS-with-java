import java.util.*;

class Student implements java.lang.Comparable<Student>{
    int rollNo;
    String name;
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    public int compareTo(Student s){
        return this.rollNo - s.rollNo; // Ascending order based on roll number
    }
    public String toString(){
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}
public class StudentSortDemo{

    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students); // Sorts using the compareTo method

        for(Student s : students){
            System.out.println(s);
        }
        
    }
}