package Predators;

import Inhabitant.Inhabitant;

public class Bear extends Predator {

    public Bear() {
        weight = 500f;
        maxQtyPerSquare = 5;
        maxSpeed = 2;
        kilosForSaturation = 80f;
        saturation = kilosForSaturation;
        eatChancePosition = 3;
    }

    @Override
    public Inhabitant createSmb() {
        return new Bear();
    }

}