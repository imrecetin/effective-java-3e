# Enforce noninstantiability with a private constructor

Attempting to enforce noninstantiability by making a class abstract does
not work. The class can be subclassed and the subclass instantiated
a class can be made noninstantiable by including a private constructor
this idiom also prevents the class from being subclassed



