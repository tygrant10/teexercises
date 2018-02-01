package com.techelevator;		//create a brand new fruit tree for every single test.  so create instance variable. line (10)

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {
	
	private FruitTree tree;

	@Before
	public void setUp() throws Exception {
		tree = new FruitTree("Apple", 10); //Arrange....this is called every time before these tests.(creates brand new fruit tree)
	}

	@Test
	public void testFruitTree() {
		assertNotNull(tree);
	}

	@Test
	public void testGetTypeOfFruit() {
		assertEquals("Apple", tree.getTypeOfFruit());
	}

	@Test
	public void testGetPiecesOfFruitLeft() {
		assertEquals(10, tree.getPiecesOfFruitLeft());
	}

	@Test
	public void testPickFruitDoesNotAllowNegatives() {
		boolean result = tree.pickFruit(-1); //Act
		assertEquals(false, result);
		assertEquals(10, tree.getPiecesOfFruitLeft());
	}

}
