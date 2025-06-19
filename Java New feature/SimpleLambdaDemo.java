// Save as SimpleLambdaDemo.java

// Step 1: Create a Functional Interface
@FunctionalInterface
interface Hello {
    void sayHello(); // Only one abstract method
}

public class SimpleLambdaDemo {
    public static void main(String[] args) {

        // 🌼 1. OLD WAY: Using Anonymous Class
        Hello oldWay = new Hello() {
            public void sayHello() {
                System.out.println("👵 Old Way: Hello Annt from Anonymous Class!");
            }
        };
        oldWay.sayHello();

        // ✨ 2. NEW WAY: Using Lambda Expression
        Hello newWay = () -> System.out.println("✨ New Way: Hello Annt from Lambda Expression!");
        newWay.sayHello();
    }
}
