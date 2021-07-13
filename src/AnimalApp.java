public class AnimalApp {
    public static void main(String[] args){
        Animal a = new Animal();                //creating a new Animal object "a"
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();                      //creating a new Cat object "c" that is a child class of Animal. This is why the parents
                                                //print message is still executed, as it has inherited that from the Animal class.
        print(c.eat());                         //the eat() and sleep() methods are examples of polymorphism as it is Overriding a method initially created in Animal
        print(c.sleep());
        print(c.purr());                        //purr() is a method unique to the cat class and can not be executed by Animal or other Animal child classes(it is hidden)
                                                //this is encapsulation.

        Bird b = new Bird();                    //Bird is also a child class of Animal and inherits the "A new Animal has been created!" print statement.
        print(b.eat());                         //polymorphism example
        print(b.sleep());                       //polymorphism example
        print(b.fly());                         //fly() is a unique method for Bird and is an example of encapsulation

        Frog f = new Frog();
        print(f.eat());
        print(f.sleep());
        print(f.ribbit());

        Rabbit r = new Rabbit();
        print(r.eat());
        print(r.sleep());
        print(r.leap());

    }









    private static void print(String s) {       //a method for making cleaner print statements (compared to System.out.print())
        System.out.println(s);
    }
}
