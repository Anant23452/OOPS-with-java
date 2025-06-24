import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sort {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2); 
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        System.out.println("Original list: " + numbers);
        Collections.sort(numbers);// we can't use arrays.sort() here because we are using ArrayList
        System.out.println("Sorted list: " + numbers);
        
    }
}
