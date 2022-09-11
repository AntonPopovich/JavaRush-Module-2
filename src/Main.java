import Inhabitant.Inhabitant;
import Island.Island;
import Statistics.PrintStat;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Island island = new Island();
        for (Inhabitant inh : island.getIsland()) {
            inh.island = island;
        }

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(new PrintStat(island.getIsland()), 0, 2, TimeUnit.SECONDS);

        for (int i = 0; i < 100; i++) {
        ExecutorService cachedPool = Executors.newCachedThreadPool();
            try {
                cachedPool.invokeAll(island.getIsland());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedPool.shutdown();
            Thread.sleep(500);
        }
        System.out.println("Simulation is over");
    }
}
