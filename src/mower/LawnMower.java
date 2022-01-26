package mower;

import mower.helper.DirectionHelper;

public class LawnMower {

	private int xPosition;
	private int yPosition;
	private String direction;
	private Lawn lawn;

	public LawnMower(int xPosition, int yPosition, String direction, Lawn lawn) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.direction = direction;
		this.lawn = lawn;

	}

	public String position() {
		return String.format("%d %d %s", xPosition, yPosition, direction);
	}

	public void turnRight() {
		this.direction = DirectionHelper.nextClockwise(this.direction);
	}

	public void turnLeft() {
		this.direction = DirectionHelper.nextAntiClockwise(this.direction);
	}

	public void forward() {
		if (this.direction.equals("N")) {
			if (this.yPosition < this.lawn.length) {
				this.yPosition++;
			}
		} else if (this.direction.equals("E")) {
			if (this.xPosition < this.lawn.width) {
				this.xPosition++;
			}
		} else if (this.direction.equals("S")) {
			if (this.yPosition > 0) {
				this.yPosition--;
			}
		} else if (this.direction.equals("W")) {
			if (this.xPosition > 0) {
				this.xPosition--;
			}
		}
	}

}
