
public abstract class NormalLoc extends Location {

	protected NormalLoc(Player player,String locationName) {
		super(player);
	    this.locationName=locationName;
	}
	
	public boolean getLocation()
	{
		return true;
	}

}
