import StrategyInterface.IFightStrategy;

public class Fight {
    IFightStrategy fightStrategy;

    public Fight(IFightStrategy fightStrategy) {
        this.fightStrategy = fightStrategy;
    }

    public void fight() {
        fightStrategy.fight();
    }

    public void showBattleResult() {
        fightStrategy.showBattleResult();
    }
}
