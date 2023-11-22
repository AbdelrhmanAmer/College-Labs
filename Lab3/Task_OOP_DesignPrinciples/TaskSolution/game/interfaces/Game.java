package game.interfaces;

public abstract class Game {

    protected String name;
    protected Rules rules;

    public Game(String name, Rules rules) {
        this.name = name;
        this.rules = rules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "name: " + name + " and rules: " + rules.toString();
    }
}
