package Herbivores;

import Inhabitant.Inhabitant;

public class Deer extends Herbivorous {

    public Deer() {
        weight = 300f;
        maxQtyPerSquare = 20;
        maxSpeed = 4;
        kilosForSaturation = 50f;
        saturation = kilosForSaturation;
        eatChancePosition = 6;
    }

    @Override
    public Inhabitant createSmb() {
        return new Deer();
    }
}