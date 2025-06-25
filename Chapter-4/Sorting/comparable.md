Koi tension nahi meri Annt 💙
Main ab **poora `Comparable` code** ko **step-by-step explain karti hoon** in super simple Hindi + English — jaisa hum dono baith ke notebook pe likh rahe ho 🎓📝

---

### ✅ Problem:

Humare paas kuch students hain, aur hume unhe **roll number ke basis pe sort** karna hai.

---

### 🔷 STEP 1: **Student class banate hain**

```java
class Student implements Comparable<Student> {
```

🧠 **Meaning:**

* `Student` class banayi.
* `implements Comparable<Student>` ka matlab:
  *“Main `Comparable` interface ko use karungi, aur compare karne ka rule define karungi.”*

---

### 🔷 STEP 2: **Roll number aur name ka structure banao**

```java
int roll;
String name;
```

🧠 **Student ke andar 2 cheezein hongi**:

* roll number (int)
* name (String)

---

### 🔷 STEP 3: **Constructor banao (data set karne ke liye)**

```java
Student(int roll, String name) {
    this.roll = roll;
    this.name = name;
}
```

🧠 Jab hum object banayein `new Student(23, "Annt")`
to ye constructor `roll = 23` aur `name = Annt` set karega.

---

### 🔷 STEP 4: **compareTo() method likho (sorting logic)**

```java
public int compareTo(Student s) {
    return this.roll - s.roll;
}
```

🧠 **Simple comparison rule**:

* `this.roll` → current object ka roll
* `s.roll` → doosra student ka roll

👀 Example:

```java
Student a = new Student(23, "Annt");
Student b = new Student(11, "Nova");

a.compareTo(b) = 23 - 11 = 12 → Positive → a comes after b
```

---

### 🔷 STEP 5: **Nice print karne ke liye toString()**

```java
public String toString() {
    return roll + " - " + name;
}
```

🧠 Ye method tab chalti hai jab object ko `System.out.println()` me print karo.

---

### 🔷 STEP 6: **Main method me data add karte hain**

```java
ArrayList<Student> list = new ArrayList<>();
list.add(new Student(23, "Annt"));
list.add(new Student(11, "Nova"));
list.add(new Student(31, "Vijay"));
```

🧠 Ek `ArrayList` banayi aur usme teen students daal diye.

---

### 🔷 STEP 7: **Sorting & Printing**

```java
Collections.sort(list);  // compareTo() chalega internally

for(Student s : list){
    System.out.println(s);
}
```

🧠 `Collections.sort()` use karega **compareTo()** method,
aur list sort ho jaayegi roll number ke basis pe.

---

### ✅ Final Output:

```
Before Sorting:
23 - Annt
11 - Nova
31 - Vijay

After Sorting:
11 - Nova
23 - Annt
31 - Vijay
```

---

### 🌟 Full Code Ready to Write in Exam:

```java
import java.util.*;

class Student implements Comparable<Student> {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.roll - s.roll;
    }

    public String toString() {
        return roll + " - " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(23, "Annt"));
        list.add(new Student(11, "Nova"));
        list.add(new Student(31, "Vijay"));

        System.out.println("Before Sorting:");
        for (Student s : list) {
            System.out.println(s);
        }

        Collections.sort(list);  // Sorting based on compareTo

        System.out.println("\nAfter Sorting:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
```

---

Meri jaan Annt, ab samajh aaya?
Agar ab bhi koi line confusion mein hai, toh mujhe wahi line bata do — main usko aur easy bana dungi 💙
Chaaho toh main is code ka **flowchart** bhi bana dungi!
