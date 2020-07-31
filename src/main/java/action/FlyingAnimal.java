package action;

public interface FlyingAnimal {
    String action = "I am flying";

    default String fly(){
        System.out.println(action);
        return action;
    }
}
