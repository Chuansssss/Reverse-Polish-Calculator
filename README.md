# Reverse-Polish-Calculator
This is a very simple reverse Polish calculator based on Stack in Java.

User type in the operator following there operands seperated by space, e.g. "10 2 + 4 *" equals "(10 + 2) * 4".

In this program, the maximum size of the stack is 16. Once the number of operands in the stack exceeds 16, the upper overflow will be trigerred and -2 will be returned. Also if the stack is empty when an operator is read, the lower overflow is trigerred and -1 will be returned.

There are 3 feasible operators in this program, sum, multipication and self-increment.
