# Consider static factory methods instead of constructors

One advantage of static factory methods is that, unlike constructors, they
have names.

A second advantage of static factory methods is that, unlike constructors,
they are not required to create a new object each time they’re invoked.

A third advantage of static factory methods is that, unlike constructors,
they can return an object of any subtype of their return type.

A fourth advantage of static factories is that the class of the returned
object can vary from call to call as a function of the input parameters

A fifth advantage of static factories is that the class of the returned object
need not exist when the class containing the method is written.

The main limitation of providing only static factory methods is that
classes without public or protected constructors cannot be subclassed.

• from—A type-conversion method that takes a single parameter and returns a
corresponding instance of this type, for example:
Date d = Date.from(instant);
• of—An aggregation method that takes multiple parameters and returns an instance of this type that incorporates them, for example:
Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);
• valueOf—A more verbose alternative to from and of, for example:
BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
• instance or getInstance—Returns an instance that is described by its parameters (if any) but cannot be said to have the same value, for example:
StackWalker luke = StackWalker.getInstance(options);
• create or newInstance—Like instance or getInstance, except that the
method guarantees that each call returns a new instance, for example:
Object newArray = Array.newInstance(classObject, arrayLen);
• getType—Like getInstance, but used if the factory method is in a different
class. Type is the type of object returned by the factory method, for example:
FileStore fs = Files.getFileStore(path);
• newType—Like newInstance, but used if the factory method is in a different
class. Type is the type of object returned by the factory method, for example:
BufferedReader br = Files.newBufferedReader(path);
• type—A concise alternative to getType and newType, for example:
List<Complaint> litany = Collections.list(legacyLitany);

