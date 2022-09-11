package Island;

import Animal.AnimalFactory;
import Inhabitant.Inhabitant;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Island {

    private CopyOnWriteArrayList<Inhabitant> island;

    //заполняем список всеми животными
    public Island() {
        CopyOnWriteArrayList<Inhabitant> AllAnimalsList = new CopyOnWriteArrayList<>();
        for (AnimalFactory.AllAnimalsType animal: AnimalFactory.AllAnimalsType.values()) {
            int randomQty = (int)(Math.random() * 500);
            for (int i = 0; i < randomQty; i++) {
                Inhabitant inhab = AnimalFactory.createAnimal(animal);
                inhab.positionX = ThreadLocalRandom.current().nextInt(0, 100);
                inhab.positionY = ThreadLocalRandom.current().nextInt(0, 20);
                if (inhab.populationCheck(AllAnimalsList)) {
                    AllAnimalsList.add(inhab);
                }
            }

        }
        island = AllAnimalsList;
    }

    public CopyOnWriteArrayList<Inhabitant> getIsland() {
        return this.island;
    }

    public void setIsland(CopyOnWriteArrayList<Inhabitant> island) {
        this.island = island;
    }
}
