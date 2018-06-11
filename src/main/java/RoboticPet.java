public class RoboticPet extends VirtualPet {

	private static int RUST_LEVEL;

	public RoboticPet(String petName, String description, int health, int happiness, int RUST_LEVEL) {
		super(petName, description, health, happiness);
		RoboticPet.RUST_LEVEL = RUST_LEVEL;
	}

	public int getRUST_LEVEL() {
		return RUST_LEVEL;
	}

	public void ServiceRoboticPet() {
		RUST_LEVEL -= 10;

	}

	public static void roboticShelterTick() {
		health -= 5;
		happiness -= 5;
		RUST_LEVEL += 3;

	}

}