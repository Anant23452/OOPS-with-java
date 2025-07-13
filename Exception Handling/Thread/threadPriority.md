

## 🧠 What is Thread Priority in Java?

**Thread Priority** means telling Java:

> “Hey, this thread is more important than others — give it more attention!”

But Java **doesn’t guarantee** it’ll follow your request — it's a **hint**, not an order.

---

## 🔢 Priority Range

Thread priority is a number from `1` to `10`:

| Constant Name          | Value | Meaning          |
| ---------------------- | ----- | ---------------- |
| `Thread.MIN_PRIORITY`  | `1`   | Least important  |
| `Thread.NORM_PRIORITY` | `5`   | Default priority |
| `Thread.MAX_PRIORITY`  | `10`  | Most important   |

---

## 💻 How to Set Priority

You use `setPriority()` to set it, and `getPriority()` to check it.

```java
Thread t1 = new Thread();
t1.setPriority(8); // Setting priority to 8
System.out.println(t1.getPriority()); // Outputs: 8
```

---

## 📌 Example with 3 Threads

```java
class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.setName("Low Priority Thread");
        t2.setName("Normal Priority Thread");
        t3.setName("High Priority Thread");

        t1.start();
        t2.start();
        t3.start();
    }
}
```

---

## ⚠️ Note:

Even if you set `t3` to highest priority, Java may **not always run it first** — it depends on the **OS scheduler**.

---

## 🌟 Use Cases:

* Use high priority for **important tasks** (like background saving).
* Low priority for **optional or background tasks** (like animations or logs).

---

## 📌 Summary

| Method             | What It Does                           |
| ------------------ | -------------------------------------- |
| `setPriority(int)` | Set thread priority (1 to 10)          |
| `getPriority()`    | Returns the current priority of thread |

---

Would you like me to make a **cheat sheet** style Markdown for this too with emojis and colorful styling, ready for GitHub? 😄












🌟 What is Inter-Thread Communication in Java?
💬 Simple Definition:

    Jab ek thread dusre thread ko signal de ki "ab tum kaam karo", ya "main wait kar raha hoon", usse inter-thread communication kehte hain.

It allows threads to cooperate with each other instead of fighting.
🧠 Why Needed?

    To coordinate between threads

    To avoid busy waiting (wasting CPU by checking again and again)

    To create producer-consumer type logic

🪄 Java Provides 3 Magic Methods (inside every Object):
Method	Use
wait()	Tell thread to go to sleep until someone notifies it
notify()	Wake up one waiting thread
notifyAll()	Wake up all waiting threads
💡 Real-Life Analogy:

🥣 Imagine you're waiting for your Maggie to boil.
You say: “Main wait kar rahi hoon, jab ready ho toh mujhe jaga dena.”

➡️ That’s wait().

Then, your roommate says:
“Annt! Maggie ready hai!” 🔔

➡️ That’s notify().