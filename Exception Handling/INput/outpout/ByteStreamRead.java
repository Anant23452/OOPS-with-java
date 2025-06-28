

import java.io.FileReader;
import java.io.IOException;


public class ByteStreamRead {
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("myfile.txt");
            int character;
            while((character = reader.read())!= -1){
                System.out.print((char) character);
            };
            reader.close();
        }
         catch(IOException e){
        System.out.println("An error occureed during reading of file:" + e.getMessage());
    }
    finally {
        System.out.println("File reading completed.");
    }
    }
    }
   

