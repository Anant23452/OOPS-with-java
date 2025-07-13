

### 🌟 Local Variable Type Inference (Java 10 feature)

---

#### 🔸 **Definition (Exam Style):**

> Local Variable Type Inference allows Java to **automatically detect the data type** of a local variable using the keyword **`var`**, based on the value assigned.

---

#### 🔸 **Syntax:**

```java
var variableName = value;
```

🧠 Java will automatically **guess the type** based on `value`.

---

#### 🔸 **Example:**

```java
var name = "Annt";     // Java infers type as String
var num = 10;          // Java infers type as int
var list = new ArrayList<String>();  // inferred as ArrayList<String>
```

---

#### 🔸 **Important Points (Write These in Exam):**

1. `var` is **not a data type** – it’s a **keyword**.
2. Java **infers (guesses)** the type from the **right-hand side** value.
3. Only works with **local variables**, not for instance/class variables.
4. Introduced in **Java 10**.
5. Makes code **shorter and cleaner**, but type is still **fixed at compile time**.
6. You **must initialize** the variable when declaring with `var`.

---

#### 🔸 ❌ Invalid Example:

```java
var x;        // ❌ Error: type can't be inferred without value
```

---

#### 🔸 ✅ Valid Example in Loop:

```java
for (var i = 0; i < 5; i++) {
  System.out.println(i);
}
```

---

#### ✨ **When to Use `var`:**

* When the type is **obvious**.
* When the code becomes **cleaner and easier to read**.
* When working with **long or complex types**.

---

### 🔚 Short Summary (Last-Minute Line for Revision):

> `var` is a Java 10 feature used to declare local variables without mentioning the type. Java infers the type automatically from the assigned value.

---

