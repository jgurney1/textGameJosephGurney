import java.util.Random;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		System.out.println("Hello and welcome to the Hunt!");
		System.out.println(
				"You will find you have a compass which mysterioulsy doest point north, but a distance to something...");
		System.out.println("Hint: try North,  East, South or West ");
		System.out.println("type help for additional info: ");

		Boolean playing = true;
		Random r = new Random();
		int treasurex = 0, treasurey = 0, trapx = 0, trapy = 0;
		do {
			treasurex = r.nextInt(10);
		} while (treasurex == 4);
		do {
			treasurey = r.nextInt(10);
		} while (treasurey == 4);
		do {
			trapx = r.nextInt(10);
		} while (trapx == 4);
		do {
			trapy = r.nextInt(10);
		} while (trapy == 4);

		Map map = new Map(treasurey, treasurex, trapx, trapy);
		Compass com = new Compass();
		Player play = new Player();
		Scanner sc = new Scanner(System.in);

		int intitalDist = com.findDistance(map.getPlayerxPos(), map.getPlayeryPos(), map.getTreasurexLoc(),
				map.getTreasureyLoc());
		System.out.println("The dial reads: " + intitalDist + "m");

		while (playing) {

			String direction = sc.next().toUpperCase();
			play.setDirection(direction);
			if (direction.equals("HELP")) {
				System.out.println(
						"The aim is to get to the treasure without falling into the trap\nEnter north, east, south or west and follow your compass to the treasure");
			} else if (direction.equals("NORTH") || direction.equals("SOUTH")) {
				map.setPlayeryPos(play.moveVerticle(map.getPlayeryPos()));
			} else if (direction.equals("EAST") || direction.equals("WEST")) {
				map.setPlayerxPos(play.moveHorizontal(map.getPlayerxPos()));
			} else {
				System.out.println("Error: please enter a valid direction, type help for additional info");
			}

			int danger = com.checkDanger(map.getPlayerxPos(), map.getPlayeryPos(), map.getTrapx(), map.getTrapy());
			int dist = com.findDistance(map.getPlayerxPos(), map.getPlayeryPos(), map.getTreasurexLoc(),
					map.getTreasureyLoc());
			System.out.println("The dial reads: " + dist + "m");

			if (dist == 0 || danger == 0) {
				playing = false;
				sc.close();
			}
		}
	}

}
