import StrategyImplementation.BeTheBatmanFightStrategy;

public class Main {

    public static void main(String[] args) {

        // Choose any fight strategy type.
        Fight BATMAN = new Fight(new BeTheBatmanFightStrategy());

        BATMAN.fight();
        BATMAN.showBattleResult();
    }
}
