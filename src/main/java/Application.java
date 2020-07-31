import animals.Bird;
import animals.Duck;

public class Application {
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.walk();
        bird.fly();
        bird.sing();

        Duck duck = new Duck();
        duck.say();
        duck.swim();

    }

}
