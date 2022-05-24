package strategyImplementation;

import strategyInterface.IFightStrategy;

public class FightStrategyForHigherLevelDragon implements IFightStrategy {
    public void fight() {
        // Run away!
    }

    @Override
    public void showBattleResult() {
        System.out.println(DragonTypes.HIGHER_LEVEL_DRAGON + " was confused...");
    }
}
