## 🔶 1. `throw`

**👉 Used to actually throw an exception manually**

| Feature         | Description                           |
| --------------- | ------------------------------------- |
| **Used in**     | Method body (code block)              |
| **Purpose**     | To raise a specific exception         |
| **Syntax**      | `throw new ExceptionType("message");` |
| **Followed by** | An object of exception                |

#### ✅ Example:

```java
if (num < 0) {
    throw new ArithmeticException("Negative number not allowed");
}
```

---

### 🔶 2. `throws`

**👉 Used in method declaration to inform that the method might throw exceptions**

| Feature         | Description                                   |
| --------------- | --------------------------------------------- |
| **Used in**     | Method signature                              |
| **Purpose**     | To declare that a method can throw exceptions |
| **Syntax**      | `methodName() throws ExceptionType`           |
| **Followed by** | Exception class name(s)                       |

#### ✅ Example:

```java
public void readFile() throws IOException {
    // code that may cause IOException
}
```

---

### 🔶 3. `try/catch`

**👉 Used to catch and handle exceptions at runtime**

| Feature         | Description                                                                 |
| --------------- | --------------------------------------------------------------------------- |
| **Used in**     | Method body (code block)                                                    |
| **Purpose**     | To handle exceptions gracefully                                             |
| **Syntax**      | `try { ... } catch (Exception e) { ... }`                                   |
| **Followed by** | `try` block followed by one or more `catch` blocks (optionally a `finally`) |

#### ✅ Example:

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Caught: " + e.getMessage());
}
```

---

### 💡 Side-by-Side Comparison Table

| Feature         | `throw`                            | `throws`                              | `try/catch`                      |
| --------------- | ---------------------------------- | ------------------------------------- | -------------------------------- |
| Role            | Actually throws an exception       | Declares exceptions                   | Handles exceptions               |
| Location        | Inside method                      | In method declaration                 | Inside method                    |
| Purpose         | Generate an exception              | Warn compiler that method might throw | Catch and deal with exceptions   |
| Syntax          | `throw new Exception()`            | `method() throws Exception`           | `try { } catch(Exception e) { }` |
| Requires catch? | No (but exception must be handled) | Yes (caller must handle or declare)   | Yes (for handling exceptions)    |

---

### 🎯 Real-Life Analogy (fun & simple):

* **`throw`** = You throw a ball (exception)
* **`throws`** = You warn someone: "I might throw the ball, be ready!"
* **`try/catch`** = You try to **catch** the ball when it’s thrown!
