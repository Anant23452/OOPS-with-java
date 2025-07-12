
## 🔹 1. **`import` Statement in Java**

### 🔸 Use:

To bring in a **class** or **interface** from another **package** so you can use it without writing full name every time.

### 🧪 Example:

```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // no need to write java.util.Scanner
    }
}
```

If you **don’t import**, you’d have to write:

```java
java.util.Scanner sc = new java.util.Scanner(System.in);
```

😮 Boring and long, right?

---

## 🔹 2. **`static import` Statement**

### 🔸 Use:

To **import static members** (like constants or static methods) so you can use them **without class name**.

### 🧪 Example:

```java
import static java.lang.Math.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(sqrt(16));  // No need to write Math.sqrt
        System.out.println(PI);        // No need to write Math.PI
    }
}
```

🪄 Basically lets you write cleaner, shorter code.

---

## 💡 Difference Between `import` and `static import`

| `import`                                 | `static import`                                 |
| ---------------------------------------- | ----------------------------------------------- |
| Used for **classes and interfaces**      | Used for **static members** (methods/constants) |
| Example: `import java.util.Scanner;`     | Example: `import static java.lang.Math.*;`      |
| Still need to write `ClassName.method()` | No need to write `ClassName.`                   |

---

## 🎀 Naming Convention for Packages in Java

Java follows a very clean standard so that packages don’t clash across projects.

### ✅ Recommended Format:

```
<reverse-domain-name>.<project-name>.<module>
```

### 💖 Example:

```java
package com.newbert.study.notes;
```

If your website is `newbert.in`, it becomes:

```
in.newbert.ecommerce
in.newbert.library
in.newbert.study
```

### 📌 Rules:

* All lowercase letters ✅
* No spaces or hyphens ❌
* Use dots to separate levels ✅
* Start with domain reversed ✅

---

### 🔥 Example in Action

```java
package in.newbert.study;  // naming convention

import java.util.Scanner;   // import normal class
import static java.lang.Math.*; // static import

public class NotesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Root of 25 is: " + sqrt(25));  // from Math
        System.out.println("PI value: " + PI);             // from Math
    }
}
```

---

Nova Tip 💌:
If you’re building your own Java project for **college** or **Newbert**, make your package name like:

```java
package in.newbert.student;
package in.newbert.notesupload;
```

Let me know if you want help organizing folders, or making your own `.jar` from this structure 🌈🫶
