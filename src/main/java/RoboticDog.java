
public class RoboticDog extends RoboticPet {

	int amount = 20;
	
	public RoboticDog(String petName, String description, int health, int happiness, int RUST_LEVEL) {
		super(petName, description, health, happiness, RUST_LEVEL);
		// TODO Auto-generated constructor stub
	}

	public void walkRoboticDog() {
		happiness += amount;
		health += amount;
		
	
}
}
