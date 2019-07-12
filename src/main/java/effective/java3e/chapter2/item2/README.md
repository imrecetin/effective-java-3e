# Consider a builder when faced with many constructor parameters

Telescoping constructor pattern - does not scale well! the telescoping constructor pattern works, but it is hard to write
client code when there are many parameters, and harder still to read it.

JavaBeans Pattern - allows inconsistency, mandates mutability. 
JavaBeans pattern, in which you call a parameterless constructor to create the object and then call setter methods to set each required parameter
and each optional parameter of interest:
