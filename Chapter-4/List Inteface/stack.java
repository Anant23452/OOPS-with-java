

// ## 📚 **Stack – Java Collection**

// ---

// ### 🔹 Key Points:

// * ✅ **LIFO** (Last In, First Out)
// * ✅ Extends `Vector` class
// * ✅ Part of **`java.util`** package
// * ✅ Methods: `push()`, `pop()`, `peek()`, `empty()`
// * ✅ Used in: **undo features**, **expression evaluation**, **backtracking**

// ---

// ### 🧪 Simple Code:


import java.util.*;

public class stack {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    stack.push("Java");
    stack.push("Python");
    System.out.println(stack.peek()); // Python
    stack.pop();
    System.out.println(stack);        // [Java]
  }
}

// ### 📝 Final Line (for exam copy):

// > `Stack` is a LIFO collection used to store and access elements in reverse order using `push()`, `pop()`, and `peek()` methods.

// ---


