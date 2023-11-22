public class MMORPGRules extends GameRules{
	private String maxLevel;
	private String numberOfTowns;
	private String mapSize;
	private String inventorySize;
	
	public MMORPGRules(String maxLevel, String numberOfTowns, String mapSize,
						 String inventorySize) {
		this.maxLevel = maxLevel;
		this.numberOfTowns = numberOfTowns;
		this.mapSize = mapSize;
		this.inventorySize = inventorySize;
	}
	
	@Override
	public boolean matches(String ruleName, String rule) {
		switch (ruleName) {
			case "maxLevel":
				return (maxLevel.equals(rule));
			case "numberOfTowns":
				return (numberOfTowns.equals(rule));
			case "mapSize":
				return (mapSize.equals(rule));
			case "inventorySize":
				return (inventorySize.equals(rule));
			default:
				return false;
		}
	}
	@Override
	public String toString(){
		return "maxLevel: " + maxLevel + " and numberOfTowns: " + numberOfTowns + 
				" and inventorySize: " + inventorySize + " and mapSize: " + mapSize;
	}

} 