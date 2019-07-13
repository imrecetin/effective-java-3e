# Eliminate obsolete object references

An obsolete reference is simply a reference that will never be dereferenced again.

Memory leaks in garbage-collected languages (more properly known as unintentional object retentions) are insidious

Nulling out object references should be the exception rather than the norm
The best way to eliminate an obsolete reference is to let the variable that contained
the reference fall out of scope. This occurs naturally if you define each variable in
the narrowest possible scope

whenever a class manages its own memory, the programmer should be alert for memory leaks. 

Another common source of memory leaks is caches. Once you put an
object reference into a cache, it’s easy to forget that it’s there and leave it in the
cache long after it becomes irrelevant.
The LinkedHashMap class facilitates the latter approach with its removeEldestEntry method


A third common source of memory leaks is listeners and other callbacks.

memory leaks typically do not manifest themselves as obvious
failures, they may remain present in a system for years. They are typically
discovered only as a result of careful code inspection or with the aid of a
debugging tool known as a heap profiler. Therefore, it is very desirable to learn to
anticipate problems like this before they occur and prevent them from happening.




