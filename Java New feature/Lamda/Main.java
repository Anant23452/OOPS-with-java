

// Functional interface with 1 method
@FunctionalInterface
interface MyInterface {
    MyClass create();  // Will return a new MyClass object
}

// A simple class with a constructor
class MyClass {
    MyClass() {
        System.out.println("🎉 Constructor called using method reference!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Constructor reference using ::
        MyInterface obj = MyClass::new;

        // Call create() → it runs constructor of MyClass
        obj.create();
    }
}
 
    

