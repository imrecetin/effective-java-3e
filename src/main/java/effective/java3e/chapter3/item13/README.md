# Override clone judiciously

The Cloneable interface was intended as a mixin interface (Item 20) for classes to
advertise that they permit cloning

if a class implements Cloneable, Object’s clone method returns a field-by-field copy of 
the object; otherwise it throws CloneNotSupportedException.

x.clone() != x
will be true, and the expression
x.clone().getClass() == x.getClass()
will be true, but these are not absolute requirements. While it is typically the
case that
x.clone().equals(x)
will be true, this is not an absolute requirement

Public clone methods should omit the throws
clause, as methods that don’t throw checked exceptions are easier to use

all classes that implement Cloneable should override clone with a
public method whose return type is the class itself. This method should first call
super.clone, then fix any fields that need fixing.While these internal copies can usually be made by calling clone recursively, this
is not always the best approach. If the class contains only primitive fields or references to immutable objects, 
then it is likely the case that no fields need to be fixed.

A better approach to object copying is to
provide a copy constructor or copy factory. 
// Copy constructor
public Yum(Yum yum) { ... };
// Copy factory
public static Yum newInstance(Yum yum) { ... };

Interface-based copy constructors and factories, more
properly known as conversion constructors and conversion factories, allow the
client to choose the implementation type of the copy rather than forcing the client
to accept the implementation type of the original. For example, suppose you have
a HashSet, s, and you want to copy it as a TreeSet. The clone method can’t offer
this functionality, but it’s easy with a conversion constructor: new TreeSet<>(s) .












