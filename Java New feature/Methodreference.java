import java.util.*;

// Functional Interface for constructor reference
interface MyInterface {
    Test create();
}

class Test {
    Test() {
        System.out.println("4️⃣ Constructor called");
    }

    static void staticMethod() {
        System.out.println("1️⃣ Static Method Called");
    }

    void instanceMethod() {
        System.out.println("2️⃣ Instance Method (Object) Called");
    }

    void printName(String name) {
        System.out.println("3️⃣ Name: " + name);
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {

        // 1️⃣ Static Method Reference
        Runnable ref1 = Test::staticMethod;
        ref1.run();

        // 2️⃣ Instance Method Reference (object)
        Test obj = new Test(); // Constructor also prints here
        Runnable ref2 = obj::instanceMethod;
        ref2.run();

        // 3️⃣ Instance Method Reference (class type)
        List<String> names = Arrays.asList("Annt", "Java", "Rani");
        names.forEach(obj::printName);  // Method reference with parameters

        // 4️⃣ Constructor Reference
        MyInterface ref4 = Test::new;
        Test newObj = ref4.create();
    }
}
