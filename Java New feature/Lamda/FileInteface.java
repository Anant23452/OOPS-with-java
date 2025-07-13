
@FunctionalInterface
interface hello{
    void sayhello();
}

public class  FileInteface{
public static void main(String[] args) {
    hello lamda = ()->System.out.println("Lambda function is created");
    lamda.sayhello();
}}
