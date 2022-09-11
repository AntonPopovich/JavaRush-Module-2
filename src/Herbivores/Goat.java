package Herbivores;

import Inhabitant.Inhabitant;

public class Goat extends Herbivorous {

    public Goat() {
        weight = 60f;
        maxQtyPerSquare = 140;
        maxSpeed = 3;
        kilosForSaturation = 10f;
        saturation = kilosForSaturation;
        eatChancePosition = 9;
    }

    @Override
    public Inhabitant createSmb() {
        return new Goat();
    }
}