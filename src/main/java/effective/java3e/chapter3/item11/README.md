# Always override hashCode when you override equals

You must override hashCode in every class that overrides equals

If two objects are equal according to the equals(Object)  method, 
then calling hashCode on the two objects must produce the same integer result.

A good hash function tends to produce unequal hash codes for unequal
instances