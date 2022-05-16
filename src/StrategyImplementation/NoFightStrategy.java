package StrategyImplementation;

import StrategyInterface.IFightStrategy;

class NoFightStrategy implements IFightStrategy {
    public void fight() {
        System.out.println("Sorry, I wanna run away.");
    }

    @Override
    public void showBattleResult() {
        System.out.println("The dragon was confused.");
    }
}
