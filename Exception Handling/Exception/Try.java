

public class Try {
    public static void main(String[] args) {
        try {
             int x = 13 / 0; // This will cause an ArithmeticException
            int u =13/1;
            System.out.println("This line will not be executed due to the exception");
            if(u==13/1){
                throw new ArithmeticException("one is not allowed in my code");
            }

        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute, even if there is an exception");
        }
    }
    
}
