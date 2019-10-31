# Answers
> Questions found [here](https://github.com/Team694/newbie-ed-2019/tree/master/activities/Interfaces.md)

### Question 1
public interface InterfaceName {
    // interface code here
}

### Question 2
You can't instantiate an interface as it is abstract, meaning that it doesn't do anything, it is only intended to be implemented by its child classes.

### Question 3
The interface constructor doesn't exist, as it can't be instantiated.

### Question 4
public class ChildClass implements InterfaceName {
    @Override
    //insert all of the methods specified in the interface to override them
}

### Question 5
You can't make a static method in an interface as static methods can't be overriden. As every method inside of an interface is supposed to be overriden, this makes static methods impossible.

### Question 6
All variables are automatically public, static, and final inside of an interface.

