import strategyImplementation.BeTheBatmanFightStrategy;
import strategyImplementation.FightStrategyForBlindDragon;
import strategyImplementation.FightStrategyForHigherLevelDragon;

public class Main {

    public static void main(String[] args) {
        // Test a fight with a higher level dragon.
        Fight fightWithHigherLevelDragon = new Fight(new FightStrategyForHigherLevelDragon());
        fightWithHigherLevelDragon.fight();
        fightWithHigherLevelDragon.showBattleResult();
        System.out.println();

        // Test a fight with a blind dragon.
        Fight fightWithBlindDragon = new Fight(new FightStrategyForBlindDragon());
        fightWithBlindDragon.fight();
        fightWithBlindDragon.showBattleResult();
        System.out.println();

        // Be the Batman;
        Fight fightBatman = new Fight(new BeTheBatmanFightStrategy());
        fightBatman.fight();
        fightBatman.showBattleResult();
    }
}
