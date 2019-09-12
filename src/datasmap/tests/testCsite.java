package datasmap.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datasmap.models.Capplication;
import datasmap.models.Cplace;
import datasmap.models.Csite;

class testCsite {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCsiteStringStringCplace() {
		Cplace place0 =new Cplace("France", 0.001, -0.0031);
		Cplace place1 =new Cplace("Caen", 0.0011, -0.0032, place0);
		Cplace place2 =new Cplace("Place Wurzburg", 0.00111, -0.0033, place1);
		Cplace place3 =new Cplace("1", 0.0011, -0.0030, place2);
		Csite site =new Csite("Lycée sainte Ursule", "un p***** de lycée qui ne sait pas faire des tables a bonne hauteur", place3);
		assertEquals(place3, site.getPlace());
	}

	@Test
	void testCsiteStringStringString() {
		Capplication.loadDeafaultPlaces();
		Cplace place0 =new Cplace("France", 0.001, -0.0031);
		Cplace place1 =new Cplace("Caen", 0.0011, -0.0032, place0);
		Cplace place2 =new Cplace("Place Wurzburg", 0.00111, -0.0033, place1);
		Cplace place3 =new Cplace("1", 0.0011, -0.0030, place2);
		Csite site =new Csite("Lycée sainte Ursule", "un p***** de lycée", "1, Place Wurzburg, Caen, France");
		assertEquals(place3.getAdress(), site.getPlace().getAdress());
	}

	@Test
	void testCsiteStringStringDoubleDouble() {
		Capplication.loadDeafaultPlaces();
		Cplace place0 =new Cplace("France", 0.001, -0.0031);
		Cplace place1 =new Cplace("Caen", 0.0011, -0.0032, place0);
		Cplace place2 =new Cplace("Place Wurzburg", 0.00111, -0.0033, place1);
		Cplace place3 =new Cplace("1", 0.0011, -0.0030, place2);
		Csite site =new Csite("Lycée sainte Ursule", "un p***** de lycée", place3.getLatitude(), place3.getLongitude());
		assertEquals(place3.getAdress(), site.getPlace().getAdress());
	}

}
