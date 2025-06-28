
import java.io.FileWriter;
import java.io.IOException;



public class Bytestream {
   public static void main(String[] args){
    try{
        FileWriter filewrite = new FileWriter("myfile.txt");
        filewrite.write("Hello, this is a test file.");
        filewrite.close();
        System.out.println("File written successfully.");
    }catch(IOException e){
        System.out.println("An error occurred while writing to the file." + e.getMessage());
        e.printStackTrace();// Print the stack trace for debugging
    }
    finally {
        System.out.println("Execution completed.");
    }
   }
    
}
