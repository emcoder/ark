package animals;

import action.MetamorphingAnimal;

public class Caterpillar extends Animal implements MetamorphingAnimal {
    private String movement = "I am crawling";
    private Butterfly metamorphed = null;

    public String crawl(){
        System.out.println(movement);
        return movement;
    }

    public Butterfly metamorph(){
        metamorphed = new Butterfly();
        return metamorphed;
    }
}
