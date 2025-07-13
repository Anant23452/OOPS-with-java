__Idea Behind Exception
---Exception is an unwanted or unexpected event which occurs during the execution of a program (i.e. at run time), that disrupts the normal flow of the program's instructions.

--Exception can be caught and handled by the program.
--When an exception occurs, Java creates an object that represents the error (called 'exception object')—it contains info about the error, its type, and where it happened in code.

An Exception can occur due to:
-invalid user input
-device failure
-loss of network connection
-out of bounds
-type mismatch
-opening an unavailable file
-database error
-arithmetic error

Exception Handling
Exception handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc. The main purpose of exception handling is to maintain normal application flow.

Types of exception
- Checked Exception: These are exceptions that are checked at compile-time. The compiler checks whether the exception is handled or not. If not handled, it gives a compile-time error. Examples include IOException, SQLException, etc.
    These usually occur due to external issues like:

        File not found

        Network down

        Database issues

✅ Common Checked Exceptions:

    IOException

    SQLException

    FileNotFoundException

    ClassNotFoundException


- Unchecked Exception: These are the exceptions that are not checked at compile-time. They are checked at runtime. Unchecked exceptions are subclasses of RuntimeException. Examples include NullPointerException, ArrayIndexOutOfBoundsException, etc.
✅ Common Unchecked Exceptions:

    NullPointerException

    ArithmeticException

    ArrayIndexOutOfBoundsException

    IllegalArgumentException

    NumberFormatException



- Error IN JAVA 
: These are serious problems that a reasonable application should not try to catch. Examples include OutOfMemoryError, StackOverflowError, etc. Errors are not exceptions and should not be caught.

Excepton Flow 
When an exception occurs, the normal flow of the program is disrupted. The Java Virtual Machine (JVM) looks for a suitable exception handler to handle the exception. If no handler is found, the program terminates.


🚦 What is Control Flow in Exception Handling?

It means:

    "What lines will be executed and in what order, when an exception occurs or doesn't occur in a try-catch-finally block."

🔰 Basic Syntax:

try {
    // risky code
} catch (ExceptionType e) {
    // handle exception
} finally {
    // always runs
}


### 🔶 1. `throw`

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

---

If you want, I can create a mini Java program using all three together — want that? 😊
