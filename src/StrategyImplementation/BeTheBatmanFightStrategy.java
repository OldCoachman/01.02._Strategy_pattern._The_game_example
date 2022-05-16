package StrategyImplementation;

import StrategyInterface.IFightStrategy;

public class BeTheBatmanFightStrategy implements IFightStrategy {
    @Override
    public void fight() {
        System.out.println("BECAUSE I'M BATMAN");
    }

    @Override
    public void showBattleResult() {
        System.out.println("All dragons in the world are defeated.");
    }
}
