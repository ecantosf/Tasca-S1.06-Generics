# Generics Exercises 

## Description
In this task, we will delve into one of the most powerful and flexible concepts in 
the Java language: Generics.

Generics allow us to write more reusable, safe, and clean code, avoiding manual type 
conversions and reducing runtime errors.

You will work with generic classes and methods, learn how to constrain generics using 
interfaces or superclasses, and put into practice the use of varargs and bounded types. 
All the exercises are designed to help you understand the power of this functionality 
in real-world scenarios.
  
## Exercise Statement
Level 1: In this level, you will be introduced to the fundamental concepts of generics. 
You will learn to create classes and methods that work with any data type, and observe 
how Java manages flexible yet safe typing. Through interfaces or superclasses, you will 
put into practice the use of varargs and bounded types. All exercises are designed to 
help you understand the power of this feature in real-world scenarios.

## 📋 Exercise 1: Non-Generic Class

### Objective
Implement a class that stores three arguments of the same type **without using generics**, 
demonstrating the limitations of type restriction.

### Implementation
- **`NoGenericMethods`**: Class with three String fields
- **Constructor**: Accepts three parameters in any order
- **Getters**: `getElement1()`, `getElement2()`, `getElement3()`

### Key Demonstration
The class shows that:
- ✅ Arguments can be passed to the constructor in **any order**
- ✅ Values are stored based on parameter position, not content
- ❌ **Limitation**: The class only works with `String` type

## 📋 Exercise 2: Generic Methods

### Objective
Implement a generic method that can accept three arguments of any type and in any 
combination, demonstrating the flexibility and type safety of generics.

### Implementation
- **`GenericMethods`**: Class containing generic methods
- **`printElements<T, U, V>`**: Generic method that accepts three parameters of 
potentially different types
- **`Type Parameters:`**: <T, U, V> represent three independent type parameters
- **`flexibility`**: Each parameter can be of any reference type

### Key Features Demonstrated
- ✅ Type Flexibility: Accepts any combination of reference types
- ✅ Order Independence: Parameters can be passed in any order
- ✅ Type Safety: No casting required, compile-time type checking
- ✅ Null Handling: Can accept null values safely
- ✅ Mixed Types: Different parameters can have different types

Level 2: This level focuses on refining the use of generics, learning to combine generic 
parameters with concrete types, and safely using varargs with generics.

## 📋 Exercise 1 Testing
- Created MainN2 class for Level 2 exercises
- Fixed object instantiation syntax (new keyword)
- Tested GenericMethodsPartial with Person, String and fixed String
- Demonstrated mixed generic/fixed parameter usage

## 📋 Exercise 2: Generic Varargs Methods

### Objective
Implement a generic method using varargs (variable arguments) to understand the flexibility 
and type safety considerations when working with generic variable-length parameters.

### Implementation
- **`GenericMethodsVarargs.java`**: Contains the `printAll()` method with generic varargs
- **Method signature**: `public <T> void printAll(T... elements)`
- **Features**: Accepts any number of arguments of the same generic type

### Key Demonstrations

#### Flexibility with Argument Count:
- **Zero arguments**: `printAll()`
- **Single argument**: `printAll("Single")`
- **Multiple arguments**: `printAll("A", "B", "C")`
- **Array as varargs**: `printAll(stringArray)`

#### Type Consistency:
- All arguments must be of the same type `T`
- Works with Strings, Integers, custom objects (ChemicalElement)
- Mixed types infer to `Object` (with compiler warnings)

Level 3: IIn this level, you will combine advanced generics with interfaces, bounded 
types, and polymorphism. You will simulate a real-world example with devices that can 
make calls and take photos.

### Structural Refactoring
- Renamed package from `generics.n1` to `generics.n12`
- Renamed `Main.java` to `MainN1.java` (Level 1 specific)
- Created `MainN2.java` skeleton for Level 2 exercises
- All Level 1 exercises remain functional
- Ready for Level 2 implementation

## Features
- Combine generic objects with specific types, including constraints with interfaces 
or classes.
- Use generic varargs and explore their implications.
- Apply constraints (bounded types) to control which type of objects can be passed 
to a generic method.
- Strengthen the relationship between generics, interfaces, and polymorphism.e.

## Technologies
- Language: Java
- IDE: IntelliJ IDEA
- Build Tool: Maven/Gradle (if applicable)
- Version Control: Git

## Installation and Execution
1. Create GitHub repository
2. Open the project in IntelliJ IDEA.
3. Configure JDK (Java 21 or later recommended).
4. Run the main class of each exercise directly from the IDE.
5. To run tests (if applicable)

## Demo
No aplicable.

## Diagrams and Technical Decisions
No aplicable.
