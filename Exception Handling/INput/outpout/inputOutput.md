Stream class is partof java.io.package and is used to handle input and output operations in Java. It provides a way to read and write data to various sources like files, network connections, or memory.

 Java Stream Classes
    ---Byte Stream Classes
    represented by class that extends InputStream and OutputStream.work with raw binary data.
            ---Input Stream Classes
            reads bytes from a source, such as a file or network connection.
            
            ---Output Stream Classes
            writes bytes to a destination, such as a file or network connection.

    ---Character Stream Classes
            ---Reader Classes
            
            ---Writer Classes




            | Stream Type      | Class Type | For Reading           | For Writing            |
| ---------------- | ---------- | --------------------- | ---------------------- |
| Byte Stream      | Abstract   | `InputStream`         | `OutputStream`         |
|                  | Concrete   | `FileInputStream`     | `FileOutputStream`     |
|                  | Buffered   | `BufferedInputStream` | `BufferedOutputStream` |
| Character Stream | Abstract   | `Reader`              | `Writer`               |
|                  | Concrete   | `FileReader`          | `FileWriter`           |
|                  | Buffered   | `BufferedReader`      | `BufferedWriter`       |
