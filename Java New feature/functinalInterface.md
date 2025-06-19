A functional interface contain only one abstract class
 
 A lambda expression is used in java 8+ to make more readable clear consise java code

  A functional interface is an interface that contains only one abstract method. It can have multiple default

lambda expression ko use karne ke liye ek hi abstarct class ka help chahiye that to fucntional interface use hua
ex-
  inteface-Runnable    Abstact method=run()         purpose-use in thread
  inteface-Callable    Abstract method=call()       purpose-return a value from thread

Aww meri Annt 💛 I’m sooo glad you asked! Let's go **line by line** and understand everything like a story — no confusion, no tension 🌈

---

## 🌟 Java Functional Interface + Lambda — Full Code Explained

```java
@FunctionalInterface
interface Hello {
    void sayHello(); // Only one abstract method
}
```

### 🤓 What’s this?

#### 🟡 `interface Hello`

* Think of `interface` as a **rule book** or **contract**.
* It says: “Whoever uses me must define this method: `sayHello()`.”

#### 🟡 `@FunctionalInterface`

* This is a special Java **annotation**.
* It tells Java: “This interface must have **ONLY ONE** abstract method.”
* Only then can we use **Lambda Expression** with it.

---

```java
public class SimpleLambdaDemo {
```

### 💡 What’s this?

* This is your **main class** — where the Java program runs.
* Java needs at least **one class** to run anything.

---

```java
public static void main(String[] args) {
```

### 🎬 What’s this?

* This is the **starting point** of your program.
* When you run your code, Java looks for `main()` and starts from here.

---

```java
Hello oldWay = new Hello() {
    public void sayHello() {
        System.out.println("👵 Old Way: Hello Annt from Anonymous Class!");
    }
};
oldWay.sayHello();
```

### 👵 OLD WAY Explanation:

* `Hello oldWay = new Hello() {...}`
  ➤ We are **creating an object** of the interface using **anonymous class**.
  ➤ Normally, interfaces can’t be directly used — you have to define the method.
  ➤ So here, we define `sayHello()` manually.

* `System.out.println(...)`
  ➤ It prints a message to the console.

* `oldWay.sayHello();`
  ➤ This calls the method and prints the output.

---

```java
Hello newWay = () -> System.out.println("✨ New Way: Hello Annt from Lambda Expression!");
newWay.sayHello();
```

### ✨ NEW WAY: Lambda Expression

#### 🧁 Let’s break this down:

* `Hello newWay = (...) -> { ... };`
  ➤ This is called a **lambda expression**.

* `()` means: No input parameters.

* `->` means: “does this action.”

* `System.out.println(...)` is the **action** that will happen when `sayHello()` is called.

* `newWay.sayHello();`
  ➤ It runs the lambda and prints the message.

---

## 🎨 So in short:

| Part                   | Meaning                                          |
| ---------------------- | ------------------------------------------------ |
| `interface`            | A rule book with method definitions only.        |
| `@FunctionalInterface` | Tells Java: only 1 abstract method allowed here. |
| `anonymous class`      | Old, longer way to write code for interface.     |
| `lambda expression`    | New, short way to write same thing using `->`.   |
| `System.out.println()` | Prints message to screen.                        |

---

## 📦 Think of `interface` like this:

A **TV Remote Interface** says:

> “Any remote must have one button: `power()`.”

Now YOU create a remote and define how `power()` works (e.g., show on TV, or blink light).
That’s the same with Java interfaces. You decide **what happens inside**.

---

Do you want me to make this into a **cute hand-drawn note** with all diagrams and colors?
Say the word, meri coding star ⭐ and I’ll do it!
