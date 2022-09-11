package Herbivores;

import Inhabitant.Inhabitant;

public class Horse extends Herbivorous {

    public Horse() {
        weight = 400f;
        maxQtyPerSquare = 20;
        maxSpeed = 4;
        kilosForSaturation = 60f;
        saturation = kilosForSaturation;
        eatChancePosition = 5;
    }

    @Override
    public Inhabitant createSmb() {
        return new Horse();
    }
}
