import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//stream Api
public class stream{
    public static void main(String[] args){
        System.out.println("Stream API Example");
        List<String> names = Arrays.asList( "Alice", "Bob", "Charlie", "David","Annt","Abhishek","Annt");
        List<String> result = names.stream()
        .filter(n -> n.startsWith("A"))
        .map(String::toUpperCase)
        .sorted()
        .distinct()// Remove duplicates
      
        
        .collect(Collectors.toList());

        
        System.out.println(result); 
       
    }
}