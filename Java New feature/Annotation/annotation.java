import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the NonNull annotation
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE})
@interface NonNull {}

public class annotation implements Runnable {
    // Regual annoation
    @Override
    public void run() {
        System.out.println("Running the annotation example");
    }

    public static void main(String[] args) {
        annotation example = new annotation();
        example.run();
            //Type annotatoin
             @NonNull String name = "John Doe";
             System.out.println("Name: " + name);
    }

}
