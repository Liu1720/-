public class Test2 {
    public static void main(String[] args) {
        Men m = new Men();
        m.eat();
        Women w = new Women();
        w.move();
    }

}
abstract class Animals{
    public abstract void move();
}
abstract class Person extends Animals{
    public abstract void eat();
}
class Men extends Person{
    @Override
    public void eat() {
        System.out.println("i love meat");
    }

    @Override
    public void move() {
        System.out.println("fastly run");
    }
}
class Women extends Person{
    @Override
    public void eat() {
        System.out.println("i love big banana");
    }

    @Override
    public void move() {
        System.out.println("slowing");
    }
}