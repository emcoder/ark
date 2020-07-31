package animals;

import action.NoisyAnimal;

public class Cat extends Animal implements NoisyAnimal {
    private String noise = "Meow";

    @Override
    public String say() {
        System.out.println(noise);
        return noise;
    }

    @Override
    public String getNoise() {
        return noise;
    }
}
