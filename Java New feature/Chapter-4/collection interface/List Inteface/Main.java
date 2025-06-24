import java.util.*;
public class Main{
    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        names.add("Alice"); 
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate entry
        System.out.println("List of names: " + names);
        System.out.println("First freinds: " + names.get(0));
    }
}
