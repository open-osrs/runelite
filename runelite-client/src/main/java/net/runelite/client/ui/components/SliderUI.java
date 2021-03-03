package net.runelite.client.ui.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSliderUI;
import net.runelite.client.ui.ColorScheme;

public class SliderUI extends BasicSliderUI
{
	private final Color rangeColor = ColorScheme.BRAND_BLUE;
	private final BasicStroke stroke = new BasicStroke(2f);

	private transient boolean upperDragging;

	public SliderUI(JSlider b)
	{
		super(b);
	}

	public static ComponentUI createUI(JComponent c)
	{
		return new SliderUI((JSlider) c);
	}

	@Override
	protected void calculateThumbSize()
	{
		super.calculateThumbSize();
		thumbRect.setSize(thumbRect.width, thumbRect.height);
	}

	/**
	 * Creates a listener to handle track events in the specified slider.
	 */
	@Override
	protected TrackListener createTrackListener(JSlider slider)
	{
		return new RangeTrackListener();
	}

	@Override
	protected void calculateThumbLocation()
	{
		// Call superclass method for lower thumb location.
		super.calculateThumbLocation();

		// Adjust upper value to snap to ticks if necessary.
		if (slider.getSnapToTicks())
		{
			int upperValue = slider.getValue() + slider.getExtent();
			int snappedValue = upperValue;
			int majorTickSpacing = slider.getMajorTickSpacing();
			int minorTickSpacing = slider.getMinorTickSpacing();
			int tickSpacing = 0;

			if (minorTickSpacing > 0)
			{
				tickSpacing = minorTickSpacing;
			}
			else if (majorTickSpacing > 0)
			{
				tickSpacing = majorTickSpacing;
			}

			if (tickSpacing != 0)
			{
				// If it's not on a tick, change the value
				if ((upperValue - slider.getMinimum()) % tickSpacing != 0)
				{
					float temp = (float) (upperValue - slider.getMinimum()) / (float) tickSpacing;
					int whichTick = Math.round(temp);
					snappedValue = slider.getMinimum() + (whichTick * tickSpacing);
				}

				if (snappedValue != upperValue)
				{
					slider.setExtent(snappedValue - slider.getValue());
				}
			}
		}

		// Calculate upper thumb location.  The thumb is centered over its
		// value on the track.
		if (slider.getOrientation() == JSlider.HORIZONTAL)
		{
			int upperPosition = xPositionForValue(slider.getValue() + slider.getExtent());
			thumbRect.x = upperPosition - (thumbRect.width / 2);
			thumbRect.y = trackRect.y;

		}
		else
		{
			int upperPosition = yPositionForValue(slider.getValue() + slider.getExtent());
			thumbRect.x = trackRect.x;
			thumbRect.y = upperPosition - (thumbRect.height / 2);
		}
		slider.repaint();
	}

	/**
	 * Returns the size of a thumb.
	 * Parent method not use size from LaF
	 *
	 * @return size of trumb
	 */
	@Override
	protected Dimension getThumbSize()
	{
		return new Dimension(16, 16);
	}

	private Shape createThumbShape(int width, int height)
	{
		return new Ellipse2D.Double(0, 0, width, height);
	}

	@Override
	public void paintTrack(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		Stroke old = g2d.getStroke();
		g2d.setStroke(stroke);
		g2d.setPaint(ColorScheme.LIGHT_GRAY_COLOR);
		Color oldColor = ColorScheme.LIGHT_GRAY_COLOR;
		Rectangle trackBounds = trackRect;
		if (slider.getOrientation() == SwingConstants.HORIZONTAL)
		{
			g2d.drawLine(trackRect.x, trackRect.y + trackRect.height / 2,
				trackRect.x + trackRect.width, trackRect.y + trackRect.height / 2);
			int lowerX = thumbRect.width / 2;
			int upperX = thumbRect.x + (thumbRect.width / 2);
			int cy = (trackBounds.height / 2) - 2;
			g2d.translate(trackBounds.x, trackBounds.y + cy);
			g2d.setColor(rangeColor);
			g2d.drawLine(lowerX - trackBounds.x, 2, upperX - trackBounds.x, 2);
			g2d.translate(-trackBounds.x, -(trackBounds.y + cy));
			g2d.setColor(oldColor);
		}
		g2d.setStroke(old);
	}

	/**
	 * Overrides superclass method to do nothing.  Thumb painting is handled
	 * within the <code>paint()</code> method.
	 */
	@Override
	public void paintThumb(Graphics g)
	{
		Rectangle knobBounds = thumbRect;
		int w = knobBounds.width;
		int h = knobBounds.height;
		Graphics2D g2d = (Graphics2D) g.create();
		Shape thumbShape = createThumbShape(w - 1, h - 1);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(knobBounds.x, knobBounds.y);
		g2d.setColor(ColorScheme.BRAND_BLUE);
		g2d.fill(thumbShape);

		g2d.setColor(ColorScheme.DARK_GRAY_COLOR);
		g2d.draw(thumbShape);
		g2d.dispose();
	}

	/**
	 * Listener to handle mouse movements in the slider track.
	 */
	public class RangeTrackListener extends TrackListener
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			if (!slider.isEnabled())
			{
				return;
			}
			currentMouseX -= thumbRect.width / 2; // Because we want the mouse location correspond to middle of the "thumb", not left side of it.
			moveUpperThumb();
		}

		public void mousePressed(MouseEvent e)
		{
			if (!slider.isEnabled())
			{
				return;
			}

			currentMouseX = e.getX();
			currentMouseY = e.getY();

			if (slider.isRequestFocusEnabled())
			{
				slider.requestFocus();
			}

			boolean upperPressed = false;
			if (thumbRect.contains(currentMouseX, currentMouseY))
			{
				upperPressed = true;
			}

			if (upperPressed)
			{
				switch (slider.getOrientation())
				{
					case JSlider.VERTICAL:
						offset = currentMouseY - thumbRect.y;
						break;
					case JSlider.HORIZONTAL:
						offset = currentMouseX - thumbRect.x;
						break;
				}
				//upperThumbSelected = true;
				upperDragging = true;
				return;
			}

			upperDragging = false;
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			upperDragging = false;
			slider.setValueIsAdjusting(false);
			super.mouseReleased(e);
		}

		@Override
		public void mouseDragged(MouseEvent e)
		{
			if (!slider.isEnabled())
			{
				return;
			}

			currentMouseX = e.getX();
			currentMouseY = e.getY();

			if (upperDragging)
			{
				slider.setValueIsAdjusting(true);
				moveUpperThumb();

			}
		}

		@Override
		public boolean shouldScroll(int direction)
		{
			return false;
		}

		/**
		 * Moves the location of the upper thumb, and sets its corresponding  value in the slider.
		 */
		public void moveUpperThumb()
		{
			int thumbMiddle;
			if (slider.getOrientation() == JSlider.HORIZONTAL)
			{
				int halfThumbWidth = thumbRect.width / 2;
				int thumbLeft = currentMouseX - offset;
				int trackLeft = trackRect.x;
				int trackRight = trackRect.x + (trackRect.width - 1);
				int hMax = xPositionForValue(slider.getMaximum() -
					slider.getExtent());

				if (drawInverted())
				{
					trackLeft = hMax;
				}
				else
				{
					trackRight = hMax;
				}
				thumbLeft = Math.max(thumbLeft, trackLeft - halfThumbWidth);
				thumbLeft = Math.min(thumbLeft, trackRight - halfThumbWidth);

				setThumbLocation(thumbLeft, thumbRect.y);//setThumbLocation

				thumbMiddle = thumbLeft + halfThumbWidth;
				slider.setValue(valueForXPosition(thumbMiddle));
			}
		}
	}
}
