import java.util.*;

public class Main{
    public static void main(String[] args){
        List<String> fruitName  = Arrays.asList("apple", "banana", "cherry");
        // Using forEach to iterate over the list
        fruitName.forEach(fruit -> System.out.println("fruits: " + fruit));
        // Using method reference for cleaner syntax
        // This is a more concise way to achieve the same result
        fruitName.forEach(System.out::println); 


        // Example with a list of integers with stream()

        List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5);
        // Using forEach to iterate over the list
        numbers.stream()
        .filter(n->n%2==0) // Filtering even numbers
        .forEach(n-> System.out.println("Even number: " + n));


    }
}
