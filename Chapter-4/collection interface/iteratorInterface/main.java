
import java.util.*;

public class main {
    public static void main(String[] args) {
        // collection interface
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        // iterator interface
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}