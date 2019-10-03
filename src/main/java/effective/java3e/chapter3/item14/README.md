# Consider implementing Comparable

If you are writing a value class with an
obvious natural ordering, such as alphabetical order, numerical order, or chronological order, 
you should implement the Comparable interface:

• The implementor must ensure that sgn(x.compareTo(y)) == -sgn(y.
compareTo(x))  for all x and y. (This implies that x.compareTo(y)  must
throw an exception if and only if y.compareTo(x)  throws an exception.)
• The implementor must also ensure that the relation is transitive: (x.
compareTo(y) > 0 && y.compareTo(z) > 0)  implies x.compareTo(z) > 0.
• Finally, the implementor must ensure that x.compareTo(y) == 0 implies that
sgn(x.compareTo(z)) == sgn(y.compareTo(z)) , for all z.

If you want to add a value component to a class that implements Comparable, don’t
extend it; write an unrelated class containing an instance of the first class. 

Use of the relational operators < and > in compareTo methods is
verbose and error-prone and no longer recommended.

whenever you implement a value class that has a sensible ordering, you should have the class implement the Comparable interface so that its
instances can be easily sorted, searched, and used in comparison-based collections. When comparing field values in the implementations of the compareTo
methods, avoid the use of the < and > operators. Instead, use the static compare
methods in the boxed primitive classes or the comparator construction methods in
the Comparator interface.