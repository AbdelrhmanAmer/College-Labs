package game.impl;

import game.interfaces.Rules;

public class MobaRules implements Rules {
    private String teamSize;
    private String lanesCount;
    private String mapSize;
    private String championsCount;

    public MobaRules(String teamSize, String lanesCount, String mapSize, String championsCount) {
        this.teamSize = teamSize;
        this.lanesCount = lanesCount;
        this.mapSize = mapSize;
        this.championsCount = championsCount;
    }

    @Override
    public boolean matches(String ruleName, String rule) {
        switch (ruleName) {
            case "teamSize":
                return (teamSize.equals(rule));
            case "lanesCount":
                return (lanesCount.equals(rule));
            case "mapSize":
                return (mapSize.equals(rule));
            case "championsCoun":
                return (championsCount.equals(rule));
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return "teamSize: " + teamSize + " and lanesCount: " + lanesCount +
                " and mapSize: " + mapSize + " and championsCount: " + championsCount;
    }
}
