package animals;

import action.NoisyAnimal;

public class Dog extends Animal implements NoisyAnimal {
    private String noise = "Woof, woof";

    @Override
    public String say() {
        System.out.print(noise);
        return noise;
    }

    @Override
    public String getNoise() {
        return noise;
    }
}
