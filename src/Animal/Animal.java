package Animal;

import Inhabitant.Inhabitant;
import Island.Island;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends Inhabitant {

    public byte maxSpeed;
    public float kilosForSaturation;
    public float saturation;
    public float fullHealth = saturation;

    int [][] eatChance = {{-1, 0, 0, 0, 0, 10, 15, 60, 80, 60, 70, 15, 10, 40, 0, 0},
                            {0, -1, 15, 0, 0, 0 ,0, 20, 40, 0, 0, 0, 0, 10, 0, 0},
                            {0, 0, -1, 0, 0, 0, 0, 70, 90, 0, 0, 0, 0, 60, 40, 0},
                            {0, 80, 0, -1, 0, 40, 80, 80, 90, 70, 70, 50, 20, 10, 0, 0},
                            {0, 0, 10, 0, -1, 0, 0, 90, 90, 0, 0, 0, 0, 80, 0, 0},
                            {0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                            {0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                            {0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 100},
                            {0, 0, 0, 0, 0, 0, 0, 0, -1 , 0, 0, 0, 0, 0, 90, 100},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 100},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 100},
                            {0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, -1, 0, 0, 90, 100},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 100},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 90, 100},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 100}};

    public synchronized void move() {
        CopyOnWriteArrayList<Inhabitant> map = island.getIsland();
        if (populationCheck(map)) {
            int randX = ThreadLocalRandom.current().nextInt(0, this.maxSpeed);
            int maxrandY = this.maxSpeed - randX;
            int randY = ThreadLocalRandom.current().nextInt(0, maxrandY);
            if (this.positionX > 0 && this.positionX < 99) {
                setPositionX(randX + this.positionX);
            }
            if (this.positionY > 0 && this.positionY < 19) {
                setPositionY(randY + this.positionY);
            }
            if (!populationCheck(map)) {
                setPositionX(this.positionX - randX);
                setPositionY(this.positionY - randY);
            }
        }
        island.setIsland(map);
    }

    public synchronized void eat() {
        CopyOnWriteArrayList<Inhabitant> map = island.getIsland();
        for (int i = 0; i < map.size(); i++) {
             int rand = ThreadLocalRandom.current().nextInt(0, map.size());
             Inhabitant food = map.get(rand);
             if (food.positionX == this.positionX && food.positionY == this.positionY) {
                 int chance = eatChance[this.eatChancePosition][food.eatChancePosition];
                 if (chance == -1) {
                     continue;
                 } else {
                     int attempt = ThreadLocalRandom.current().nextInt(0, 101);
                     if (attempt < chance) {
                         if (food.weight > this.kilosForSaturation)
                             this.saturation = this.kilosForSaturation;
                         else this.saturation = food.weight;
                     }
                 map.remove(rand);
                 }
                 break;
             }
        }
        island.setIsland(map);
    }

    public synchronized void multiply() {
        CopyOnWriteArrayList<Inhabitant> map = island.getIsland();
        if (populationCheck(map)) {
            if (populationCount(map)) {
                Inhabitant inhabitant = createSmb();
                inhabitant.positionX = this.positionX;
                inhabitant.positionY = this.positionY;
                map.add(inhabitant);
            }
        }
        island.setIsland(map);
    }

    public Island call() {
           eat();
           move();
           multiply();
            saturation -= fullHealth * 0.5f;
            if (saturation == 0) {
                island.getIsland().remove(this);
            }
        return null;
    }
}
