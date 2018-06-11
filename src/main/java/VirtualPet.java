
public class VirtualPet {

	private String name;
	private String description;
	protected static int health;
	protected static int happiness;

	public VirtualPet(String name, String description, int health, int happiness) {
		this.name = name;
		this.description = description;
		VirtualPet.health = health;
		VirtualPet.happiness = happiness;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public static void petPlaying() {
		health += 5;
		happiness += 25;

	}

}
