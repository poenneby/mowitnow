package mower.helper;

public class DirectionHelper {

	private static final String[] DIRECTIONS = { "N", "E", "S", "W" };

	public static String nextClockwise(String direction) {
		int directionPosition = directionPosition(direction);
		return directionPosition == DIRECTIONS.length-1 ? DIRECTIONS[0] : DIRECTIONS[directionPosition + 1];

	}

	public static String nextAntiClockwise(String direction) {
		int directionPosition = directionPosition(direction);
		return directionPosition == 0 ? DIRECTIONS[DIRECTIONS.length - 1] : DIRECTIONS[directionPosition - 1];
	}
	
	private static int directionPosition(String direction) {
		for (int i = 0; i < DIRECTIONS.length; i++) {
			if (direction.equals(DIRECTIONS[i])) {
				return i;
			}
		}
		return -1;
	}


}
