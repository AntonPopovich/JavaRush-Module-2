package Herbivores;

import Inhabitant.Inhabitant;

public class Buffalo extends Herbivorous {

    public Buffalo() {
        weight = 700f;
        maxQtyPerSquare = 10;
        maxSpeed = 3;
        kilosForSaturation = 100f;
        saturation = kilosForSaturation;
        eatChancePosition = 12;
    }


    @Override
    public Inhabitant createSmb() {
        return new Buffalo();
    }
}