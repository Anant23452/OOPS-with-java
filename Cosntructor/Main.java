class Student {
  int roll_number;
  String name;
  String branch;
  String email;

  // Constructor with print statements
  Student(int roll_number, String name, String branch, String email) {
    this.roll_number = roll_number;
    this.name = name;
    this.branch = branch;
    this.email = email;

    // Directly printing details
    System.out.println("Roll No: " + roll_number);
    System.out.println("Name   : " + name);
    System.out.println("Branch : " + branch);
    System.out.println("Email  : " + email);
    System.out.println("-------------------------");
  }
}

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student(101, "Annt", "Electrical", "annt@gmail.com");
    Student s2 = new Student(102, "Vijay", "CSE", "vijay@gmail.com");
  }
}
