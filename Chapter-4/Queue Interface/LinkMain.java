import java.util.*;

public class LinkMain {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.add("Annt");
    q.add("Java");
    System.out.println(q.peek());   // Annt
    q.poll();                       // removes "Annt"
    System.out.println(q);          // [Java]
  }
}
