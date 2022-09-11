package Predators;

import Inhabitant.Inhabitant;

public class Fox extends Predator {

    public Fox() {
        weight = 8f;
        maxQtyPerSquare = 30;
        maxSpeed = 2;
        kilosForSaturation =2f;
        saturation = kilosForSaturation;
        eatChancePosition = 2;
    }

    @Override
    public Inhabitant createSmb() {
        return new Fox();
    }
}
