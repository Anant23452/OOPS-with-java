

// ## 🧩 **Hashtable Class – Java**

// ---

// ### 🔹 Key Points:

// * ✅ Part of **`java.util`** package
// * ✅ Stores **key-value pairs** like a `Map`
// * ✅ **No null keys or null values** allowed
// * ✅ **Synchronized** (thread-safe)
// * ✅ Slower than `HashMap` but safe for multi-threading

// ---



import java.util.*;

public class Main {
  public static void main(String[] args) {
    Hashtable<Integer, String> table = new Hashtable<>();

    table.put(1, "Annt");
    table.put(2, "Java");

    System.out.println(table.get(1));     // Annt
    System.out.println(table);            // {2=Java, 1=Annt}
  }
}

// table.put(null, "Test");     // ❌ Throws NullPointerException
// table.put(3, null);          // ❌ Not allowed


// ### 🆚 Hashtable vs HashMap (Quick Table):

// | Feature         | `Hashtable` | `HashMap`               |
// | --------------- | ----------- | ----------------------- |
// | Thread-safe     | ✅ Yes       | ❌ No (not synchronized) |
// | Allows null key | ❌ No        | ✅ One null key          |
// | Speed           | Slower      | Faster                  |

// ---

