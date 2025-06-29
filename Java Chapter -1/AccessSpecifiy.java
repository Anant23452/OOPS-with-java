

public class AccessSpecifiy {
public String name = "Access Specifiers in Java"; // Instance variable
private int age = 24; // Private variable
void ShowAge(){
    System.out.println("Age: " + age); // Method to show age
}

    public static void main(String[] args) {
        System.out.println("Access Specifiers in Java Explained!");
        AccessSpecifiy obj = new AccessSpecifiy(); // Creating an instance of the class
        System.out.println("Name: " + obj.name); // Accessing public variable
        // System.out.println("Age: " + obj.age); // This line would cause an error because age is private
        // To access the private variable, we use a method
        obj.ShowAge(); // Calling method to show age
    }
    
}
