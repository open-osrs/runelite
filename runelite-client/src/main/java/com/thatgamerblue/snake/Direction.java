package com.thatgamerblue.snake;

public enum Direction {
	UP(0, -1, "^"),
	DOWN(0, 1, "v"),
	LEFT(-1, 0, "<"),
	RIGHT(1, 0, ">");

	public int xOffset;
	public int yOffset;
	public String display;

	Direction(int xOff, int yOff, String display) {
		xOffset = xOff;
		yOffset = yOff;
		this.display = display;
	}
}
