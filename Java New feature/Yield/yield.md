yeild introduce in java 13 
Before yield switch statement in java did't return value but after yeild introduce switch statement can return value

key benifits 
-clarity=
-flexibility=
-conscisness=


## 🌟 1. `yield` Keyword (Java 13+)

---

### ✅ **Definition (Exam Style):**

> `yield` is a **new keyword** used inside **switch expressions** to **return a value** when using **block-style case**.

---

### 🔸 Why do we need `yield`?

If we are using **curly braces `{}`** in a `case`, we can’t use `return`, so we use `yield` to **send the result back**.

---

### 🔹 Simple Example:

```java
String dayType = switch (day) {
  case 1, 2, 3, 4, 5 -> "Weekday";
  case 6, 7 -> {
    System.out.println("Weekend is here!");
    yield "Weekend"; // ✅ yield used to return value
  }
  default -> "Invalid day";
};
```

---

### 🔸 Exam Writing Points:

* `yield` is used **inside a block** in switch expression.
* It **returns the value** from that case.
* Introduced in **Java 13** (standard in Java 14).

---

### 🔹 One-line Summary:

> `yield` is used inside switch expressions to return a value from block-style `case`.

---

## 🧾 2. Text Blocks (Java 15+)

---

### ✅ **Definition (Exam Style):**

> Text Blocks allow you to write **multi-line strings** using **`"""` triple quotes**, making it easier to write **HTML, JSON, SQL, or multi-line messages**.

---

### 🔸 Syntax:

```java
String html = """
  <html>
    <body>
      <h1>Hello, Annt!</h1>
    </body>
  </html>
""";
```

💡 You don’t need to use `\n` or `+` for new lines anymore.

---

### 🔸 Features:

* Preserves **formatting and indentation**.
* Easier to write **long strings** like HTML, SQL.
* Removes need for `+` and `\n`.

---

### 🔹 Exam Writing Points:

* Introduced in **Java 15**.
* Uses **triple double quotes (`"""`)**.
* Used to write **multi-line strings** easily.
* More readable and clean.

---

### 🔹 One-line Summary:

> Text Blocks (Java 15) let you write multi-line strings with `"""`, making the code cleaner and readable.

---

## 🎯 Final Flash Cards for You 💡

| Feature    | Use                                               |
| ---------- | ------------------------------------------------- |
| `yield`    | Return value from `case {}` in switch expressions |
| Text Block | Create multi-line string using `"""`              |

---

Let me know if you want a **Java modern features summary page** or a **quick printable cheat-sheet** 📄 for revision!
