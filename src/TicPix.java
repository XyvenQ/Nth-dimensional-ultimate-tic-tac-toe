
public class TicPix implements Possessable{
	private int possession;
	public boolean changed;
	TicPix(){
		possession=0;
	}
	TicPix(int possession){
		this.possession=possession;
	}
	public void setPossession(int temp) {
		if(!changed) {
			possession=temp;
			changed=true;
		}
	}
	public int getPossession() {
		return possession;
	}
	public boolean getChanged() {
		return changed;
	}
	public String toString() {
		if (possession == 1) return "X";
		else if(possession==2) return "O";
		return "*";
	}
	public boolean isGrid() {
		return false;
	}
}

