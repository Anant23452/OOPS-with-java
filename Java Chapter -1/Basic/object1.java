

public class object1 {
    String name = "John Doe";
    int age = 30;
    // method function to display information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {

        object1 obj = new object1(); // Creating an instance of the object class
        obj.displayInfo(); // Calling the method to display information
       
    }
    
}
