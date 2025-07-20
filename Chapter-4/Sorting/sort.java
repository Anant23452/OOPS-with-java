import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2); 
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
     var size =   numbers.size();
      var array=  numbers.toArray();
      var remove=  numbers.remove(2);
      var contain=  numbers.contains(8);
        System.out.println("Original list: " + numbers);
        Collections.sort(numbers);// we can't use arrays.sort() here because we are using ArrayList
        System.out.println("Sorted list: " + numbers);
        System.out.println(size);
        System.out.println(array);
        System.out.println(remove);
        System.out.println(contain);
        
    }
}
