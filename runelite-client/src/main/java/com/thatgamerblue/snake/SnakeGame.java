package com.thatgamerblue.snake;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lombok.SneakyThrows;
import net.runelite.client.RuneLite;

public class SnakeGame {
	public static String[] arguments;
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 608;
	public static long currentRefreshInterval = 100;
	private static GameHandler gameHandler;
	private final Object redrawLock = new Object();
	private Component component;
	private Image imageBuffer;
	private boolean running = true;

	public void start(Component component) {
		this.component = component;
		gameHandler.reset();
		imageBuffer = component.createImage(component.getWidth(),
			component.getHeight());
		Thread thread = new Thread(this::runGameLoop);
		thread.start();
	}

	public void stop() throws Exception {
		int option = JOptionPane.showConfirmDialog(null,
			"You scored 15! Press Yes to launch OpenOSRS, press No to keep playing snake.",
			"OpenOSRS Snake", JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.YES_OPTION) {
			running = false;
			Component c = component;
			while (c != null) {
				c.setVisible(false);
				c = c.getParent();
			}
			RuneLite.oldMain(arguments);
		}
	}

	@SneakyThrows
	private void runGameLoop() {
		// update the game repeatedly
		while (running) {
			long durationMs = redraw();
			try {
				Thread.sleep(Math.max(0, currentRefreshInterval - durationMs));
			} catch (InterruptedException e) {
			}
		}
	}

	private long redraw() throws Exception {

		long t = System.currentTimeMillis();

		// At this point perform changes to the model that the component will
		// redraw

		updateModel();

		// draw the model state to a buffered image which will get
		// painted by component.paint().
		drawModelToImageBuffer();

		// asynchronously signals the paint to happen in the awt event
		// dispatcher thread
		component.repaint();

		// use a lock here that is only released once the paintComponent
		// has happened so that we know exactly when the paint was completed and
		// thus know how long to pause till the next redraw.
		waitForPaint();

		// return time taken to do redraw in ms
		return System.currentTimeMillis() - t;
	}

	private void updateModel() throws Exception {
		gameHandler.update();
	}

	private void drawModelToImageBuffer() {
		drawModel(imageBuffer.getGraphics());
	}

	private void drawModel(Graphics g) {
		g.setColor(component.getBackground());
		g.fillRect(0, 0, component.getWidth(), component.getHeight());
		g.setColor(component.getForeground());
		gameHandler.draw(g);
	}

	private void waitForPaint() {
		try {
			synchronized (redrawLock) {
				redrawLock.wait();
			}
		} catch (InterruptedException e) {
		}
	}

	private void resume() {
		synchronized (redrawLock) {
			redrawLock.notify();
		}
	}

	public void paint(Graphics g) {
		// paint the buffered image to the graphics
		g.drawImage(imageBuffer, 0, 0, component);

		// resume the game loop
		resume();
	}

	public static class SnakeComponent extends JPanel {

		private final SnakeGame game;

		public SnakeComponent(SnakeGame game) {
			this.game = game;
		}

		@Override
		protected void paintComponent(Graphics g) {
			game.paint(g);
		}
	}

	public static void main(String[] args) {
		arguments = args;
		java.awt.EventQueue.invokeLater(() -> {
			SnakeGame game = new SnakeGame();
			SnakeComponent component = new SnakeComponent(game);

			gameHandler = new GameHandler(game);

			component.setPreferredSize(new java.awt.Dimension(FRAME_WIDTH, FRAME_HEIGHT));
			JFrame frame = new JFrame();

			frame.setTitle("OpenOSRS Snake");
			frame.setResizable(false);

			frame.addKeyListener(gameHandler);
			frame.setFocusable(true);
			frame.setFocusTraversalKeysEnabled(false);

			frame.setLayout(new BorderLayout());
			frame.getContentPane().add(component, BorderLayout.CENTER);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.pack();

			game.start(component);
		});
	}
}
