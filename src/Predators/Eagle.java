package Predators;

import Inhabitant.Inhabitant;

public class Eagle extends Predator {

    public Eagle() {
        weight = 6f;
        maxQtyPerSquare = 20;
        maxSpeed = 3;
        kilosForSaturation = 1f;
        saturation = kilosForSaturation;
        eatChancePosition = 4;
    }

    @Override
    public Inhabitant createSmb() {
        return new Eagle();
    }
}