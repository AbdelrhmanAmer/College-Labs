import java.util.Iterator;
import java.util.List;

public class FindGameTester {
	
	public static void main(String[] args) {
		GamesList gamesList = new GamesList();
		initializeGamesList(gamesList);
		
		String erinRule = "fieldSize";
		String whatErinLikes = "150";
		List matchingGames = gamesList.search(erinRule, whatErinLikes);
		if (!matchingGames.isEmpty()) {
			System.out.println("Erin, you might like these games:");
			for (Iterator i = matchingGames.iterator(); i.hasNext(); ) {
				Game game = (Game) i.next();
				GameRules rules = game.getRules();
				rules.toString();
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeGamesList(GamesList gamesList) {
		gamesList.addGame("Small Game",
				new FootballRules("90", "5", "100", "2"));
		gamesList.addGame("Short Game",
				new FootballRules("45", "11", "150", "4"));
		gamesList.addGame("Standard Game",
				new MOBARules("90", "11", "150", "4"));
		gamesList.addGame("Long Game",
				new MMORPGRules("120", "11", "150", "6"));
		gamesList.addGame("Fast Game",
				new MOBARules("20", "5", "70", "1"));
		gamesList.addGame("Street Game",
				new MMORPGRules("20", "4", "50", "0"));
	}
}
