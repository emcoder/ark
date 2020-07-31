package animals;

import action.NoisyAnimal;
import action.SwimmingAnimal;

public class Duck extends Aves implements NoisyAnimal, SwimmingAnimal {
    private String noise = "Quack, quack";

    public String say(){
        System.out.println(noise);
        return noise;
    }

    @Override
    public String getNoise() {
        return noise;
    }
}
