package datasmap.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datasmap.models.Cplace;

class testCplace {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCplaceStringDoubleDouble() {
		Cplace pCplace =new Cplace("bla", 0.001, -0.003);
		assertNull(pCplace.getParent());
		assertEquals("bla", pCplace.getAdress());
	}

	@Test
	void testCplaceStringDoubleDoubleCplace() {
		Cplace place0 =new Cplace("France", 0.001, -0.003);
		Cplace place1 =new Cplace("Caen", 0.001, -0.003, place0);
		Cplace place2 =new Cplace("Place Wurzburg", 0.001, -0.003, place1);
		Cplace place3 =new Cplace("1", 0.001, -0.003, place2);
		assertNotNull(place3.getParent());
		assertEquals("France", place0.getAdress());
		assertEquals("Caen, France", place1.getAdress());
		assertEquals("Place Wurzburg, Caen, France", place2.getAdress());
		assertEquals("1, Place Wurzburg, Caen, France", place3.getAdress());
		assertEquals("1, Place Wurzburg", place3.getAdress(-3));
	}

}
