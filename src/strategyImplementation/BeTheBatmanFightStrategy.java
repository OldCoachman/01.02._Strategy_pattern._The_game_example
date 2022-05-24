package strategyImplementation;

import strategyInterface.IFightStrategy;

public class BeTheBatmanFightStrategy implements IFightStrategy {
    @Override
    public void fight() {
        System.out.println("BECAUSE I'M BATMAN");
    }

    @Override
    public void showBattleResult() {
        System.out.println("All " + DragonTypes.HIGHER_LEVEL_DRAGON + "S, " + DragonTypes.BLIND_DRAGON + "S, and " +
                DragonTypes.OTHER_DRAGON + "S in the world are defeated.");
    }
}
