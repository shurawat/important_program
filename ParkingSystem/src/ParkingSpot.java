
public abstract class ParkingSpot {

	private String number;
	private boolean free;
	private Vehicle vehicle;
	private final ParkingSpotType type;

	public boolean IsFree() {
		return free;
	}

	public ParkingSpot(ParkingSpotType type) {
		this.type = type;
	}

	public void assignVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		free = false;
	}

	public void removeVehicle() {
		this.vehicle = null;
		free = true;
	}
}

class LargeSpot extends ParkingSpot {
	  public LargeSpot() {
	    super(ParkingSpotType.LARGE);
	  }
	}
