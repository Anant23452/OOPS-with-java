import java.util.*;
import java.io.*;
public class PropertiesDemo{
    public static void main(String[] args)throws Exception{
        java.util.Properties p = new java.util.Properties();
        p.setProperty("Username","anant");
        p.setProperty("Password","anant123");

        System.out.println("Username:"  + p.getProperty("Username"));
        
    }
}