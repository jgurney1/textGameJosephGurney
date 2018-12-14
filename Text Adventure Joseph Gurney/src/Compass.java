
public class Compass {

	private int distance;
	private int danger;
	
	public int findDistance(int playerxPos, int playeryPos, int treasureX, int treasureY) {
		this.distance =0;
		if (playerxPos > treasureX) {
			setDistance(distance + (playerxPos - treasureX));
		}
		else {
			setDistance(distance + (treasureX - playerxPos));
		}
		if (playeryPos > treasureY) {
			setDistance(distance + (playeryPos - treasureY));
		}
		else {
			setDistance(distance + (treasureY - playeryPos));
		}
		
		if (distance == 0) {
			System.out.println("You found the treasure well done!");
		}
		
		return distance;
	}
	
	public int checkDanger(int playerxPos, int playeryPos, int trapx, int trapy) {
		this.danger=0;
		if (playerxPos > trapx) {
			setDanger(danger + (playerxPos - trapx));
		}
		else {
			setDanger(danger + (trapx - playerxPos));
		}
		if (playeryPos > trapy) {
			setDanger(danger + (playeryPos - trapy));
		}
		else {
			setDanger(danger + (trapy - playeryPos));
		}
		if (danger == 0) {
			System.out.println("You fell into a trap! GAME OVER");
		}
		return danger;
	}
	
	public int getDanger() {
		return danger;
	}
	
	public void setDanger(int danger) {
		this.danger = danger;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
