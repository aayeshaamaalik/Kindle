# Kindle eBook Reader System

This project is an object-oriented design (OOD) implementation of a simplified **Kindle eBook Reader System**. It supports reading digital books in various formats (`PDF`, `MOBI`, `EPUB`) and demonstrates three core factory design patterns: **Simple Factory**, **Factory Method**, and **Abstract Factory**.

**Design Reference:**  
This system is inspired by the [Kindle OOD design from ycwkatie's OOD repo](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/kindle.md).

---

## Key Components and Interacting Objects

| Component                | Responsibility                                                                            |
|--------------------------|--------------------------------------------------------------------------------------------|
| `Book`                   | Represents an eBook with title and file format                                            |
| `Format` (enum)          | Identifies supported formats: `PDF`, `MOBI`, `EPUB`                                       |
| `Reader` (interface)     | Defines the interface for reading eBooks                                                  |
| `PDFReader`, `MOBIReader`, `EPUBReader` | Concrete readers that implement the `Reader` interface for each format        |
| `SimpleReaderFactory`    | A static class that returns a `Reader` based on format using conditional logic            |
| `KindleReader`           | Abstract class in the Factory Method pattern; subclasses override reader creation logic   |
| `ReaderFactory` (interface) | Interface in Abstract Factory pattern to create format-specific reader objects         |
| `PDFReaderFactory`, etc. | Implementations of `ReaderFactory`, each producing a specific format reader               |
| `SimpleKindle`, `AbstractKindle` | Clients that use the respective factory patterns to read books                    |

---

## User Action Flow

The Kindle Reader System enables users to upload, read, and manage books based on file format. The core action modeled here is reading a book, and the flow differs depending on which factory pattern is used.

### Pattern 1: Simple Factory
1. User provides the book and format.
2. `SimpleReaderFactory` selects the correct `Reader` using a `switch` statement.
3. `SimpleKindle` uses the reader to display the book.

### Pattern 2: Factory Method
1. Subclasses of `KindleReader` implement `createReader()` for specific formats.
2. The base class handles the reading flow, and subclass decides the reader.

### Pattern 3: Abstract Factory
1. A `ReaderFactory` (e.g., `PDFReaderFactory`) is injected into `AbstractKindle`.
2. The factory creates the appropriate reader for the given book.
3. The reader displays the content.

---

## Getting Started

To set up and run this project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/kindle-factory-patterns.git
   ```

2. Navigate to the project directory:
   ```bash
   cd kindle-factory-patterns
   ```

3. Compile all source files:
   ```bash
   javac common/*.java simplefactory/*.java factorymethod/*.java abstractfactory/*.java Main.java
   ```

4. Run the demo:
   ```bash
   java Main
   ```

---

## Usage

Each variant of the Kindle class can be used independently to read books in different formats:

```java
// Using Simple Factory
SimpleKindle simple = new SimpleKindle();
simple.readBook("Sapiens", Format.PDF);

// Using Factory Method
KindleReader reader = new MOBIKindleReader();
reader.readBook("Harry Potter");

// Using Abstract Factory
ReaderFactory factory = new EPUBReaderFactory();
AbstractKindle kindle = new AbstractKindle(factory);
kindle.readBook("1984");
```

---

## Project Structure

| Package             | Description                                                       |
|---------------------|-------------------------------------------------------------------|
| `common`            | Shared classes and interfaces (`Book`, `Format`, `Reader`)        |
| `simplefactory`     | Implementation of Simple Factory pattern                          |
| `factorymethod`     | Implementation of Factory Method pattern                          |
| `abstractfactory`   | Implementation of Abstract Factory pattern                        |

---

## Factory Pattern Comparison

| Feature                     | Simple Factory | Factory Method | Abstract Factory |
|-----------------------------|----------------|----------------|------------------|
| Centralized Logic           | ✅              | ❌              | ❌                |
| Extensibility               | ❌              | ✅              | ✅                |
| Adheres to OCP              | ❌              | ✅              | ✅                |
| Supports Product Families   | ❌              | ❌              | ✅                |
| Easiest to Implement        | ✅              | ✅              | ⚠️ Slightly more verbose |

