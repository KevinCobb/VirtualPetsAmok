import java.util.Random;
import java.util.Scanner;

public class VirtualPetsAmokAPP {

	static Scanner input = new Scanner(System.in);
	VirtualPetShelter VirtualPetsAmok = new VirtualPetShelter();

	public static void main(String[] args) {
		Random random = new Random();
		int continueAdmit;
		Boolean continueWithApp = true;

		VirtualPet Binky = new OrganicCat("*Organic Cat* Binky", " Black and grey fluffy", 90, 76, 66, 56);

		VirtualPet Frannie = new OrganicCat("*Organic Cat* Frannie", " White and grey short hair", 90, 77, 81, 74);

		VirtualPet Fido = new OrganicDog("*Organic Dog* Fido", " Black labrador", 90, random.nextInt(100),
				random.nextInt(90) + 2, random.nextInt(100) + 1, random.nextInt(100) - 2);

		VirtualPet Scruffy = new OrganicDog("*Organic Dog* Scruffy", " Brown shaggy small dog", 90,
				random.nextInt(100) + 1, random.nextInt(79) + 1, random.nextInt(100) + 1, random.nextInt(100) - 2);

		VirtualPet Moxie = new RoboticCat("*Robotic cat* Moxie", " All chrome medium sized", 100,
				random.nextInt(100) + 1, random.nextInt(100) + 1);

		VirtualPet Maxer = new RoboticCat("*Robotic cat* Maxer", " BlackChrome larger sized", 100,
				random.nextInt(100) + 1, random.nextInt(100) + 1);

		VirtualPet Electro = new RoboticDog("*Robotic Dog* Electro", " White metal bulldog replica", 100,
				random.nextInt(100) + 1, random.nextInt(100) + 1);

		VirtualPet Buzzy = new RoboticDog("*Robotic Dog* Buzzy", " Silver hyper small sized", 100,
				random.nextInt(100) + 1, random.nextInt(100) + 1);

		VirtualPetShelter.addPet(Binky);
		VirtualPetShelter.addPet(Frannie);
		VirtualPetShelter.addPet(Fido);
		VirtualPetShelter.addPet(Scruffy);
		VirtualPetShelter.addPet(Moxie);
		VirtualPetShelter.addPet(Maxer);
		VirtualPetShelter.addPet(Electro);
		VirtualPetShelter.addPet(Buzzy);

		System.out.println("\n Welcome to the WCCI pet shelter and moritorium\n");

		while (continueWithApp = true) {

			System.out.println("Here are all the ORGANIC pets currently at our shelter and their current status:\n");
			System.out.println("Name \t\t\t|Health |Happiness |Hunger |Thirst |Cage Cleanliness");
			for (VirtualPet availablePets : VirtualPetShelter.getpets()) {
				if (availablePets instanceof OrganicCat) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealth() + "\t|"
							+ availablePets.getHappiness() + "\t   |" + ((OrganicCat) availablePets).getHunger()
							+ "\t   |" + ((OrganicCat) availablePets).getThirst() + "\t   |");
				}
			}
			for (VirtualPet availablePets : VirtualPetShelter.getpets()) {
				if (availablePets instanceof OrganicDog) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealth() + "\t|"
							+ availablePets.getHappiness() + "\t   |" + ((OrganicDog) availablePets).getHunger()
							+ "\t   |" + ((OrganicDog) availablePets).getThirst() + "\t   |"
							+ ((OrganicDog) availablePets).getWaste());
				}
			}

			System.out.println("\n Here are all the ROBOTIC pets currently at our shelter and their current status:\n");
			System.out.println("       Name \t\t|Description \t\t\t|Health |Happiness |Rust Level");
			for (VirtualPet availablePets : VirtualPetShelter.getpets()) {
				if (availablePets instanceof RoboticPet) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getDescription() + "\t|"
							+ availablePets.getHealth() + "\t|" + availablePets.getHappiness() + "\t   |"
							+ ((RoboticPet) availablePets).getRUST_LEVEL());

				}
			}
			System.out.println(
					"\nThe communal organic cats litterbox level: " + "" + VirtualPetShelter.getLitterBoxWasteLevel());

			System.out.println("\n Please choose an Option\n");

			amokOptions();

			String userInput = input.nextLine();

			switch (userInput) {

			case "1":
				System.out.println("\n Feeding.... ");
				VirtualPetShelter.feedAllOrganicPets();
				System.out.println("\n Ok feeding all done. Thanks! \n");
				break;

			case "2":
				System.out.println("\n Watering....");
				VirtualPetShelter.WaterAllOrganicPets();
				System.out.println("\n Ok all pets have fresh water. Thanks! \n");
				break;

			case "3":
				System.out.println("\n Walking all the dogs...............");
				VirtualPetShelter.WalkAllDogs();
				System.out.println("\n Dogs walked and now in a happier state!\n");
				break;

			case "4":
				System.out.println("\n Cleaning all dog cages..................");
				VirtualPetShelter.CleanOrganicDogCages();
				System.out.println("\n All dog cages are a bit cleaner now. Which is good for dog health\n");
				break;

			case "5":
				System.out.println("\n Cleaning the organic cats' communal litter box........................");
				VirtualPetShelter.EmptyLitterBox();
				System.out.println("\n The litter box is now fresh and clean. The felines are eying it...\n");
				break;

			case "6":
				System.out.println("\n Providing maintenance and re-oiling to all the robotic pets.......\n");
				VirtualPetShelter.oilRoboticPets();
				System.out.println("\n All robotic pets in pefect working order again");
				break;

			case "7":

				do {
					System.out.println("Please provide the name of the pet you wish to admit into the shelter:");
					String newAdmitName = input.nextLine();
					while (newAdmitName.length() > 8) {
						System.out.println("Please enter a name less than 8 characters long");
					}
					System.out.println("Ok now please enter a short description of this animal");
					String newAdmitDesc = input.nextLine();

					System.out.println(
							"Now please select what type of pet is this? \n Choose 1 for Organic Cat\n Choose 2 for Organic Dog"
									+ "\n Choose 3 for Robotic Cat\n Choose 4 for Robotic Dog");
					String newTypePet = input.nextLine();
					if (newTypePet.equals("1")) {
						VirtualPetShelter
								.addPet(new OrganicCat("*OrganicCat* " + newAdmitName, newAdmitDesc, 67, 48, 61, 55));
					} else if (newTypePet.equals("2")) {
						VirtualPetShelter.addPet(
								new OrganicDog("*OrganicDog* " + newAdmitName, newAdmitDesc, 60, 44, 56, 77, 50));
					} else if (newTypePet.equals("3")) {
						VirtualPetShelter
								.addPet(new RoboticCat("*RoboticCat* " + newAdmitName, newAdmitDesc, 50, 50, 50));
					} else {
						VirtualPetShelter
								.addPet(new RoboticDog("*RoboticDog* " + newAdmitName, newAdmitDesc, 80, 60, 70));
					}

					System.out.println("Would you like to admit another animal? Choose 1 for yes, or 2 for no");
					continueAdmit = input.nextInt();
				} while (continueAdmit == 1);
				System.out.println("\n");
				break;

			case "9":
				System.out.println("You are now leaving the shelter. Thanks for visiting.");
				System.exit(0);
				break;

			case "10":
				System.out.println("Which pet would you like to play with?");
				String playPetChosen = input.nextLine();
				VirtualPetShelter.getAPet(playPetChosen).petPlaying();
				;
				System.out.println("You played with " + playPetChosen);

			}
			OrganicPet.organicShelterTick();
			RoboticPet.roboticShelterTick();

		}

		input.close();
	}

	public static void amokOptions() {
		System.out.println("Press 1. To feed all the organic pets\n" + "Press 2. To water all the organic pets\n"
				+ "Press 3. To take the dogs for a walk\n" + "Press 4. To clean the dog cages\n"
				+ "Press 5. To clean the organic cat's litter box\n" + "Press 6. To oil the robotic pets\n"
				+ "Press 7. To admit a new pet\n" + "Press 8. To adopt a pet from our shelter\n"
				+ "Press 9. To leave the shelter\n" + "Press 10. To play with a pet individually. ");

	}

}
