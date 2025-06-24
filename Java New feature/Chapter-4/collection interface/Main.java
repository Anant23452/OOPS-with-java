import java.util.*;

public class Main{
    public static void main(String[] args){
        Collection<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}