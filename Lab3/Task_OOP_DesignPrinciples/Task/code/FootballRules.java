public class FootballRules extends GameRules{
	private String matchDuration;
	private String teamSize;
	private String fieldSize;
	private String refereesCount;
	
	public FootballRules(String matchDuration, String teamSize, String fieldSize,
						 String refereesCount) {
		this.matchDuration = matchDuration;
		this.teamSize = teamSize;
		this.fieldSize = fieldSize;
		this.refereesCount = refereesCount;
	}
	
	@Override
	public boolean matches(String ruleName, String rule) {
		
		switch (ruleName) {
			case "matchDuration":
				return (matchDuration.equals(rule));
			case "teamSize":
				return (teamSize.equals(rule));
			case "fieldSize":
				return (fieldSize.equals(rule));
			case "refereesCount":
				return (refereesCount.equals(rule));
			default:
				return false;
		}
	}
	@Override
	public String toString(){
		return "matchDuration: " + matchDuration + " and teamSize: " + teamSize + 
				" and fieldSize : " + fieldSize + " and refereesCount: " + refereesCount;
	}

}
