Constructor -It is a special method that call automatically when an object of a class is created. 
            --It is used to initialize the object.
            -- The constructor name must be the same as the class name and it does not have a return type, not even void.

            -- If no constructor is defined in a class, Java provides a default constructor.

Method        --A method is function inside a class that performs a specific task.
            -- It can take parameters and return a value.
            -- Methods are used to define the behavior of an object.

---

### 🔑 What Are Access Specifiers?

Access Specifiers **control who can see or use something** in your Java program—like who is allowed to enter different rooms in a house.

---

### 💡 1. `public` → "Everyone is welcome"

* **Meaning**: Anyone, from anywhere, can use it.
* **Example**: Like a public park—open for everyone, anytime.

---

### 💡 2. `private` → "Only I can use it"

* **Meaning**: Only the same class can use it.
* **Example**: Your personal diary—only you can open and read it. No one else is allowed.

---

### 💡 3. `protected` → "Family can use it"

* **Meaning**: Can be used in the same package and also by subclasses (even if they're in different packages).
* **Example**: A family WhatsApp group—family members (even from other cities) can see and use it.

---

### 💡 4. *Default* (no keyword) → "Only neighbors can use"

* **Meaning**: Accessible only within the same package.
* **Example**: Your colony’s community hall—only people living in your area (package) can enter.

---

### 🌼 Easy Summary Table:

| Keyword     | Who Can Use It?                          | Example in Real Life              |
| ----------- | ---------------------------------------- | --------------------------------- |
| `public`    | Everyone, everywhere                     | Public park 🏞️                   |
| `private`   | Only within the same class               | Personal diary 📓                 |
| `protected` | Same package + subclasses (even outside) | Family WhatsApp group 👨‍👩‍👧‍👦 |
| *default*   | Only within the same package             | Local community hall 🏘️          |

---




❓ 2. Main ke bahar method bana sakte hain kya?

➡️ Haan 100% bana sakte ho!
Bas yaad rakhna: method ko class ke andar hona zaroori hai, lekin main() ke andar nahi.
✅ Correct Example:

public class Test {
    void sayHello() {
        System.out.println("Hello Annt!");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.sayHello();  // ✅ method call
    }
}

🛑 Method sayHello() main ke bahar hai, lekin class ke andar hai ✅
❌ Incorrect Example:

public class Test {
    public static void main(String[] args) {
        void sayHello() {  // ❌ Illegal: method inside main is not allowed
            System.out.println("Hello");
        }
    }
}