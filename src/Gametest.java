
public class Gametest {
	private static Game game1 = new Game(2);
	public static void main(String[] args) {
		System.out.println(game1.gameGrid.grid[1][2]);
//		for (int i = 0; i < 9; i++) {
//			if(game1.gameWon()) break; 
//			int temp1 = (int)(Math.random() * 3);
//			int temp2 = (int)(Math.random() * 3);
//			while(game1.gameGrid.grid[temp1][temp2].getChanged()) {
//				temp1 = (int)(Math.random() * 3);
//				temp2 = (int)(Math.random() * 3);
//			}
//			game1.turn(game1.gameGrid.grid[temp1][temp2]);
//			System.out.println(game1.gameGrid);
//		}
//		 if(game1.gameWon()) {
//			 System.out.println(game1.getVictor());
//		 }
	}
}
