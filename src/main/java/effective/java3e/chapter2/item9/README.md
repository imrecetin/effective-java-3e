# Prefer try-with-resources to try-finally

Many classes and interfaces in the Java
libraries and in third-party libraries now implement or extend AutoCloseable. If
you write a class that represents a resource that must be closed, your class should
implement AutoCloseable too.

The lesson is clear: Always use try-with-resources in preference to tryfinally when working with resources that must be closed. The resulting code is
shorter and clearer, and the exceptions that it generates are more useful. The trywith-resources statement makes it easy to write correct code using resources that
must be closed, which was practically impossible using try-finally
