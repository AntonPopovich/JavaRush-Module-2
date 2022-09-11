package Predators;

import Inhabitant.Inhabitant;

public class Wolf extends Predator {

    public Wolf() {
        weight =50f;
        maxQtyPerSquare = 30;
        maxSpeed = 3;
        kilosForSaturation = 8f;
        saturation = kilosForSaturation;
        eatChancePosition = 0;
    }

    @Override
    public Inhabitant createSmb() {
        return new Wolf();
    }
}
