package Plants;

import Inhabitant.Inhabitant;
import Inhabitant.Multiply;
import Island.Island;
import java.util.concurrent.CopyOnWriteArrayList;

public class Plant extends Inhabitant implements Multiply {

    public Plant() {
        weight = 1f;
        maxQtyPerSquare = 200;
        eatChancePosition = 15;
    }

    public void multiply() {
        CopyOnWriteArrayList<Inhabitant> map = island.getIsland();
        if (populationCheck(map)) {
            Inhabitant inhabitant = createSmb();
            inhabitant.positionX = this.positionX;
            inhabitant.positionY = this.positionY;
            map.add(inhabitant);
        }
        island.setIsland(map);
    }

    @Override
    public Inhabitant createSmb() {
        return new Plant();
    }

    public Island call() {
        synchronized (island.getIsland()) {
            multiply();
        }
        return null;
    }
}
