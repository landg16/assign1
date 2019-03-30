//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.
package assign1;

public class TetrisGrid {
	private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		for(int i = 0; i<grid[0].length; i++){
			boolean toDelete = true;
			for(int j = 0; j<grid.length; j++){
				if(!grid[j][i]) toDelete = false;
			}
			if(toDelete){
				deleteRow(i);
				i--;
			}
		}
	}
	
	private void deleteRow(int row){
		for(int i = row; i<grid[0].length; i++){
			for(int j = 0; j<grid.length; j++){
				if(i == grid[0].length-1) grid[j][i] = false;
				else grid[j][i] = grid[j][i+1];
			}
		}
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid;
	}
}
