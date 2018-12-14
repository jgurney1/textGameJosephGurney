
public class Player {

	private String direction;
	

	public Player() {
	}
	
	public int moveVerticle(int yPos) {
		if (direction.equals("NORTH")) {
			yPos -= 1;
		}
		else if (direction.equals("SOUTH")) {
			yPos += 1;
		}
		return yPos;
	}
	public int moveHorizontal(int xPos) {
		if (direction.equals("EAST")) {
			xPos -= 1;
		}
		else if (direction.equals("WEST")) {
			xPos += 1;
		}
		return xPos;
	}
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
}
