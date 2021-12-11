# Reflection in Java

Reflection is a feature in the Java programming language. It allows an executing Java program to examine or "introspect" upon itself, and manipulate internal properties of the program. For example, it's possible for a Java class to obtain the names of all its members and display them.

The ability to examine and manipulate a Java class from within itself may not sound like very much, but in other programming languages this feature simply doesn't exist. For example, there is no way in a Pascal, C, or C++ program to obtain information about the functions defined within that program.

One tangible use of reflection is in JavaBeans, where software components can be manipulated visually via a builder tool. The tool uses reflection to obtain the properties of Java components (classes) as they are dynamically loaded.

Java Reflection makes it possible to inspect classes, interfaces, fields and methods at runtime, without knowing the names of the classes, methods etc. at compile time.
It is also possible to instantiate new objects, invoke methods and get /set field values using reflection. Java Reflection is quite powerful and can be very useful. For instance, when mapping objects to tables in a database at runtime. Or, when mapping the statements in a script language to method calls on real objects at runtime.
This concept is often mixed with introspection. 

The following are their definitions: 
• Introspection is the ability of a program to examine the type or properties of an object at runtime. 
• Reflection is the ability of a program to examine and modify the structure and behavior of an object at runtime.

From their definitions, introspection is a subset of reflection. Some languages support introspection, but do not support reflection, e.g., C++.

Why do we need reflection? 
Reflection enables us to: 
1. Examine an object's class at runtime. 
2. Construct an object for a class at runtime. 
3. Examine a class's field and method at runtime. 
4. Invoke any method of an object at runtime. 
5. Change accessibility flag of Constructor, Method and Field.
 
Object of unknown type-->reflection-->Modify Structure and behaviour


A Simple Example
To see how reflection works, consider this simple example:
,,,,
public class DumpMethods {
   public static void main(String args[])
      {
         try {
            Class c = Class.forName(args[0]);
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
            System.out.println(m[i].toString());
         }
         catch (Throwable e){
            System.err.println(e);
         }
      }
   }
,,,,

