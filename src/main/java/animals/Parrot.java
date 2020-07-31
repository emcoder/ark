package animals;

import action.NoisyAnimal;

public class Parrot extends Aves implements NoisyAnimal {
    NoisyAnimal neighbor;
    //No noise without neighbor
    private String noise="";

    public Parrot(NoisyAnimal neighbor){
        //create a Parrot with a neighbor and save its noise
        this.neighbor = neighbor;
        this.noise = neighbor.getNoise();
    }

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
