package Predators;

import Inhabitant.Inhabitant;

public class Boa extends Predator {

    public Boa() {
        weight =15f;
        maxQtyPerSquare = 30;
        maxSpeed = 1;
        kilosForSaturation = 3f;
        saturation = kilosForSaturation;
        eatChancePosition = 1;
    }

    @Override
    public Inhabitant createSmb() {
        return new Boa();
    }
}