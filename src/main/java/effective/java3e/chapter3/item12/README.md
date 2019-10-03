# Always override toString

Default Object String method implementation
It consists of the class name followed by an “at” sign (@) and the unsigned hexadecimal 
representation of the hash code, for example, PhoneNumber@163b91. 

The toString contract goes on to say, “It is recommended that all subclasses override this method.” 
Good advice, indeed!

It is recommended that you do this for value classes, such as phone number or
matrix. 

To recap, override Object’s toString implementation in every instantiable
class you write, unless a superclass has already done so