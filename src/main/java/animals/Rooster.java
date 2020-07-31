package animals;

import action.NoisyAnimal;

public class Rooster extends Aves implements NoisyAnimal {
    private String noise = "Cock-a-doodle-doo";

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
