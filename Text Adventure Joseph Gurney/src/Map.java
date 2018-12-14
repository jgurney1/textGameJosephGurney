
public class Map {

	private int treasurexLoc;
	private int treasureyLoc;
	private int playerxPos = 4;
	private int playeryPos = 4;
	private int trapx;
	private int trapy;

	public Map(int xloc, int yloc, int trapx, int trapy) {
		this.setTreasurexLoc(xloc);
		this.setTreasureyLoc(yloc);
		this.setTrapx(trapx);
		this.setTrapy(trapy);
	}

	public void addTraps(int trapx, int trapy) {

	}

	public int getTrapy() {
		return trapy;
	}

	public void setTrapy(int trapy) {
		this.trapy = trapy;
	}

	public void setTrapx(int trapx) {
		this.trapx = trapx;
	}

	public int getTrapx() {
		return trapx;
	}

	public void setPlayerxPos(int playerxPos) {
		this.playerxPos = playerxPos;
	}

	public int getPlayerxPos() {
		return playerxPos;
	}

	public void setPlayeryPos(int playeryPos) {
		this.playeryPos = playeryPos;
	}

	public int getPlayeryPos() {
		return playeryPos;
	}

	public int getTreasurexLoc() {
		return treasurexLoc;
	}

	public void setTreasurexLoc(int treasurexLoc) {
		this.treasurexLoc = treasurexLoc;
	}

	public int getTreasureyLoc() {
		return treasureyLoc;
	}

	public void setTreasureyLoc(int treasureyLoc) {
		this.treasureyLoc = treasureyLoc;
	}

}
