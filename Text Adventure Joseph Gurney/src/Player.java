
public class Player {

	private String direction;

	public Player() {
	}

	public int moveVerticle(int yPos) {

		if (direction.equals("NORTH") && yPos >= 0) {
			yPos -= 1;
		} else if (direction.equals("SOUTH") && yPos < 10) {
			yPos += 1;
		} else {
			System.out.println("You have hit some kind of invisible wall");
			return yPos;
		}
		return yPos;
	}

	public int moveHorizontal(int xPos) {
		if (direction.equals("EAST") && xPos < 10) {
			xPos -= 1;
		} else if (direction.equals("WEST") && xPos >= 0) {
			xPos += 1;
		} else {
			System.out.println("You have hit some kind of invisible wall");
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
