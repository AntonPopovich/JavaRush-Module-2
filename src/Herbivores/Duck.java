package Herbivores;

import Inhabitant.Inhabitant;

public class Duck extends Herbivorous {

    public Duck() {
        weight = 1f;
        maxQtyPerSquare = 200;
        maxSpeed = 4;
        kilosForSaturation = 0.15f;
        saturation = kilosForSaturation;
        eatChancePosition = 13;
    }

    @Override
    public Inhabitant createSmb() {
        return new Duck();
    }
}