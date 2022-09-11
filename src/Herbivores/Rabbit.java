package Herbivores;

import Inhabitant.Inhabitant;

public class Rabbit extends Herbivorous {

    public Rabbit() {
        weight = 2f;
        maxQtyPerSquare = 150;
        maxSpeed = 2;
        kilosForSaturation = 0.45f;
        saturation = kilosForSaturation;
        eatChancePosition = 7;
    }

    @Override
    public Inhabitant createSmb() {
        return new Rabbit();
    }
}