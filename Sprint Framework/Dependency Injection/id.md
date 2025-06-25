Insted of creating class from its own they arey inecting it to class from outside


## 💡 What is Dependency Injection in Java?

**Dependency Injection** means:

> Instead of a class *creating* its own dependencies, they are **given (injected)** to the class from outside.

In simple words:

🗣️ "**Don’t make it yourself — let someone give it to you.**"

---

### 🧃 Real-Life Example

Suppose you love tea (chai ☕):

* You could **make** it yourself (tight coupling 😓)
* Or someone **gives** it to you ready-made (dependency injection 😍)

Tea is your dependency, and you *receive* it — that’s DI!

---

## 🔧 Why Use Dependency Injection?

✅ Loose Coupling (less dependent code)
✅ Easier to test (you can mock dependencies)
✅ Follows good design principles (SOLID – the D = Dependency Inversion Principle)

---

## 💻 Simple Java Example (Without Spring)

### ❌ Without Dependency Injection

```java
class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

class Car {
    Engine engine = new Engine();  // Tight coupling ❌

    void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}
```

---

### ✅ With Dependency Injection

```java
class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

class Car {
    Engine engine;  // Dependency declared

    // Constructor Injection
    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}
```

Now, the `Car` doesn’t create the `Engine` — it gets it from outside (injected).


## 🌿 Dependency Injection in Spring Boot

Spring Boot makes DI **very easy** using annotations:

```java
@Component
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

@Component
class Car {
    @Autowired
    Engine engine;  // Spring injects this automatically!

    void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}
```

`@Autowired` = Automatically inject the dependency 💫
`@Component` = Let Spring manage the object

---

## 📝 Exam-Friendly Definition

> **Dependency Injection (DI)** is a design pattern where an object receives its dependencies from an external source rather than creating them itself.
> It helps achieve **loose coupling**, improves testability, and makes code more flexible.
> In Spring Boot, DI is implemented using annotations like `@Autowired` and `@Component`.

---

