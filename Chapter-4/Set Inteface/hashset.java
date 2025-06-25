import java.util.HashSet;
// HashSet example in Java
// A HashSet is a collection that contains no duplicate elements.   
// It is part of the Java Collections Framework and implements the Set interface.
public class hashset {

    public static void main(String[] args){
        HashSet<String> hashset = new HashSet<>();
        hashset.add("annt");
        hashset.add("nova");
        hashset.add("annt");
        hashset.add("nova");        

        System.out.println("HashSet: " + hashset);
        System.out.println("Size of HashSet: " + hashset.size());
    }
}