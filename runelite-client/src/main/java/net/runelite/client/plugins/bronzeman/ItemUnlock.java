package net.runelite.client.plugins.bronzeman;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Seth Davis
 * @Email <sethdavis321@gmail.com>
 * @Discord Reminisce#1707
 */
public class ItemUnlock
{

	@Getter(AccessLevel.PACKAGE)
	private final int itemId;

	@Getter(AccessLevel.PACKAGE)
	private long initTime;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private int locationY;

	ItemUnlock(int itemId)
	{
		this.itemId = itemId;
		this.locationY = -20;
		this.initTime = -1;
	}

	/**
	 * Starts the displaying of the item unlock
	 **/
	public void display()
	{
		this.initTime = System.currentTimeMillis();
	}

	/**
	 * Returns whether or not an items has been displayed as unlocked yet
	 **/
	public boolean displayed(int queue)
	{
		if (queue >= 2)
		{
			return System.currentTimeMillis() > initTime + (750);
		}
		return System.currentTimeMillis() > initTime + (5000);
	}

}
