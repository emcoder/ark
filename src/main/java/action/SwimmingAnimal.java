package action;

public interface SwimmingAnimal {
    String action = "I am swimming";

    default String swim(){
        System.out.println(action);

        return action;
    }
}
