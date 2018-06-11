
public class OrganicDog extends OrganicPet {

	int amount = 10;
	
	public OrganicDog(String name, String description, int health, int happiness, int thirst, int hunger, int waste) {
		super(name, description, health, happiness, thirst, hunger);
		OrganicDog.waste = waste;
	}

	public void walkOrganicDog() {
		happiness += amount;
		health += 10;
		thirst += 5;
		waste -= 20;
		
	}

}
