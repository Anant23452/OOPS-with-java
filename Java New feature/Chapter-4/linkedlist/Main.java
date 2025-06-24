import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.addFirst("orange");
       

        System.out.println("LinkedList: " + list);
        System.out.println("Size of LinkedList: " + list.size());
    }
}