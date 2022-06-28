package com.thatgamerblue.snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class GameHandler implements KeyListener {
	private static final int DEFAULT_REFRESH_INTERVAL = 100;
	private static final int PX_PER_TILE = 16;
	private static final int WIDTH = SnakeGame.FRAME_WIDTH / PX_PER_TILE;
	private static final int HEIGHT = SnakeGame.FRAME_HEIGHT / PX_PER_TILE;
	private static final int MIDDLE_X = WIDTH / 2;
	private static final int MIDDLE_Y = HEIGHT / 2;
	private static final Color SNAKE_HEAD_COLOR = Color.GREEN;
	private static final Color SNAKE_BODY_COLOR = new Color(0, 128, 0);
	private static final Color APPLE_COLOR = Color.RED;
	private static final Font HEAD_FONT = new Font("Arial", Font.BOLD, 12);
	private static final Font FONT = new Font("Arial", Font.BOLD, 16);

	private final Set<Integer> keysPressed = new HashSet<>();
	private Direction pendingDirection = Direction.LEFT;
	private Direction direction = Direction.LEFT;
	private SnakePart head;
	private SnakePart apple = new SnakePart();
	private int score;

	private SnakeGame game;

	public GameHandler(SnakeGame game) {
		this.game = game;
	}

	public void reset() {
		if (score != 0) {
			JOptionPane.showMessageDialog(null, "You died! Your score: " + score, "OpenOSRS Snake", JOptionPane.INFORMATION_MESSAGE);
		}
		head = new SnakePart();
		SnakePart current = head;
		current.x = MIDDLE_X;
		current.y = MIDDLE_Y;

		for (int i = 0; i < 4; i++) {
			current.next = new SnakePart();
			current = current.next;
			current.x = MIDDLE_X + i + 1;
			current.y = MIDDLE_Y;
		}

		direction = Direction.LEFT;
		pendingDirection = Direction.LEFT;
		createNewApple();
		score = 0;
		SnakeGame.currentRefreshInterval = DEFAULT_REFRESH_INTERVAL;
	}

	public void update() throws Exception {
		processInput();
		direction = pendingDirection;
		SnakePart newHead = new SnakePart();
		newHead.x = head.x + direction.xOffset;
		newHead.y = head.y + direction.yOffset;
		newHead.next = head;
		head = newHead;

		boolean ateApple = false;
		if (head.x == apple.x && head.y == apple.y) {
			createNewApple();
			ateApple = true;
			score++;
			SnakeGame.currentRefreshInterval = Math.max(50, DEFAULT_REFRESH_INTERVAL - score);
		}

		if (!ateApple) {
			SnakePart current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}

		if (head.x < 0 || head.x >= WIDTH || head.y < 0 || head.y >= HEIGHT) {
			reset();
		}

		SnakePart current = head.next;
		while (current.next != null) {
			if (current.x == head.x && current.y == head.y) {
				reset();
				break;
			}
			current = current.next;
		}
	}

	private Point findAppleSpawn() {
		Set<Point> used = new HashSet<>();
		for (SnakePart part = head; part != null; part = part.next) {
			used.add(new Point(part.x, part.y));
		}
		int x, y;
		do {
			x = (int) (Math.random() * (WIDTH - 2)) + 1;
			y = (int) (Math.random() * (HEIGHT - 2)) + 1;
		} while (used.contains(new Point(x, y)));
		return new Point(x, y);
	}

	private void createNewApple() {
		Point spawn = findAppleSpawn();
		apple.x = spawn.x;
		apple.y = spawn.y;
	}

	private void processInput() {
		if (keysPressed.contains(KeyEvent.VK_UP)) {
			if (direction != Direction.DOWN) {
				pendingDirection = Direction.UP;
			}
		} else if (keysPressed.contains(KeyEvent.VK_DOWN)) {
			if (direction != Direction.UP) {
				pendingDirection = Direction.DOWN;
			}
		} else if (keysPressed.contains(KeyEvent.VK_LEFT)) {
			if (direction != Direction.RIGHT) {
				pendingDirection = Direction.LEFT;
			}
		} else if (keysPressed.contains(KeyEvent.VK_RIGHT)) {
			if (direction != Direction.LEFT) {
				pendingDirection = Direction.RIGHT;
			}
		}
	}





	public void draw(Graphics g) {
		// draw snake head
		g.setColor(SNAKE_HEAD_COLOR);
		SnakePart current = head;
		while (current != null) {
			g.fillRect(current.x * PX_PER_TILE, current.y * PX_PER_TILE, PX_PER_TILE, PX_PER_TILE);
			g.setColor(Color.BLACK);
			g.drawRect(current.x * PX_PER_TILE, current.y * PX_PER_TILE, PX_PER_TILE, PX_PER_TILE);
			if (current == head) {
				g.setFont(HEAD_FONT);
				g.drawString(direction.display, head.x * PX_PER_TILE + 6, (head.y + 1) * PX_PER_TILE - 3);
			}

			current = current.next;
			g.setColor(SNAKE_BODY_COLOR);
		}
		g.setColor(APPLE_COLOR);
		g.fillRect(apple.x * PX_PER_TILE, apple.y * PX_PER_TILE, PX_PER_TILE, PX_PER_TILE);
		g.setColor(Color.BLACK);
		g.drawRect(apple.x * PX_PER_TILE, apple.y * PX_PER_TILE, PX_PER_TILE, PX_PER_TILE);

		g.setColor(Color.BLACK);
		g.setFont(FONT);
		g.drawString("Score: " + score, SnakeGame.FRAME_WIDTH - 100, SnakeGame.FRAME_HEIGHT - 10);
	}




	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		keysPressed.add(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keysPressed.remove(e.getKeyCode());
	}
}
