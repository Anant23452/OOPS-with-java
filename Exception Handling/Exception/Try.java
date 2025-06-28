package Exception;

public class Try {
    public static void main(String[] args) {
        try {
            int x = 13 / 0; // This will cause an ArithmeticException
            System.out.println("This line will not be executed due to the exception");
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute, even if there is an exception");
        }
    }
    
}
