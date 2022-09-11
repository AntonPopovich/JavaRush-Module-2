package Herbivores;

import Inhabitant.Inhabitant;

public class Mouse extends Herbivorous {

    public Mouse() {
        weight = 0.05f;
        maxQtyPerSquare = 500;
        maxSpeed = 1;
        kilosForSaturation = 0.01f;
        saturation = kilosForSaturation;
        eatChancePosition = 8;
    }

    @Override
    public Inhabitant createSmb() {
        return new Mouse();
    }
}