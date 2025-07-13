import java.io.FileOutputStream;
import java.io.IOException;

public class Bytecode  {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("semester.txt");
        fout.write("SEmester of java paper".getBytes());
        fout.close();
        System.out.println("File is wriiten");
        
    }
}
