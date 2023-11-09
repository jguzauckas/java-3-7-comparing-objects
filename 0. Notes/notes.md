# Comparing Objects

Just like we can compare primitive values either by relational operators (`==`, `<`, `<=`, etc.) or by logical operators (`!`, `&&`, `||`), we can consider comparing objects to each other as well. Just like there were some considerations with the idea of storing objects in variables by reference as opposed to directly, we can consider two different ways to compare objects: by their references or directly to each other.

---

## Reference Comparisons

When comparing two object variables, the computer will want to compare their references, since that is what the variable's store. As a starting point, when two variables hold the same object reference (they are pointing to the exact same object in memory, or in our previous analogies, they hold the same address, which points to the same house), they are considered **aliases** for that object.

We can use our basic relational operators `==` and `!=` to determine if two variables are aliases of the same objects. Here is an example with `Person` objects from the `NotesAliases1.java` file:

```java
Person person1 = new Person(25, "Mr.", "G");
Person person2 = new Person(25, "Mr.", "G");
Person person3 = person1;

System.out.println(person1 == person2);
System.out.println(person1 == person3);
System.out.println(person2 == person3);
System.out.println(person1 != person2);
System.out.println(person1 != person3);
System.out.println(person2 != person3);
```

This produces the following output:

```
false
true
false
true
false
true
```

We can see that `person1` and `person3` are set up to be aliases, since `person3` is just assigned the same location that `person1` is looking at. On the other hand, `person1` and `person2` are initialized with the same information, but are building two separate objects so their references are different.

Just like we can use these two relational operators to determine if two references are the same or different, we can check if a reference is pointing to an object at all by comparing to the null value! Here is what this would look like from the `NotesNull1.java` file:

```java
Person person1 = new Person();
Person person2 = null;

System.out.println(person1 == null);
System.out.println(person2 == null);
System.out.println(person1 != null);
System.out.println(person2 != null);
```

This produces the following output:

```
false
true
true
false
```

---

## Object Comparison

In order to compare objects directly, we depend on certain features being present in the class that represents that object. Specifically, they need to have an `equals` method, which we saw a little bit in Unit 2 with the `String` class and objects.

You will notice there is an `equals` method present in the `Person` class we see here. This is what it looks like from the `Person.java` file:

```java
public boolean equals(Person p){
    return age == p.getAge() && firstName == p.getFirstName() && lastName == p.getLastName();
}
```

Remember that just like with `String` objects, this is called on one object with the dot operator `.` and passes the second Person object as a parameter, so this is written from the perspective of one object where we can just use `age`, `firstName` and `lastName`, while the other object needs to be called with methods!

Here is an example of what this could look like from the `NotesObject1.java` file:

```java
Person person1 = new Person(25, "Mr.", "G");
Person person2 = new Person(25, "Mr.", "G");
Person person3 = person1;

System.out.println(person1.equals(person2));
System.out.println(person1.equals(person3));
System.out.println(person2.equals(person3));
```

This produces the following output:

```
true
true
true
```

We can see that these three `Person` variables all store the same person, either by completely redefining from a constructor or by sharing the same reference!

An equals method can decide what is required to make two objects equal. The method above decided that two people needed to have the same age, firstName, and lastName, but it could have just said that they needed the same firstName and lastName and ignored age! It is up to the person writing a class to make the decision and the person using the class (you all!) to carefully read to see what it uses!

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
