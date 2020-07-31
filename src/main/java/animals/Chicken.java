package animals;

import action.NoisyAnimal;

public class Chicken extends Aves implements NoisyAnimal {
    private String noise = "Cluck, cluck";


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
