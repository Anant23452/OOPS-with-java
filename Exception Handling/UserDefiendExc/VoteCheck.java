// STEP 1: Create your own Exception
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);  // this sends the message to the parent Exception class
    }
}

// STEP 2: Use your exception in a program
public class VoteCheck {
    public static void main(String[] args) {
        int age = 15; // You can change this value to test

        try {
            checkAge(age);  // calling method
        } catch (UnderAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());  // show error message
        }
    }

    // STEP 3: Create method that checks age
    public static void checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            // if age is less than 18, throw your custom exception
            throw new UnderAgeException("You must be 18+ to vote.");
        } else {
            System.out.println("You are allowed to vote!");
        }
    }
}
