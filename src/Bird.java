public class Bird extends Animal {
    public Bird() {
        //super();
        System.out.println("A bird has hatched...");
    }

    @Override
    public String sleep() {
        return "A bird sleeps soundly...";
    }
    @Override
    public String eat() {
        return "A bird eats...";
    }
    public String fly() {
        //unique to birds
        return "A bird flies...";
    }
}
