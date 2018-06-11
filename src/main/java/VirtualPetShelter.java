import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	static int litterBox = 50;

	static Map<String, VirtualPet> pets = new HashMap<>();

	public static Collection<VirtualPet> getpets() {
		return pets.values();
	}

	public static void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);

	}

	public int getPetCount() {
		return pets.size();
	}

	public void removePet(VirtualPet pet) {
		pets.remove(pet.getName(), pet);
	}

	public static VirtualPet getAPet(String pet) {
		return pets.get(pet);
	}

	public static void adoptPet(String petName) {
		pets.remove(petName);
	}

	public static void feedAllOrganicPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).FeedPet();
			}
		}
	}

	public static void WaterAllOrganicPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).waterPet();
			}
		}
	}

	public static void WalkAllDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).walkOrganicDog();
			} else if (pet instanceof RoboticDog) {
				((RoboticDog) pet).walkRoboticDog();
			} else {
			}

		}

	}

	public static void CleanOrganicDogCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicPet) pet).cleanedOrganicCages();
			}
		}
	}

	public static void EmptyLitterBox() {
		litterBox = -28;
	}

	public static void oilRoboticPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboticDog || pet instanceof RoboticCat) {
				((RoboticPet) pet).ServiceRoboticPet();
			}
		}
	}

	public static int getLitterBoxWasteLevel() {
		return litterBox;

	}

	public int getSize() {
		return 0;
	}
}
