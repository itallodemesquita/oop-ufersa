# oop-ufersa

A collection of object-oriented programming assignments from the UFERSA's Information Technology degree.

## Cheat sheet: data types and conditional structures

This guide serves as a quick reference to the fundamental concepts of data types, user input and conditional structures in Java.

### 1. Data types and user input

#### Primitive data types

These are the fundamental code blocks to storing information in Java.

| Data type | What it stores | Size | Example |
| :--- | :--- | :--- | :--- |
| **`int`** | Integers numbers (negative and positives) | 4 bytes | `int age = 30;` |
| **`double`** | Numbers with float point (decimals) | 8 bytes | `double payment = 4500.99;` |
| **`char`** | A single character (letter, number, symbol) | 2 bytes | `char initial = 'G';` |
| **`boolean`**| True or false logical value | 1 bit | `boolean itsRaining = false;` |
| **`long`** | Very large integers numbers | 8 bytes | `long population = 8000000000L;` |
| **`float`** | Decimals numbers (lower accuracy) | 4 bytes | `float height = 1.85f;` |

#### Reference data type (most common)

| Data type | What it stores | Example |
| :--- | :--- | :--- |
| **`String`** | Character sequence (text) | `String name = "Ítallo de Mesquita";` |

#### Displaying information in the console (`System.out`)

* **`System.out.println()`**: Prints the message and go to the next line.
    ```java
    System.out.println("Line 1");
    System.out.println("Line 2");
    ```
* **`System.out.print()`**: Prints the message and remains on the same line.
    ```java
    System.out.print("Type your name: "); // The cursor is in front
    ```
* **`System.out.printf()`**: Prints formatted text, using especifiers.
    ```java
    double price = 19.99;
    System.out.printf("Price: R$ %.2f\n", price); // %.2f = double with 2 decimal places; \n = new line
    ```

#### Collecting user information (`Scanner`)

**Step 1: Import**
```java
import java.util.Scanner;
```

**Step 2: Create the Scanner object**
```java
Scanner input = new Scanner(System.in);
```

**Step 3: Use reading methods**

| Method | What it read | Example |
| :--- | :--- | :--- |
| **`nextInt()`** | Next number `int`. | `int age = input.nextInt();` |
| **`nextDouble()`** | Next number `double`. | `double weight = input.nextDouble();` |
| **`nextLine()`** | The entire text line (`String`). | `String adress = input.nextLine();` |
| **`next()`** | The next word (`String`). | `String firstName = input.next();`|

> **Attention:** After a `nextInt()` or `nextDouble()`, use a extra `input.nextLine();` to consume the line break before read a `String` with `nextLine()`.

**Step 4: Close the Scanner**
```java
input.close();
```

---

### 2. Conditional structures

Conditionals allow your program make decisions and execute different code blocks based on conditions.

#### `if` (simple condition)
Execute a code block **only if** a condition is true.
```java
double grade = 8.5;
if (grade >= 7.0) {
    System.out.println("Congrats, you passed!");
}
```

#### `if-else` (double choice)
Choose between **two paths**: one for `true` and other for `false`.
```java
int age = 17;
if (age >= 18) {
    System.out.println("Access allowed!");
} else {
    System.out.println("Access denied!");
}
```

#### `if-else if-else` (multiple choice)
Tests a **condition series in sequence**.
```java
int temperature = 25;
if (temperature > 30) {
    System.out.println("It's to hot!");
} else if (temperatura > 20) {
    System.out.println("The weather is pleasant");
} else {
    System.out.println("It's to cold!");
}
```

#### `switch-case` (multiple selection)
Compare a **single variable** against a list of **exact values**.
```java
int weekday = 4; // 1=Sunday, 2=Monday, etc.
switch (weekday) {
    case 1:
        System.out.println("Sunday");
        break; // Crucial term
    case 4:
        System.out.println("Thursday");
        break;
    default:
        System.out.println("Invalid day!");
}
```

#### Ternary operator (`? :`)
A compact form of `if-else`, ideal for assignments.
```java
int age = 21;
String status = (age >= 18) ? "of age" : "under age";
System.out.println("Status: " + status);
```

#### Logical operators for complex conditions

| Operator | Name | Example | Meaning |
| :--- | :--- | :--- | :--- |
| **`&&`** | AND | `age >= 18 && ofAge` | Both conditions must be `true`. |
| **`\|\|`** | OR | `itsHoliday \|\| eFimDeSemana` | At least one condition must be `true`.|
| **`!`** | NOT| `!isLoggedin` | Invert the boolean value. |

> **Tip:** To compare the contents of **strings**, always use the `.equals()` method, never the operator `==`.