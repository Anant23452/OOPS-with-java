
import java.io.FileInputStream;
import java.io.IOException;


public class readfile{
    public static void main(String[] args) throws IOException {
        FileInputStream  fin = new FileInputStream("semester.txt");
           int i = fin.read();

        while (i >=0) {
            System.out.print((char)i);
        }

        fin.close();

    }
}