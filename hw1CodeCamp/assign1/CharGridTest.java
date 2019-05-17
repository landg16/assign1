// Test cases for CharGrid -- a few basic tests are provided.
package assign1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CharGridTest {
	
	@Test
	public void testCharArea1() {
		char[][] grid = new char[][] {
				{'a', 'y', ' '},
				{'x', 'a', 'z'},
			};
		
		
		CharGrid cg = new CharGrid(grid);
				
		assertEquals(4, cg.charArea('a'));
		assertEquals(1, cg.charArea('z'));
		assertEquals(0, cg.charArea('9'));
	}
	
	
	@Test
	public void testCharArea2() {
		char[][] grid = new char[][] {
				{'c', 'a', ' '},
				{'b', ' ', 'b'},
				{' ', ' ', 'a'}
			};
		
		CharGrid cg = new CharGrid(grid);
		
		assertEquals(6, cg.charArea('a'));
		assertEquals(3, cg.charArea('b'));
		assertEquals(1, cg.charArea('c'));
	}
	
	@Test
	public void testCharArea3() {
		char[][] grid = new char[][] {
				{'a', 'a', 'a', 'a', 'a'},
				{'b', ' ', ' ', 'b', ' '},
				{'c', ' ', '%', 'c', 'a'}
			};
		
		
		CharGrid cg = new CharGrid(grid);
	
		assertEquals(15, cg.charArea('a'));
		assertEquals(4, cg.charArea('b'));
		assertEquals(1, cg.charArea('%'));
		assertEquals(4, cg.charArea('b'));
	}

	@Test
	public void testCharArea4() {
		char[][] grid = new char[][] {
				{'a', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', 'a'}
		};


		CharGrid cg = new CharGrid(grid);

		assertEquals(9, cg.charArea('a'));
		assertEquals(9, cg.charArea(' '));
	}

	@Test
	public void testCharArea5() {
		char[][] grid = new char[][] {
				{' ', ' ', 'y', ' ', ' '}
		};


		CharGrid cg = new CharGrid(grid);

		assertEquals(1, cg.charArea('y'));
		assertEquals(5, cg.charArea(' '));
	}

	@Test
	public void testPlusFind1() {
		char[][] grid = new char[][] {
				{' ', ' ', 'p', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', 'p', ' ', ' ', ' ', ' ', 'x', ' '},
				{'p', 'p', 'p', 'p', 'p', ' ', 'x', 'x', 'x'},
				{' ', ' ', 'p', ' ', ' ', 'y', ' ', 'x', ' '},
				{' ', ' ', 'p', ' ', 'y', 'y', 'y', ' ', ' '},
				{'z', 'z', 'z', 'z', 'z', 'y', 'z', 'z', 'z'},
				{' ', ' ', 'x', 'x', ' ', 'y', ' ', ' ', ' '}
		};

		CharGrid cg = new CharGrid(grid);

		assertEquals(2, cg.countPlus());
	}

	@Test
	public void testPlusFind2() {
		char[][] grid = new char[][] {
				{' ', ' ', ' ', ' ', ' ', 'p'},
				{' ', ' ', 'p', ' ', ' ', 'p'},
				{' ', 'p', 'p', 'p', ' ', 'p'},
				{' ', ' ', 'p', ' ', ' ', 'p'},
				{' ', ' ', ' ', ' ', 'p', 'p'}
		};

		CharGrid cg = new CharGrid(grid);

		assertEquals(1, cg.countPlus());
	}

	@Test
	public void testPlusFind3() {
		char[][] grid = new char[][] {
				{' ', ' ', 'p', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', 'p', ' ', ' ', ' ', 'x', 'x', 'x'},
				{'p', 'p', 'p', 'p', 'p', ' ', 'x', 'x', 'x'},
				{' ', ' ', 'p', 'p', ' ', 'y', 'x', 'x', 'x'},
				{' ', ' ', 'p', ' ', 'y', 'y', 'y', ' ', ' '},
				{'z', 'z', 'z', 'z', 'y', 'y', 'z', 'z', 'z'},
				{' ', ' ', 'x', 'x', ' ', 'y', ' ', ' ', ' '}
		};

		CharGrid cg = new CharGrid(grid);

		assertEquals(2, cg.countPlus());
	}

	@Test
	public void testPlusFind4() {
		char[][] grid = new char[][] {
				{' ', ' ', 'p', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', 'p', 'y', ' ', ' ', 'x', 'x', 'x'},
				{'p', 'p', 'p', 'p', 'p', ' ', 'x', 'x', 'x'},
				{' ', ' ', 'p', 'p', ' ', 'y', 'x', 'x', 'x'},
				{' ', ' ', 'p', ' ', 'y', 'y', 'y', ' ', ' '},
				{'z', 'z', 'z', 'z', 'y', 'y', 'z', 'z', 'z'},
				{' ', ' ', 'x', 'x', ' ', 'y', ' ', ' ', ' '}
		};

		CharGrid cg = new CharGrid(grid);

		assertEquals(2, cg.countPlus());
	}

	@Test
	public void testPlusFind5() {
		char[][] grid = new char[][] {
				{' ', ' ', ' ', 'a', ' ', ' ', ' '},
				{' ', 'b', ' ', 'a', ' ', 'b', ' '},
				{' ', ' ', ' ', 'a', ' ', ' ', ' '},
				{'a', 'a', 'a', 'a', 'a', 'a', 'a'},
				{' ', ' ', ' ', 'a', ' ', ' ', ' '},
				{' ', 'b', ' ', 'a', ' ', 'b', ' '},
				{' ', ' ', ' ', 'a', ' ', ' ', ' '}
		};

		CharGrid cg = new CharGrid(grid);

		assertEquals(1, cg.countPlus());
	}

	@Test
	public void testPlusFind6() {
		char[][] grid = new char[][] {};
		CharGrid cg = new CharGrid(grid);
		assertEquals(0, cg.countPlus());
	}

	@Test
	public void testPlusFind7() {
		char[][] grid = new char[][] {
				{'x', 'x', 'x', ' '},
				{' ', 'x', ' ', ' '}
		};

		CharGrid cg = new CharGrid(grid);

		assertEquals(0, cg.countPlus());
	}

	@Test
	public void testcountPlus7() {
		char[][] grid = new char[][] {
				{'a', 'a', 'a', 'a', 'a', 'a', 'a'},
				{'a', 'a', 'a', 'a', 'a', 'a', 'a'},
				{'a', 'a', 'a', 'a', 'a', 'a', 'a'},
				{'a', 'a', 'a', 'a', 'a', 'a', 'a'},
				{'a', 'a', 'a', 'a', 'a', 'a', 'a'},
				{'a', 'a', 'a', 'a', 'a', 'a', 'a'},
				{'a', 'a', 'a', 'a', 'a', 'a', 'a'}
		};

		CharGrid cg = new CharGrid(grid);
		assertEquals(1, cg.countPlus());
	}
}
