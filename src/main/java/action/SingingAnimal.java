package action;

public interface SingingAnimal {
    String action = "I am singing";

    default String sing(){
        System.out.println(action);
        return action;
    }
}
