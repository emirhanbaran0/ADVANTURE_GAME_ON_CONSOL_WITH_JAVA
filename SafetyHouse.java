
public class SafetyHouse extends NormalLoc {

	

	protected SafetyHouse(Player player, String locationName) {
		super(player, "Safety House");
		
	}

	@Override
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("->You are in Safety House.");
		System.out.print("->Your Health is Full.");		
		return true;
	}

}
