package StrategyImplementation;

import StrategyInterface.IFightStrategy;

class GetAroundAndHitFightStrategy implements IFightStrategy {
    @Override
    public void fight() {
        System.out.println("So, I have a plan: I need to strike in the back...");
    }

    @Override
    public void showBattleResult() {
        System.out.println("The dragon got stabbed in the back.");
    }
}
