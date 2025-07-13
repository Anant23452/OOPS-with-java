

## ✅ **Method 1: Extending the `Thread` class**

```java
class MyThread extends Thread {
```

🔸 `class MyThread` – You're creating your own class named `MyThread`.

🔸 `extends Thread` – You are saying **MyThread is a Thread**, so it can run code in parallel.

---

```java
    public void run() {
```

🔸 This is the special method that contains the **code that will run in the thread**.
Java calls this method automatically when you use `.start()`.

---

```java
        System.out.println("Thread is running...");
```

🔸 This prints a message to show the thread is working.
It’s your actual task running inside the thread.

---

```java
    }
```

🔸 Closing the `run()` method.

---

```java
    public static void main(String[] args) {
```

🔸 This is the main method where your program starts.
Java looks here first.

---

```java
        MyThread t1 = new MyThread();
```

🔸 You created an object `t1` from your `MyThread` class.

---

```java
        t1.start();
```

🔸 🚨 This is important: You are **starting the thread**.

👉 It will call the `run()` method in a **new thread** — not in the main one.

> ❌ If you wrote `t1.run();` it would just run normally (not as a separate thread).

---

```java
    }
}
```

🔸 Closing the main method and class.

---

## ✅ **Method 2: Implementing the `Runnable` interface**

```java
class MyRunnable implements Runnable {
```

🔸 You are saying **MyRunnable will follow the rules of the Runnable interface**.

🔸 Runnable is like a contract that **forces you to write a `run()` method**, where your thread logic lives.

---

```java
    public void run() {
```

🔸 This is the method where you write the task to be done in the thread.
Java will run this method **when the thread starts**.

---

```java
        System.out.println("Runnable thread is running...");
```

🔸 Print a message to show the thread is active.

---

```java
    }
```

🔸 Closing the `run()` method.

---

```java
    public static void main(String[] args) {
```

🔸 Entry point of the program.

---

```java
        MyRunnable obj = new MyRunnable();
```

🔸 Create an object of your Runnable class.

---

```java
        Thread t1 = new Thread(obj);
```

🔸 You pass your `obj` (that has the `run()` method) to a **Thread constructor**.

🔸 Now the `t1` thread knows what to do when it starts (it will call `obj.run()`).

---

```java
        t1.start();
```

🔸 Start the thread — it will run the `run()` method from your `MyRunnable` class.

---

```java
    }
}
```

🔸 Closing main and class.

---

## 👀 Side-by-side Comparison:

| Feature         | `extends Thread`                  | `implements Runnable`           |
| --------------- | --------------------------------- | ------------------------------- |
| Inheritance     | Can’t extend another class        | Can extend any other class      |
| Flexibility     | Less flexible                     | More flexible                   |
| Code Separation | Task logic & thread in same class | Task logic separate from Thread |

---

If you want, I can also explain how `Thread.sleep()`, `join()`, and multiple threads work together. Or I can give you a cool demo using both styles together 🚀

Would you like a **practical example** (like countdown timer, typing race, or traffic light simulator using threads)?



