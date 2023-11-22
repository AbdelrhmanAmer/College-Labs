package game;

import game.interfaces.Game;

import java.util.LinkedList;
import java.util.List;

public class GamesList {
	private List<Game> games;
	
	public GamesList() {
		games = new LinkedList<>();
	}
	
	public void addGame(Game game) {
		games.add(game);
	}

	public List<Game> search(String ruleName, String rule) {
		List<Game> matchingFootballGames = new LinkedList<>();
		for (Game game : games) {
			if (game.getRules().matches(ruleName, rule)) {
				matchingFootballGames.add(game);
			}
		}
		return matchingFootballGames;
	}
}
