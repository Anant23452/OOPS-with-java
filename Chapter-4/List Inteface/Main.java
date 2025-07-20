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
        System.out.println("third freinds: " + names.get(2));
         names.set(2,"anant");
         System.out.println(names);
        var contain=  names.contains("annat");
        System.out.println(contain);
    }
}
