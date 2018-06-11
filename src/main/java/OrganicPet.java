public class OrganicPet extends VirtualPet {

	public static int hunger;
	public static int thirst;
	public static int waste;
	private int amount = 10;

	public OrganicPet(String name, String description, int health, int happiness, int thirst, int hunger) {
		super(name, description, health, happiness);
		OrganicPet.hunger = hunger;
		OrganicPet.thirst = thirst;

	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public void FeedPet() {
		hunger -= amount;
		health += 2;
		waste += 3;
		thirst += 4;
		happiness += 2;

	}

	public void waterPet() {
		hunger += 7;
		health += 2;
		waste += 3;
		thirst -= amount;
		happiness += 5;

	}

	public void cleanedOrganicCages() {
		happiness += amount;
		health += amount;
		waste -= 25;
	}

	public static void organicShelterTick() {
		health -= 5;
		happiness -= 5;
		waste += 10;
		hunger -= 10;
		thirst -= 8;
		VirtualPetShelter.litterBox += 12;

	}

}