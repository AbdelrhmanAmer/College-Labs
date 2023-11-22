package game.impl;

import game.interfaces.Rules;

public class FootballRules implements Rules {
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
	
	public String getMatchDuration() {
		return matchDuration;
	}
	
	public void setMatchDuration(String matchDuration) {
		this.matchDuration = matchDuration;
	}
	
	public String getTeamSize() {
		return teamSize;
	}
	
	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}
	
	public String getFieldSize() {
		return fieldSize;
	}
	
	public void setFieldSize(String fieldSize) {
		this.fieldSize = fieldSize;
	}
	
	public String getRefereesCount() {
		return refereesCount;
	}
	
	public void setRefereesCount(String refereesCount) {
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
	public String toString() {
		return "duration: " + matchDuration + " and field size: " + fieldSize +
				" and referees count: " + refereesCount + " and team size: " + teamSize;
	}
}
