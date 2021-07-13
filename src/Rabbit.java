public class Rabbit extends Animal {
    public Rabbit(){
        super();
        System.out.println("A rabbit is born!");
    }
    @Override
    public String sleep() {
        return "A rabbit sleeps peacefully...";
    }
    @Override
    public String eat() {
        return "a rabbit nibbles on his veggies...";
    }

    public String leap() {
        return "A rabbit leaps out of the bushes...";
    }
}
