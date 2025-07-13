import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args){
        Map<String,Integer> students = new HashMap<>();
        // Map<String,Integer> students = new TreeMap<>();
        // Map<String,Integer> students = new LinkedHashMap<>();

        students.put("Alice", 89);
        students.put("bod",65);
        students.put("Charlie", 92);    
        students.put("David", 75);

        System.out.println("Students and their scores: " + students);
        System.out.println("Student charli scored: " + students.get("Charlie"));
    }
}
