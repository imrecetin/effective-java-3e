# Prefer dependency injection to hardwiring resources

Static utility classes and singletons are inappropriate for
classes whose behavior is parameterized by an underlying resource

A simple pattern that satisfies this requirement is to
pass the resource into the constructor when creating a new instance. 

Mosaic create(Supplier<? extends Tile> tileFactory) { ... }

Although dependency injection greatly improves flexibility and testability, it
can clutter up large projects, which typically contain thousands of dependencies.
This clutter can be all but eliminated by using a dependency injection framework,
such as Dagger [Dagger], Guice [Guice], or Spring [Spring]. 

In summary, do not use a singleton or static utility class to implement a class
that depends on one or more underlying resources whose behavior affects that of
the class, and do not have the class create these resources directly. Instead, pass
the resources, or factories to create them, into the constructor (or static factory or
builder). This practice, known as dependency injection, will greatly enhance the
flexibility, reusability, and testability of a class




