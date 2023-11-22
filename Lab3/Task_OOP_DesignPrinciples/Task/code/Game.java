public class Game {
	
	private String name;
	GameRules rules;
	
	public Game(String name, GameRules rules) {
		this.name = name;
		this.rules = rules;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public GameRules getRules() {
		return rules;
	}
	
	public void setRules(GameRules rules) {
		this.rules = rules;
	}
}
