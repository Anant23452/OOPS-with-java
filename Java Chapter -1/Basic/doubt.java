public class doubt {
 public static void main(String[] args){
    calculator calc = new calculator(); // Creating an instance of the calculator class
    calc.add(5, 3); // Calling the add method with arguments 5 and
    calc.subtract(10, 4); // Calling the subtract method with arguments 10 and 4
    int product = calc.multiply(6, 7); // Calling the multiply method with arguments 6 and 7
    System.out.println("Product: " + product); // Printing the product
 }
}
class calculator{
    int a, b; // Instance variables for calculator
    void add(int x, int y) {
        a = x;
        b = y;
        System.out.println("Sum: " + (a + b));
    }
    void subtract(int x, int y) {
        a = x;
        b = y;
        System.out.println("Difference: " + (a - b));
    }
    int multiply(int x, int y) {
        return x * y; // Returns the product of x and y
    }
    // This class is a placeholder for a calculator functionality.
    // It can be expanded with methods for addition, subtraction, etc.
}
// This is a placeholder class to demonstrate the structure of a Java program.