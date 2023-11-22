public class MOBARules extends GameRules{
	private String lanesCount;
	private String teamSize;
	private String mapSize;
	private String championsCount;
	
	public MOBARules(String lanesCount, String teamSize, String mapSize,
						 String championsCount) {
		this.lanesCount = lanesCount;
		this.teamSize = teamSize;
		this.mapSize = mapSize;
		this.championsCount = championsCount;
	}
	@Override
	public boolean matches(String ruleName, String rule) {
		
		switch (ruleName) {
			case "lanesCount":
				return (lanesCount.equals(rule));
			case "teamSize":
				return (teamSize.equals(rule));
			case "mapSize":
				return (mapSize.equals(rule));
			case "championsCount":
				return (championsCount.equals(rule));
			default:
				return false;
		}
	}
	@Override
	public String toString(){
		return "lanesCount: " + lanesCount + " and teamSize: " + teamSize + 
				" and mapSize: " + mapSize + " and championsCount: " + championsCount;
	}
} 