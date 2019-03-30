// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

package assign1;

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int x1 = 0,x2 = 0,y1 = 0,y2 = 0;
		boolean isFirst = false;
		for(int i = 0; i<grid.length; i++){
			for(int j = 0; j<grid[0].length; j++){
				if(grid[i][j] == ch){
					if(!isFirst){
						x1 = x2 = i;
						y1 = y2 = j;
						isFirst = true;
					} else {
						if(x1>i) x1 = i;
						if(x2<i) x2 = i;
						if(y1>j) y1 = j;
						if(y2<j) y2 = j;
					}
				}
			}
		}
		if(isFirst){
			return (x2-x1+1)*(y2-y1+1);
		}
		return 0;
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int count = 0;
		for(int i = 0; i<grid.length; i++){
			for(int j = 0; j<grid[0].length; j++){
				if(isPlus(i, j, grid[i][j])) count++;
			}
		}
		return count;
	}
	
	private boolean isPlus(int i, int j, char c){
		int size = 0;
		int up = i;
		//goUp
		while(true){
			up--;
			if(up>=0 && grid[up][j]==c){
				size ++;
			} else break;
		}
		if(size == 0) return false;
		
		//goDown
		for(int p = 1; p<=size; p++){
			if(p+i>=grid.length || grid[p+i][j] != c){
				return false;
			}
		}
		
		if(size+i+1 < grid.length && grid[size+i+1][j] == c){
			return false;
		}
		
		//goLeft'nRight
		for(int p = 1; p<=size; p++){
			if(p+j>=grid[0].length || j-p<0 || grid[i][j+p] != c || grid[i][j-p] != c){
				return false;
			}
		}
		if(size+j+1 < grid[0].length && grid[i][size+j+1] == c){
			return false;
		}
		if(j-size-1 > 0 && grid[i][j-size-1] == c){
			return false;
		}
		return true;
	}
	
}
