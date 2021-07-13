public class Frog extends Animal {
    public Frog() {
        System.out.println("A frog has emerged");
    }
    @Override
    public String eat() {
        return "A frog swallows his food whole...";
    }
    @Override
    public String sleep() {
        return "A frog snores loudly...";

    }

    public String ribbit() {
        return "ribbit ribbbbbbit!";
    }
}
