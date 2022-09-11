package Herbivores;

import Inhabitant.Inhabitant;

public class Caterpillar extends Herbivorous {

    public Caterpillar() {
        weight = 0.01f;
        maxQtyPerSquare = 1000;
        maxSpeed = 0;
        kilosForSaturation = 0f;
        saturation = kilosForSaturation;
        eatChancePosition = 14;
    }


    @Override
    public Inhabitant createSmb() {
        return new Caterpillar();
    }
}