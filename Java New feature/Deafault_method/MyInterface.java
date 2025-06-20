// Interface with abstract method
public interface MyInterface {
    void show();  // abstract method
}

// Interface with default method
interface DefaultMethod {
    default void start() {
        System.out.println("This is a default vehicle starting...");
    }
}

// Class implementing interface with default method
class Car implements DefaultMethod {
    // No need to override start() method
}

// Main class with main method
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // Output: This is a default vehicle starting...
    }
}
