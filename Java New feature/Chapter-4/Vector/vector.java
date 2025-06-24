import java.util.Vector;
public class vector{
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("banana");
        vector.add("cherry");
        vector.add("mango");

        System.out.println("Vector:" + vector);
        System.out.println("Size of Vector: " + vector.size());
        vector.remove(1);// Remove the element at index 1 (banana)
        System.out.println("After removing element at index 1: " + vector);
    }
}