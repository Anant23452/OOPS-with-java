
---

### 🧠 What is a Switch Expression?

---

#### ✅ **Definition (Exam Style):**

> A **switch expression** is an enhanced version of the traditional `switch` statement, introduced in **Java 14**, that can **return a value** and use **arrow (`->`) syntax**.

---

### 🔄 Difference: Switch Statement vs Switch Expression

| Feature      | Switch Statement (Old)    | Switch Expression (New) |
| ------------ | ------------------------- | ----------------------- |
| Syntax       | Uses `case:` and `break;` | Uses `case ->`          |
| Value return | ❌ Cannot return a value   | ✅ Can return a value    |
| Fall-through | ✅ Yes (without break)     | ❌ No fall-through       |
| Cleaner code | ❌ More lines              | ✅ Fewer lines           |

---

### ✏️ Traditional Switch Statement (Old)

```java
String result;
int day = 2;

switch (day) {
  case 1:
    result = "Monday";
    break;
  case 2:
    result = "Tuesday";
    break;
  default:
    result = "Holiday";
}
```

---

### 🌟 Switch Expression (New - Java 14)

```java
int day = 2;

String result = switch (day) {
  case 1 -> "Monday";
  case 2 -> "Tuesday";
  default -> "Holiday";
};
```

💡 Java returns the value from switch and stores it in `result`.

---

### 🔁 Switch Expression with Block and yield:

```java
String result = switch (day) {
  case 1 -> {
    System.out.println("Logging...");
    yield "Monday";
  }
  default -> "Holiday";
};
```

🧠 Use `yield` if you need to do multiple things before returning value.

---

### ✨ Exam Writing Points (Very Important):

* Introduced in **Java 14 (Preview in Java 12)**.
* Uses **arrow syntax (`->`)** to make code shorter.
* It is **expression-based** → can **return a value**.
* Removes the need for **break** keyword.
* **No fall-through** → cleaner and safer.

---

### 📝 Final 2-Line Revision Summary:

> Switch Expression is a new feature in Java that returns a value using `switch (...) ->` syntax, making code short and readable.

---

Let me know if you want a **summary cheat sheet of all modern Java features (Java 8 to 17)** or any other topic like **lambda, stream, or functional interfaces** 💻✨
