package Herbivores;

import Inhabitant.Inhabitant;

public class Wildboar extends Herbivorous {

    public Wildboar() {
        weight = 400f;
        maxQtyPerSquare = 50;
        maxSpeed = 2;
        kilosForSaturation = 50f;
        saturation = kilosForSaturation;
        eatChancePosition = 11;
    }

    @Override
    public Inhabitant createSmb() {
        return new Wildboar();
    }
}