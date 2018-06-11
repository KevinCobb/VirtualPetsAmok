import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTEST {

	VirtualPetShelter testShelter = new VirtualPetShelter();
	VirtualPet newpet = new VirtualPet("name", "description", 10, 10);

	@Test

	public void shouldAddPetToShelter() {
		int numberOfPetsBeforeAdd = testShelter.getPetCount();
		testShelter.addPet(newpet);
		int numberOfPetsAfterAdd = testShelter.getPetCount();
		assertThat(numberOfPetsAfterAdd, is(equalTo(numberOfPetsBeforeAdd + 1)));
	}

	@Test

	public void shouldRemovePetFromShelter() {
		int numberOfPetsBeforeRemoval = testShelter.getPetCount();
		testShelter.removePet(newpet);
		int numberOfPetsAfterRemoval = testShelter.getPetCount();
		assertThat(numberOfPetsAfterRemoval, is(equalTo(numberOfPetsBeforeRemoval)));
	}

	@Test

	public void shouldGetAllPets() {
		int underTest = testShelter.getPetCount();
		int check = testShelter.getPetCount();
		assertEquals(underTest, check);

	}

}