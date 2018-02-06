
public class Grid implements Possessable{
	public boolean type;
	public int possession;
	public Possessable[][] grid;
	Grid() {
		possession = 0;
		grid = new Possessable[3][3];
	}
	public int checkGrid() {
		for(int i = 0; i<3; i++) {
			if(grid[i][0].getPossession()==1 && grid[i][1].getPossession()==1 && grid[i][2].getPossession()==1) possession=1;
			else if(grid[i][0].getPossession()==2 && grid[i][1].getPossession()==2 && grid[i][2].getPossession()==2) possession=2;
		}
		for(int i = 0; i<3; i++) {
			if(grid[0][i].getPossession()==1 && grid[1][i].getPossession()==1 && grid[2][i].getPossession()==1) possession=1;
			else if(grid[0][i].getPossession()==2 && grid[1][i].getPossession()==2 && grid[2][i].getPossession()==2) possession=2;
		}
		if(grid[0][0].getPossession()==1 && grid[1][1].getPossession()==1 && grid[2][2].getPossession()==1) possession=1;
		if(grid[0][0].getPossession()==2 && grid[1][1].getPossession()==2 && grid[2][2].getPossession()==2) possession=2;
		if(grid[2][0].getPossession()==1 && grid[1][1].getPossession()==1 && grid[0][2].getPossession()==1) possession=1;
		if(grid[2][0].getPossession()==2 && grid[1][1].getPossession()==2 && grid[0][2].getPossession()==2) possession=2;
		return possession;
	}
	public int getPossession() {
		checkGrid();
		return possession;
	}
	public boolean isGrid() {
		return true;
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				temp += grid[j][i] +" ";
			}
			temp += "\n";
		}
		return temp;
	}
	@Override
	public boolean getChanged() {
		return false;
	}	
	public void setPossession(int i) {
		
	}
}
/*
 * What can grid do?
 * store a grid of grids
 * store a grid of TicPix
 * be claimed or not claimed
 * 
 */
