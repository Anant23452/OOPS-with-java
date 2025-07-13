import java.util.*;

public class Main {
  public static void main(String[] args) {
    SortedSet<Integer> set = new TreeSet<>();
    set.add(50);
    set.add(10);
    set.add(30);

    System.out.println(set);        // [10, 30, 50]
    System.out.println(set.first()); // 10
    System.out.println(set.last());  // 50
  }
}