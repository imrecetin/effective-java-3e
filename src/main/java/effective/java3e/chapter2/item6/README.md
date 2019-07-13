# Avoid creating unnecessary objects

An object can always be reused if it is immutable

String s = new String("bikini"); // DON'T DO THIS
String s="bikini" //DO THIS

the factory method Boolean.valueOf(String)  is preferable to the
constructor Boolean(String)

Some object creations are much more expensive than others. If you’re going
to need such an “expensive object” repeatedly, it may be advisable to cache it for
reuse

prefer primitives to boxed primitives, and watch out for unintentional autoboxing





