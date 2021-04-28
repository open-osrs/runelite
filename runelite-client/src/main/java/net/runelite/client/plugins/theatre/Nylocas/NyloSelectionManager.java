/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Nylocas;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import lombok.Getter;
import lombok.Setter;
import net.runelite.client.ui.overlay.Overlay;

public class NyloSelectionManager extends Overlay
{
	@Getter
	private final NyloSelectionBox melee;

	@Getter
	private final NyloSelectionBox mage;

	@Getter
	private final NyloSelectionBox range;

	@Getter
	@Setter
	private boolean isHidden = true;

	@Getter
	private Rectangle meleeBounds = new Rectangle();

	@Getter
	private Rectangle rangeBounds = new Rectangle();

	@Getter
	private Rectangle mageBounds = new Rectangle();

	public NyloSelectionManager(NyloSelectionBox melee, NyloSelectionBox mage, NyloSelectionBox range)
	{
		this.mage = mage;
		this.melee = melee;
		this.range = range;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (isHidden)
		{
			return null;
		}

		Dimension meleeD = melee.render(graphics);
		graphics.translate(meleeD.width + 1, 0);
		Dimension rangeD = range.render(graphics);
		graphics.translate(rangeD.width + 1, 0);
		Dimension mageD = mage.render(graphics);
		graphics.translate(-meleeD.width - rangeD.width - 2, 0);

		meleeBounds = new Rectangle(getBounds().getLocation(), meleeD);
		rangeBounds = new Rectangle(new Point(getBounds().getLocation().x + meleeD.width + 1, getBounds().y), rangeD);
		mageBounds = new Rectangle(new Point(getBounds().getLocation().x + meleeD.width + 1 + rangeD.width + 1, getBounds().y), mageD);

		return new Dimension(meleeD.width + rangeD.width + mageD.width, Math.max(Math.max(meleeD.height, rangeD.height), mageD.height));
	}
}
