public class Animal {
    void eat(){
        System.out.println("animal is eating:");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking:");
    }
}
public class Example {
    public static void main (String [] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
