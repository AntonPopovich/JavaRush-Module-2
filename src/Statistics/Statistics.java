package Statistics;

import Inhabitant.Inhabitant;
import java.util.concurrent.CopyOnWriteArrayList;

public class Statistics {
    private CopyOnWriteArrayList<Inhabitant> island;

    public Statistics(CopyOnWriteArrayList<Inhabitant> island) {
        this.island = island;
    }

    protected int count_BUFFALO = 0;
    protected int count_CATERPILLAR = 0;
    protected int count_DEER = 0;
    protected int count_DUCK = 0;
    protected int count_GOAT = 0;
    protected int count_HORSE = 0;
    protected int count_MOUSE = 0;
    protected int count_RABBIT = 0;
    protected int count_SHEEP = 0;
    protected int count_WILDBOAR = 0;

    protected int count_BEAR = 0;
    protected int count_BOA = 0;
    protected int count_EAGLE = 0;
    protected int count_FOX = 0;
    protected int count_WOLF = 0;

    protected int count_PLANT = 0;

    public void animalCount() {
        for (Inhabitant inhabitant: island) {
            String animalClass  = String.valueOf(inhabitant.getClass());
            switch (animalClass) {
                case "class Herbivores.Buffalo":
                    count_BUFFALO++;
                    break;
                case "class Herbivores.Caterpillar":
                    count_CATERPILLAR++;
                    break;
                case "class Herbivores.Deer":
                    count_DEER++;
                    break;
                case "class Herbivores.Duck":
                    count_DUCK++;
                    break;
                case "class Herbivores.Goat":
                    count_GOAT++;
                    break;
                case "class Herbivores.Horse":
                    count_HORSE++;
                    break;
                case "class Herbivores.Mouse":
                    count_MOUSE++;
                    break;
                case "class Herbivores.Rabbit":
                    count_RABBIT++;
                    break;
                case "class Herbivores.Sheep":
                    count_SHEEP++;
                    break;
                case "class Herbivores.Wildboar":
                    count_WILDBOAR++;
                    break;
                case "class Predators.Bear":
                    count_BEAR++;
                    break;
                case "class Predators.Boa":
                    count_BOA++;
                    break;
                case "class Predators.Eagle":
                    count_EAGLE++;
                    break;
                case "class Predators.Fox":
                    count_FOX++;
                    break;
                case "class Predators.Wolf":
                    count_WOLF++;
                    break;
                case "class Plants.Plant":
                    count_PLANT++;
                    break;
            }
        }
    }


    public void print() {
        System.out.printf("\uD83D\uDC03 Buffalo - %d, ", count_BUFFALO);
        System.out.printf("\uD83D\uDC1B Caterpillar - %d, ", count_CATERPILLAR);
        System.out.printf("\uD83E\uDD8C Deer - %d, ", count_DEER);
        System.out.printf("\uD83E\uDD86 Duck - %d, ", count_DUCK);
        System.out.printf("\uD83D\uDC10 Goat - %d, ", count_GOAT);
        System.out.printf("\uD83D\uDC0E Horse - %d, ", count_HORSE);
        System.out.printf("\uD83D\uDC01 Mouse - %d, ", count_MOUSE);
        System.out.printf("\uD83D\uDC07 Rabbit - %d, ", count_RABBIT);
        System.out.printf("\uD83D\uDC11 Sheep - %d, ", count_SHEEP);
        System.out.printf("\uD83D\uDC17 WildBoar - %d, ", count_WILDBOAR);
        System.out.printf("\uD83D\uDC3B Bear - %d, ", count_BEAR);
        System.out.printf("\uD83D\uDC0D Boa - %d, ", count_BOA);
        System.out.printf("\uD83E\uDD85 Eagle - %d, ", count_EAGLE);
        System.out.printf("\uD83E\uDD8A Fox - %d, ", count_FOX);
        System.out.printf("\uD83D\uDC3A Wolf - %d, ", count_WOLF);
        System.out.printf("\uD83C\uDF3F Plant - %d. ", count_PLANT);
        System.out.println();
    }
}
