package action;

public interface WalkingAnimal {
    String action = "I am walking";

    default String walk(){
        System.out.println(action);

        return action;
    }
}
