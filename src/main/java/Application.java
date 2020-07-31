import animals.*;

public class Application {
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.walk();
        bird.fly();
        bird.sing();

        Duck duck = new Duck();
        duck.say();
        duck.swim();

        Chicken chicken = new Chicken();
        chicken.say();

        Rooster rooster = new Rooster();
        rooster.say();

        Parrot parrot1 = new Parrot(new Dog());
        Parrot parrot2 = new Parrot(new Cat());
        Parrot parrot3 = new Parrot(new Rooster());

        parrot1.say();//dog neighbor
        parrot2.say();//cat neighbor
        parrot3.say();//rooster neighbor

    }

}
