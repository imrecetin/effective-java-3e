# Obey the general contract when overriding equals

So when is it appropriate to override equals? It is when a class has a notion of
logical equality that differs from mere object identity and a superclass has not
already overridden equals. This is generally the case for value classes. A value
class is simply a class that represents a value, such as Integer or String

Whether or not a class is immutable, do not write an equals method that
depends on unreliable resources

for float fields, use the static Float.compare(float, float)  method; and
for double fields, use Double.compare(double, double) . 
While you could compare float and double fields with the static methods Float.equals 
and Double.equals, this would entail autoboxing on every comparison, which would have poor
performance. 

Always override hashCode when you override equals

