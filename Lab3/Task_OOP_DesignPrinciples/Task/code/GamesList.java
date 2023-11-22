import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GamesList {
	private List games;
	
	public GamesList() {
		games = new LinkedList();
	}
	
	public void addGame(String name, GameRules rules) {
		Game game = new Game(name ,rules);
		games.add(game);
	}
	
	public Game getGame(String name) {
		for (Iterator i = games.iterator(); i.hasNext(); ) {
			Game game = (Game) i.next();
			if (game.getName().equals(name)) {
				return game;
			}
		}
		return null;
	}
	
	public List search(String ruleName, String rule) {
		List matchingGames = new LinkedList();
		for (Iterator i = games.iterator(); i.hasNext(); ) {
			Game game = (Game) i.next();
			if (game.getRules().matches(ruleName, rule))
				matchingGames.add(game);
		}
		return matchingGames;
	}
}
