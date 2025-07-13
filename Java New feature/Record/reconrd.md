| Feature       | Record Class           | Sealed Class                   |
| ------------- | ---------------------- | ------------------------------ |
| Introduced in | Java 14                | Java 15                        |
| Purpose       | Hold data only         | Control who can extend a class |
| Keyword       | `record`               | `sealed`, `permits`            |
| Auto methods  | Yes (`toString`, etc.) | No                             |
| Use case      | DTOs, APIs, Configs    | Secure Inheritance Tree        |
