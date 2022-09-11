package Statistics;

import Inhabitant.Inhabitant;
import java.util.concurrent.CopyOnWriteArrayList;

public class PrintStat implements Runnable{
    private CopyOnWriteArrayList<Inhabitant> island;

    public PrintStat(CopyOnWriteArrayList<Inhabitant> island) {
        this.island = island;
    }

    @Override
    public void run() {
        synchronized (island) {
            Statistics stat = new Statistics(island);
            stat.animalCount();
            stat.print();
        }
    }
}
