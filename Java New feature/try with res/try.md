🌟 What is Try-with-Resources in Java?
💬 Simple Words:

    It is a special try block used to automatically close resources like files, readers, writers, etc.

❓ Why we need it?

Normally, we do this:

FileReader fr = new FileReader("file.txt");
// do something
fr.close();  // 👈 must remember to close

But if exception happens — close() may not run ❌
So Java gave us try-with-resources to automatically close such resources even if error occurs! 🧠💡
✅ Conditions:

    Only works with classes that implement AutoCloseable (like FileReader, FileWriter, etc.)

    Resource must be created inside the try() brackets