package Animal;

import Herbivores.*;
import Inhabitant.Inhabitant;
import Plants.Plant;
import Predators.*;

public class AnimalFactory {
    public static Inhabitant createAnimal(AllAnimalsType type) {
        Inhabitant animal = null;

    switch (type) {
        case BUFFALO:
            animal =  new Buffalo();
            break;
        case CATERPILLAR:
            animal = new Caterpillar();
            break;
        case DEER:
            animal =  new Deer();
            break;
        case DUCK:
            animal =  new Duck();
            break;
        case GOAT:
            animal =  new Goat();
            break;
        case HORSE:
            animal =  new Horse();
            break;
        case MOUSE:
            animal =  new Mouse();
            break;
        case RABBIT:
            animal =  new Rabbit();
            break;
        case SHEEP:
            animal =  new Sheep();
            break;
        case WILDBOAR:
            animal =  new Wildboar();
            break;
        case BEAR:
            animal =  new Bear();
            break;
        case BOA:
            animal =  new Boa();
            break;
        case EAGLE:
            animal =  new Eagle();
            break;
        case FOX:
            animal =  new Fox();
            break;
        case WOLF:
            animal =  new Wolf();
            break;
        case PLANT:
            animal =  new Plant();
            break;

    }

    return animal;
}

    public enum AllAnimalsType {

        BUFFALO,
        CATERPILLAR,
        DEER,
        DUCK,
        GOAT,
        HORSE,
        MOUSE,
        RABBIT,
        SHEEP,
        WILDBOAR,

        BEAR,
        BOA,
        EAGLE,
        FOX,
        WOLF,

        PLANT

    }
}
