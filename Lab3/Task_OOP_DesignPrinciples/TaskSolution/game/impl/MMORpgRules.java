
import game.interfaces.Rules;

public class MMORpgRules implements Rules {

    private String maxLevel;
    private String numberOfTowns;
    private String inventorySize;
    private String mapSize;

    public MMORpgRules(String maxLevel, String numberOfTowns, String inventorySize, String mapSize) {
        this.maxLevel = maxLevel;
        this.numberOfTowns = numberOfTowns;
        this.inventorySize = inventorySize;
        this.mapSize = mapSize;
    }

    @Override
    public boolean matches(String ruleName, String rule) {
        switch (ruleName) {
            case "maxLevel":
                return (maxLevel.equals(rule));
            case "numberOfTowns":
                return (numberOfTowns.equals(rule));
            case "inventorySize":
                return (inventorySize.equals(rule));
            case "mapSize":
                return (mapSize.equals(rule));
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return "maxLevel: " + maxLevel + " and numberOfTowns: " + numberOfTowns +
                " and inventorySize: " + inventorySize + " and mapSize: " + mapSize;
    }
}
