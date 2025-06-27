import java.io.FileReader;
import java.io.IOException;

public class  Chekced{
    public static void main(String[ ] args){
        try{
            FileReader file = new FileReader(file.txt);

        }catch(IOException e){
            System.out.println("File not found or cannot be opened:" + e.getMessage());
        }
    }
}