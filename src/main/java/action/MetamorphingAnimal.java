package action;

import animals.Animal;

public interface MetamorphingAnimal {
    default Animal metamorph(){
        System.out.println("Unable to metamorph");
        return null;
    }
}
