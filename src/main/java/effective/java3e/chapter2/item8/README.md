# Avoid finalizers and cleaners

Cleaners are less dangerous than finalizers, but still unpredictable,
slow, and generally unnecessary.

Providing a finalizer for a
class can arbitrarily delay reclamation of its instances. 

you should never depend on a finalizer or cleaner to update persistent state. 
For example,
depending on a finalizer or cleaner to release a persistent lock on a shared
resource such as a database is a good way to bring your entire distributed system
to a grinding halt.

Finalizers have a serious security problem: they open your class up to
finalizer attacks. 

To protect nonfinal classes from finalizer attacks, write a final finalize method that does nothing.

Just have your class implement AutoCloseable, and require its clients
to invoke the close method on each instance when it is no longer needed,
typically using try-with-resources to ensure termination even in the face of
exceptions 