package game;

import game.impl.*;
import game.interfaces.Game;

import java.util.List;

public class FindGameTester {
	
	public static void main(String[] args) {
		GamesList gamesList = new GamesList();
		initializeGamesList(gamesList);
		
		String erinRule = "fieldSize";
		String whatErinLikes = "150";
		List<Game> matchingGames = gamesList.search(erinRule, whatErinLikes);

		if (!matchingGames.isEmpty()) {
			System.out.println("Erin, you might like these games:");
			for (Game game : matchingGames) {
				System.out.println("  We have a game with " + game.toString() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeGamesList(GamesList gamesList) {
		gamesList.addGame(new FootballGame("Small Game",
				new FootballRules("90", "5", "100", "2")));
		gamesList.addGame(new FootballGame("Short Game",
				new FootballRules("45", "11", "150", "4")));

		gamesList.addGame(new Moba("Standard Game",
				new MobaRules("5", "3", "500", "4")));
		gamesList.addGame(new Moba("Standard Game",
				new MobaRules("2", "4", "300", "4")));

		gamesList.addGame(new MMORpg("Fast Game",
				new MMORpgRules("5", "5", "150", "50")));
		gamesList.addGame(new MMORpg("Fast Game",
				new MMORpgRules("6", "4", "100", "100")));
	}
}
