package assign1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

public class TetrisGridTest {
	
	// Provided simple clearRows() test
	// width 2, height 3 grid
	@Test
	public void testClear1() {
		boolean[][] before = {	
			{true, true, false, },
			{false, true, true, }
		};
		
		boolean[][] after = {	
			{true, false, false},
			{false, true, false}
		};
		
		TetrisGrid tetris = new TetrisGrid(before);
		tetris.clearRows();

		assertTrue( Arrays.deepEquals(after, tetris.getGrid()) );
	}
	
	@Test
    public void testClear2() {
        boolean[][] before = {  
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false}
        };
       
        boolean[][] after = {  
        	{false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false}
        };
       
        TetrisGrid tetris = new TetrisGrid(before);
        tetris.clearRows();
        assertTrue( Arrays.deepEquals(after, tetris.getGrid()) );
    }

    @Test
    public void testClear3() {
        boolean[][] before = {  
            {true, true, true, true, true},
            {true, true, true, true, true},
            {true, true, true, true, true},
            {true, true, true, true, true},
            {true, true, true, true, true}
        };
       
        boolean[][] after = {  
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false}
        };
       
        TetrisGrid tetris = new TetrisGrid(before);
        tetris.clearRows();
 
        assertTrue( Arrays.deepEquals(after, tetris.getGrid()) );
       
       
        boolean[][] before1 = {  
            {true, true, true, true, true, true},
            {true, true, true, true, true, true}
        };
           
        boolean[][] after1 = {  
            {false, false, false, false, false, false},
            {false, false, false, false, false, false}
        };
           
        TetrisGrid tetris1 = new TetrisGrid(before1);
        tetris1.clearRows();
 
        assertTrue( Arrays.deepEquals(after1, tetris1.getGrid()) );
    }
	
}
