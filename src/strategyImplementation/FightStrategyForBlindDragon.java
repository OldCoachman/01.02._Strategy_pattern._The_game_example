package strategyImplementation;

import strategyInterface.IFightStrategy;

public class FightStrategyForBlindDragon implements IFightStrategy {
    @Override
    public void fight() {
        // Strike in the back.
    }

    @Override
    public void showBattleResult() {
        System.out.println(DragonTypes.BLIND_DRAGON + " got stabbed in the back.");
    }
}
