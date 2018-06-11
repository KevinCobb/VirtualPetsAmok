import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetTest {

	VirtualPet newpet = new VirtualPet("testpet", "Odog", 10, 10);

	@Test

	public void shouldShowPetHappiness() {
		// Arrange
		int underTest = newpet.getHappiness();

		// Assert
		assertThat(underTest, is(equalTo(10)));
	}

	@Test
	public void shouldShowPetHealth() {
		int underTest = newpet.getHealth();

		assertThat(underTest, is(equalTo(10)));
	}

	@Test
	public void testIfRoboticCatWasAdded() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(new RoboticCat(null, null, 0, 0, 0));
		int check = underTest.getSize();
		assertEquals(1, check);
	}

	@Test
	public void testIfAllOrganicPetsAreFed() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(new OrganicCat("1", null, 0, 0, 0, 0));
		underTest.addPet(new OrganicDog("2", null, 0, 0, 0, 0, 0));
		underTest.feedAllOrganicPets();
		OrganicCat getPet = (OrganicCat) underTest.getAPet("1");
		int check = getPet.getHunger();
		OrganicDog getPet2 = (OrganicDog) underTest.getAPet("2");
		int check2 = getPet2.getHunger();
		assertEquals(check, 50);
		assertEquals(check2, 50);
	}

}
