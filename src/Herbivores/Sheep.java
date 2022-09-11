package Herbivores;

import Inhabitant.Inhabitant;

public class Sheep extends Herbivorous {

    public Sheep() {
        weight = 70f;
        maxQtyPerSquare = 140;
        maxSpeed = 3;
        kilosForSaturation =  15f;
        saturation = kilosForSaturation;
        eatChancePosition = 10;
    }

    @Override
    public Inhabitant createSmb() {
        return new Sheep();
    }
}