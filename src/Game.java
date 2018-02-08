
public class Game {
	public int n = 0; //number of dimensions of the game.
	public Grid gameGrid = new Grid();
	int playerTurn; //The player whose turn it is
	Game(int n){
		this.n = n;
		if(n==1) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					gameGrid.grid[i][j] = new TicPix();
				}
			}	
		}
		if(n==2) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					gameGrid.grid[i][j] = new Grid();
					for (int k = 0; k < 3; k++) {
						for (int l = 0; l < 3; l++) {
							//gameGrid.grid[i][j].grid[k][l] = new TicPix(); << referring to the grid within the other grid doesn't work
							//the type Possession can't have child grids
							//the actual data is stored, but how do I access it?
						}
					}
				}
			}
		}
		playerTurn = 1;
	}
	public boolean gameWon() {
		if(gameGrid.getPossession() > 0) return true;
		return false;
	}
	public String getVictor() {
		if(gameGrid.getPossession()==1) return "Player one (X)";
		else if(gameGrid.getPossession()==2) return "Player two (O)";
		return null;
	}
	public void switchPlayer() {
		if(playerTurn==1) playerTurn=2;
		else playerTurn=1;
	}
	public void turn(Possessable temp) {
		if(!temp.getChanged()) {
			temp.setPossession(playerTurn);
			switchPlayer();
		}else {}
	}
}