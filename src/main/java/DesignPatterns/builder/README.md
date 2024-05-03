### Factory Design Pattern

It is usually used when many fields are optional in a class. 
It helps keep constructor limit it's arg count + helps limit number of constructors.


![img.png](../../Assets/BUilder.png)


- Director is used to orchestrate and decide order in which to build

HomeBuilder Output:
![img.png](../../Assets/HomeBuilder.png)

Person Builder (Using Spring Boot)
![img.png](../../Assets/PersonBuilder.png)

We need to keep copy of variables in Builder as well as main class.


---
Pending:
How is this different from Decorator design pattern?