# Java Encapsulation Example

A small Java program that demonstrates **encapsulation**: a field is kept `private` and accessed only through public getter and setter methods.

## What It Demonstrates

```java
class Encapsulation {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int newA) {
        this.a = newA;
    }
}
```

- The field `a` is `private`, so other classes cannot read or change it directly
- `setA()` changes the value and `getA()` reads it
- `this.a` refers to the field, not to the parameter

## How It Works

1. `main` creates an `Encapsulation` object.
2. `obj.setA(10)` stores the value 10.
3. `obj.getA()` returns it for printing.

`obj.a = 10` would not compile outside the class, because `a` is private.

## Output

```
Value of a: 10
```

## Why Use Encapsulation

- Protects data from unwanted changes
- Lets you add validation later, for example rejecting negative values in `setA`
- Lets you change the internal implementation without changing the code that uses the class

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac DemoEncapsulation.java
java DemoEncapsulation
```

## Project Structure

```
.
├── DemoEncapsulation.java
└── README.md
```

## Next Steps

- Add validation inside `setA`
- Add more private fields with their own getters and setters
- Add a constructor that sets the initial value
