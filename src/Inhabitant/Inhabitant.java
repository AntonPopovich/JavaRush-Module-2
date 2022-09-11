package Inhabitant;

import Island.Island;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Inhabitant implements Multiply, Callable<Island> {
    public float weight;
    public short maxQtyPerSquare;
    public int eatChancePosition;
    public int positionX = ThreadLocalRandom.current().nextInt(0, 100);
    public int positionY = ThreadLocalRandom.current().nextInt(0, 20);
    public Island island;

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionX(int positionX) {
      this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean populationCheck(CopyOnWriteArrayList<Inhabitant> map){
        boolean check = false;
        short population = 0;
        for (Inhabitant inh : map) {
            if (inh.positionX == positionX && inh.positionY == positionY) {
                if (getClass() == inh.getClass()) {
                    population += 1;
                }
            }
        }
            if (population < maxQtyPerSquare) {
                check = true;
            }
        return check;
    }

    public boolean populationCount(CopyOnWriteArrayList<Inhabitant> map){
        boolean check = false;
        short population = 0;
        for (Inhabitant inh : map) {
            if (inh.positionX == positionX && inh.positionY == positionY) {
                if (getClass() == inh.getClass()) {
                    population += 1;
                }
            }
        }
        if (population > 1) {
            check = true;
        }
        return check;
    }

    public void setRandomPositions() {
        this.positionX = ThreadLocalRandom.current().nextInt(0, 100);
        this.positionY = ThreadLocalRandom.current().nextInt(0, 20);
    }

    public Island call() {

        return null;
    }

}
